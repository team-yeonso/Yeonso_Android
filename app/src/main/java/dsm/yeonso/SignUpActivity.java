package dsm.yeonso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    private EditText email;
    private EditText pw;
    private EditText pwCheck;
    private EditText emailCodeCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        email = findViewById(R.id.signUpActivity_editText_email);
        pw = findViewById(R.id.signUpActivity_editText_pw);
        pwCheck = findViewById(R.id.signUpActivity_editText_pw_check);
        emailCodeCheck = findViewById(R.id.signUpActivity_editText_eamil_codeCheck);

    }
}
