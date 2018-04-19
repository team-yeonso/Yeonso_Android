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
    private TextView findPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = (EditText) findViewById(R.id.signInActivity_editText_email);
        pw = (EditText) findViewById(R.id.signInActivity_editText_pw);
        signIn = (Button) findViewById(R.id.signInActivity_button_signIn);
        signUp = (Button) findViewById(R.id.signInActivity_button_signUp);
        findPw = (TextView) findViewById(R.id.signInActivity_textView_find_pw);

        // TODO: 2018-04-10 로그인 3회 실패시 제한
        // TODO: 2018-04-10 통신할 때, inputNullCheck함수 사용해야 함
    }
}
