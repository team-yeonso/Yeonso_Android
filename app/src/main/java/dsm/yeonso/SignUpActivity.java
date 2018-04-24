package dsm.yeonso;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static dsm.yeonso.ApiInterface.API_URL;

public class SignUpActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName().trim();

    private Intent intent;
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

        // TODO: 2018-04-24 **비밀번호 정규식
        // TODO: 2018-04-24 **인증코드 전송 - 통신, 버튼 눌렀을때 처리되는 화면
        // TODO: 2018-04-24 **인증코드 확인

        // TODO: 2018-04-10 시간이 된다면 비밀번호와 비밀번호 확인을 실시간으로 비교해주는 기능을 추가하면 좋을듯

        // TODO: 2018-04-23 retrofit 코드 기존과 다르게 수정했으니 오류 발생 시 확인 바람
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.length()==0) {
                    Log.d(TAG, "email is empty");
                    Snackbar.make(view, "이메일을 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    }).show();
                } else if (emailCodeCheck.length()==0) {
                    Log.d(TAG, "email code check is empty");
                    Snackbar.make(view, "인증번호를 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    }).show();
                } else if (pw.length()==0) {
                    Log.d(TAG, "pw is empty");
                    Snackbar.make(view, "비밀번호를 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    }).show();
                } else if (pwCheck.length()==0) {
                    Log.d(TAG, "pwCheck is empty");
                    Snackbar.make(view, "비밀번호 확인을 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    }).show();
                } else {
                    retrofit = new Retrofit.Builder()
                            .baseUrl(API_URL)
                            .build();
                    apiInterface = retrofit.create(ApiInterface.class);

                    Call<Void> call = apiInterface.signUp(email.getText().toString(), pw.getText().toString());
                    call.enqueue(new Callback<Void>() {
                        @Override
                        public void onResponse(Call<Void> call, Response<Void> response) {
                            int statusCode = response.code();
                            if (statusCode == 200) {
                                // ok
                            } else if (statusCode == 201) {
                                // 회원가입 성공
                                finish();
                                intent = new Intent(SignUpActivity.this, SignInActivity.class);
                                startActivity(intent);
                            } else if (statusCode == 400) {
                                // 잘못된 요청
                            } else if (statusCode == 401) {
                                //Unauthorized
                            } else if (statusCode == 403) {
                                //Forbidden
                            } else if (statusCode == 404) {
                                // Not Found
                            }
                        }

                        @Override
                        public void onFailure(Call<Void> call, Throwable t) {
                            Log.d(TAG, "onFailure: " + t.getMessage());
                        }
                    });
                }
            }
        });
    }

}
