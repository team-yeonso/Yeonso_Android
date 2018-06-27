package dsm.yeonso.Personal;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import dsm.yeonso.R;

public class Personal7Activity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before, next;
    private ImageView camara, input;

    final int PICK_FROM_ALBUM = 1;
    final int CROP_FROM_IMAGE = 2;
    private Uri ImageUri;
    private String absoultePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal7);

        before = (ImageButton) findViewById(R.id.pictureActivity_imageButton_before);
        next = (ImageButton) findViewById(R.id.pictureActivity_imageButton_next);
        camara = (ImageView) findViewById(R.id.pictureActivity_imageView_camara);
        input = (ImageView) findViewById(R.id.pictureActivity_imageView_input);

        input.setOnClickListener(v->{
            //사진 등록하는 화면 열어준다.
            Intent picture_intent = new Intent(Intent.ACTION_PICK);
            picture_intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);
            startActivityForResult(picture_intent, PICK_FROM_ALBUM);
        });

        next.setOnClickListener(v->{
            //사진 등록되어있나 확인 후
            //데이터베이스에 등록(? insert)
            if(absoultePath == null){
                Snackbar.make(v, "사진을 등록해주세요.",Snackbar.LENGTH_SHORT).show();
                return;
            }else{
                //
                intent = new Intent(this, Personal8Activity.class);
                startActivity(intent);
            }
        });

        before.setOnClickListener(v->{
            finish();
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode != RESULT_OK) return;

        switch (requestCode){
            case PICK_FROM_ALBUM : {
                //앨범 선택
                ImageUri = data.getData();

                Intent intentss = new Intent("com.android.camera.action.CROP");
                intentss.setDataAndType(ImageUri, "image/*");

                //일단 crop 200*200으로 지정
                intentss.putExtra("outputX",200);
                intentss.putExtra("outputY",200);
                intentss.putExtra("aspectX",1);
                intentss.putExtra("aspectY",1);
                intentss.putExtra("scale",true);
                intentss.putExtra("return-data",true);
                startActivityForResult(intentss, CROP_FROM_IMAGE);
                break;
            }
            case CROP_FROM_IMAGE : {
                //앨범 크롭
                final Bundle extras = data.getExtras();
                String filePath = Environment.getExternalStorageDirectory().getAbsolutePath()+
                        "/SmartWheel/"+ System.currentTimeMillis() + ".jpg";

                if(extras != null){
                    Bitmap photo = extras.getParcelable("data");

                    input.setImageBitmap(photo);
                    camara.setVisibility(View.INVISIBLE);
                    //stroge에 저장하는 함수
                    storeCropImage(photo, filePath);
                    absoultePath = filePath;
                    break;
                }

                File f = new File(ImageUri.getPath());
                if(f.exists()){
                    f.delete();
                }
            }
        }
    }

    //BitBap을 저장하는 부분
    private void storeCropImage(Bitmap bitmap, String filePath){
        String dirPath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/SmartWheel";
        File directory_SmartWheel = new File(dirPath);

        if(!directory_SmartWheel.exists()) directory_SmartWheel.mkdir();

        File copyFile = new File(filePath);
        BufferedOutputStream out = null;

        try{
            copyFile.createNewFile();
            out = new BufferedOutputStream(new FileOutputStream(copyFile));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);

            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                    Uri.fromFile(copyFile)));

            out.flush();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
