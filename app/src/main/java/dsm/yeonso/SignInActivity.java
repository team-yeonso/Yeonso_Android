package dsm.yeonso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private Intent intent;
    private EditText email;
    private EditText pw;
    private Button signIn;
    private Button signUp;
    private Button findId;
    private Button findPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = (EditText) findViewById(R.id.signInActivity_editText_email);
        pw = (EditText) findViewById(R.id.signInActivity_editText_pw);
        signIn = (Button) findViewById(R.id.signInActivity_button_signIn);
        signUp = (Button) findViewById(R.id.signInActivity_button_signUp);
        findId = (Button) findViewById(R.id.signInActivity_button_find_id);
        findPw = (Button) findViewById(R.id.signInActivity_button_find_pw);

        onClick(signUp, SignUpActivity.class);

        // TODO: 2018-04-10 로그인 3회 실패시 제한
        // TODO: 2018-04-10 통신할 때, inputNullCheck함수 사용해야 함
    }

    public void inputNullCheck() {
        if (email.getText().toString() == null) {
            Toast.makeText(this, "이메일을 입력해주세요", Toast.LENGTH_SHORT).show();
        } else if (pw.getText().toString() == null) {
            Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show();
        }
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
