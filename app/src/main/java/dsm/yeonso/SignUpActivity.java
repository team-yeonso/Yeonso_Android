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

import retrofit2.Call;
import retrofit2.Retrofit;

import static dsm.yeonso.ApiInterface.API_URL;

public class SignUpActivity extends AppCompatActivity {
    private Retrofit retrofit;
    private ApiInterface apiInterface;
    private EditText email;
    private EditText emailCodeCheck; // 인증번호 입력
    private EditText pw;
    private EditText pwCheck;
    private Button AuthCodeSend; // 아이디(=이메일) 인증 코드 전송
    private Button AuthCodeCheck; // 아이디(=이메일) 인증 코드 전송
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = (EditText) findViewById(R.id.signUpActivity_editText_email);
        emailCodeCheck = (EditText) findViewById(R.id.signUpActivity_editText_authCode_check);
        pw = (EditText) findViewById(R.id.signUpActivity_editText_pw);
        pwCheck = (EditText) findViewById(R.id.signUpActivity_editText_pw_check);
        AuthCodeSend = (Button) findViewById(R.id.signUpActivity_button_auth_code_send);
        AuthCodeCheck = (Button) findViewById(R.id.signUpActivity_button_authCode_check);
        signUp = (Button) findViewById(R.id.signUpActivity_button_signUp);

//        onClick(signUp, SignInActivity.class);

        // TODO: 2018-04-10 시간이 된다면 비밀번호와 비밀번호 확인을 실시간으로 비교해주는 기능을 추가하면 좋을듯

        // TODO: 2018-04-23 retrofit 코드 기존과 다르게 수정했으니 오류 발생 시 확인 바람 
        signUp.setOnClickListener(new View.OnClickListener() {
            String email;
            String pw;
            @Override
            public void onClick(View view) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(API_URL)
                        .build();
                apiInterface = retrofit.create(ApiInterface.class);

                Call<Void> call = apiInterface.signUp(email,pw);

            }
        });
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
