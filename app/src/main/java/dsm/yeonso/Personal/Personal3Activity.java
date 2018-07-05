package dsm.yeonso.Personal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageButton;

import dsm.yeonso.R;

public class Personal3Activity extends AppCompatActivity {

    private EditText height, weight;
    private Intent intent;
    private ImageButton before, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal3);

        height = (EditText) findViewById(R.id.bodySizeActivity_editText_height);
        weight = (EditText) findViewById(R.id.bodySizeActivity_editText_weight);
        before = (ImageButton) findViewById(R.id.bodySizeActivity_imageButton_before);
        next = (ImageButton) findViewById(R.id.bodySizeActivity_imageButton_next);

        before.setOnClickListener(v->{
            finish();
        });

        next.setOnClickListener(v->{
            if(TextUtils.isEmpty(height.getText()) || TextUtils.isEmpty(weight.getText())){
                Snackbar.make(v, "빈칸을 입력해 주세요",Snackbar.LENGTH_SHORT).show();
            }else {
                intent = new Intent(this, Personal4Activity.class);
                startActivity(intent);
            }

        });
    }

}
