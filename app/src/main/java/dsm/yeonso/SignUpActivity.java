package dsm.yeonso;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SignUpActivity extends AppCompatActivity {

    private EditText email;
    private EditText pw;
    private EditText pwCheck;
    private EditText emailCodeCheck;
    private Button emailAuth;
    private Button emailCode;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_sign_up_background);

//        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.activity_sign_up,null);

        // TODO: 2018-04-11 LayoutInflater 개념 공부하기 북마크 참고
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.activity_sign_up, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        addContentView(linearLayout, layoutParams);

//        email = findViewById(R.id.signUpActivity_editText_email);
//        pw = findViewById(R.id.signUpActivity_editText_pw);
//        pwCheck = findViewById(R.id.signUpActivity_editText_pw_check);
//        emailCodeCheck = findViewById(R.id.signUpActivity_editText_eamil_codeCheck);
//        emailAuth = findViewById(R.id.signUpActivity_button_email_authentication);
//        emailCode = findViewById(R.id.signUpActivity_button_email_code);
//        signUp = findViewById(R.id.signUpActivity_button_signUp);
//
//        onClick(signUp, SignInActivity.class);

        // TODO: 2018-04-10 시간이 된다면 비밀번호와 비밀번호 확인을 실시간으로 비교해주는 기능을 추가하면 좋을듯
    }

    public void onClick(Button button, final Class neededClass) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), neededClass);
                startActivity(intent);
            }
        });
    }
}
