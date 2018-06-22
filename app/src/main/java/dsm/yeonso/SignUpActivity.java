package dsm.yeonso;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.HashMap;
import java.util.Map;

import dsm.yeonso.Network.ApiInterface;
import dsm.yeonso.Network.SignUpRequest;
import dsm.yeonso.Personal.Personal1Activity;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static dsm.yeonso.Network.ApiInterface.API_URL;

public class SignUpActivity extends AppCompatActivity implements ErrorMessage {

    private String TAG = getClass().getSimpleName().trim();
    private Intent intent;
    private Retrofit retrofit;
    private ApiInterface apiInterface;
    private EditText email;
    private EditText pw;
    private EditText pwCheck;
    private EditText name;
    private EditText authNumber;
    private Button sendAuthNumber;
    private Button doneSignUp;
    private RelativeLayout signUpLayout;
    private RelativeLayout authLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpLayout = findViewById(R.id.signUpLayout);
        email = findViewById(R.id.signUpActivity_editText_email);
        pw = findViewById(R.id.signUpActivity_editText_pw);
        pwCheck = findViewById(R.id.signUpActivity_editText_pw_check);
        name = findViewById(R.id.name);
        sendAuthNumber = findViewById(R.id.sendAuthNumber);
        authLayout = findViewById(R.id.authLayout);
        authNumber = findViewById(R.id.authNumber);
        doneSignUp = findViewById(R.id.doneSignUp);

        // TODO: 2018-04-24 **비밀번호 정규식
        // TODO: 2018-04-24 **인증코드 전송 - 통신, 버튼 눌렀을때 처리되는 화면
        // TODO: 2018-04-24 **인증코드 확인

        // TODO: 2018-04-10 시간이 된다면 비밀번호와 비밀번호 확인을 실시간으로 비교해주는 기능을 추가하면 좋을듯

        authLayout.setVisibility(View.GONE);
        doneSignUp.setVisibility(View.GONE);

        // TODO: 2018-04-23 retrofit 코드 기존과 다르게 수정했으니 오류 발생 시 확인 바람
        sendAuthNumber.setOnClickListener(v -> {
            if (email.length() == 0) {
                Log.d(TAG, "email is empty");
                Snackbar.make(v, "이메일을 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
            } else if (pw.length() == 0) {
                Log.d(TAG, "pw is empty");
                Snackbar.make(v, "비밀번호를 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
            } else if (pwCheck.length() == 0) {
                Log.d(TAG, "pwCheck is empty");
                Snackbar.make(v, "비밀번호 확인을 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
            } else if (name.length() == 0) {
                Log.d(TAG, "name is empty");
                Snackbar.make(v, "이름을 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
            } else {
                Log.d(TAG, "retrofit start");
                retrofit = new Retrofit.Builder()
                        .baseUrl(API_URL)
                        .build();
                apiInterface = retrofit.create(ApiInterface.class);

                Log.d(TAG, "retrofit call");
                Log.d(TAG, email.getText().toString());
                Log.d(TAG, name.getText().toString());
                Log.d(TAG, pw.getText().toString());
//                Call<Void> call = apiInterface.signUp(email.getText().toString(), name.getText().toString(), pw.getText().toString());
                Map<String, String> map = new HashMap<>();
                map.put("email", email.getText().toString());
                map.put("name", name.getText().toString());
                map.put("password", pw.getText().toString());
//                RequestBody body = RequestBody.create(MediaType.parse("application/json"), map.toString());
//                Call<Void> call = apiInterface.signUp(map);
//                SignUpRequest body = RequestBody.create(MediaType.parse("application/json"),)
                Call<Void> call = apiInterface.signUp(new SignUpRequest("thgus4618@naver.com", "박소현", "12345"));
                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        Log.d(TAG, "onResponse: success");
                        int statusCode = response.code();
                        Log.d(TAG, "onResponse: " + String.valueOf(statusCode));
                        if (statusCode == 201) {
                            Log.d(TAG, "statusCode is 201");
                            signUpLayout.setVisibility(View.GONE);
                            authLayout.setVisibility(View.VISIBLE);
                            sendAuthNumber.setVisibility(View.GONE);
                            doneSignUp.setVisibility(View.VISIBLE);
//                            intent = new Intent(SignUpActivity.this, SignInActivity.class);
//                            startActivity(intent);
                            doneSignUp.setOnClickListener(view -> {
                                if (authNumber.length() == 0) {
                                    Log.d(TAG, "name is empty");
                                    Snackbar.make(view, "인증번호를 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                        }
                                    }).show();
                                } else {
//                                    retrofit = new Retrofit.Builder()
//                                            .baseUrl(API_URL)
//                                            .build();
//                                    apiInterface = retrofit.create(ApiInterface.class);
//
//                                    Call<Void> call1 = apiInterface.signUp(authNumber.getText().toString());
//                                    call1.enqueue(new Callback<Void>() {
//                                        @Override
//                                        public void onResponse(Call<Void> call, Response<Void> response) {
//                                            int statusCode = response.code();
//                                            if (statusCode == 200) {
//                                                // 회원가입 성공
//                                                finish();
//                                                intent = new Intent(SignUpActivity.this, Personal1Activity.class);
//                                                startActivity(intent);
//                                            } else if (statusCode == ERROR_TYPE_INVALID_REQUEST) {
//                                            } else if (statusCode == ERROR_TYPE_UNAUTHORIZED) {
//                                            } else if (statusCode == ERROR_TYPE_FORBIDDEN) {
//
//                                            }
//                                        }
//
//                                        @Override
//                                        public void onFailure(Call<Void> call, Throwable t) {
//                                            Log.d(TAG, "onFailure: " + t.getMessage());
//                                        }
//                                    });
                                }
                            });
                        } else if (statusCode == ERROR_TYPE_INVALID_REQUEST) {
                            Log.e(TAG, String.valueOf(ERROR_TYPE_INVALID_REQUEST));
                        } else if (statusCode == ERROR_TYPE_UNAUTHORIZED) {
                            Log.e(TAG, String.valueOf(ERROR_TYPE_UNAUTHORIZED));
                        } else if (statusCode == ERROR_TYPE_FORBIDDEN) {
                            Log.e(TAG, String.valueOf(ERROR_TYPE_FORBIDDEN));
                        } else if (statusCode == ERROR_TYPE_NOT_FOUND) {
                            Log.e(TAG, String.valueOf(ERROR_TYPE_NOT_FOUND));
                        }
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());
                    }
                });
            }
        });
    }

}
