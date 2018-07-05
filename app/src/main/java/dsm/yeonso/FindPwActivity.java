package dsm.yeonso;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class FindPwActivity extends AppCompatActivity {

    private ImageButton back;
    private Button search;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_pw);

        back = (ImageButton) findViewById(R.id.findPw_back);
        search = (Button) findViewById(R.id.findPw_search);
        text = (EditText) findViewById(R.id.findPw_editText);

        back.setOnClickListener(v -> {
            finish();
        });

        search.setOnClickListener(v -> {
            if(TextUtils.isEmpty(text.getText().toString().trim())){
                Snackbar.make(v, "빈칸을 채워주세요.",Snackbar.LENGTH_SHORT).show();
                return;
            }
            CustomDialog customDialog = new CustomDialog(this);
            customDialog.show();
        });
    }
}
