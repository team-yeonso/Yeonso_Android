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
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SignInActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName().trim();

    private Intent intent;
    private Retrofit retrofit;
    private ApiInterface apiInterface;
    private EditText email;
    private EditText pw;
    private Button signIn;
    private Button signUp;
    private TextView findPw;
    private TextView findId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = (EditText) findViewById(R.id.signInActivity_editText_email);
        pw = (EditText) findViewById(R.id.signInActivity_editText_pw);
        signIn = (Button) findViewById(R.id.signInActivity_button_signIn);
        signUp = (Button) findViewById(R.id.signInActivity_button_signUp);
        findPw = (TextView) findViewById(R.id.signInActivity_textView_find_pw);
        findId = (TextView) findViewById(R.id.signInActivity_textView_find_id);

        // TODO: 2018-05-15 로그인 1회 실패하면 (*로그인 lock : 30s)
        // TODO: 2018-05-15 로그인 3회 실패하면 문구가 뜨면서 30s, 29s, 28s로 줄어든다.

        signIn.setOnClickListener(view -> {
            if (email.length() == 0) {
                Log.d(TAG, "email is empty");
                Snackbar.make(view, "이메일을 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                }).show();
            } else if (pw.length() == 0) {
                Log.d(TAG, "pw is empty");
                Snackbar.make(view, "비밀번호를 입력해주세요.", Snackbar.LENGTH_LONG).setAction("YES", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
            } else {
                retrofit = new Retrofit.Builder()
                        .baseUrl(ApiInterface.API_URL)
                        .build();
                apiInterface = retrofit.create(ApiInterface.class);

                Call<Void> call = apiInterface.signIn(email.getText().toString(), pw.getText().toString());
                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        int statusCode = response.code();
                        if (statusCode == 201) {
                            // created
                            finish();
                            intent = new Intent(SignInActivity.this, MainActivity.class);
                            startActivity(intent);
                        } else if (statusCode == 400) {
                            // 로그인 실패
                        } else if (statusCode == 401) {
                            // unauthorized
                        } else if (statusCode == 403) {
                            // forbidden
                        } else if (statusCode == 404) {
                            // not found
                        }
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {

                    }
                });
            }
        });

        signUp.setOnClickListener(v -> {
            intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
        });

        findId.setOnClickListener(v -> {
            intent = new Intent(SignInActivity.this, FindIdActivity.class);
            startActivity(intent);
        });

        findPw.setOnClickListener(v -> {
            intent = new Intent(SignInActivity.this, FindPwActivity.class);
            startActivity(intent);
        });


    }
}
