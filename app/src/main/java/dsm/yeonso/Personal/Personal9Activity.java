package dsm.yeonso.Personal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import dsm.yeonso.MainActivity;
import dsm.yeonso.R;
import dsm.yeonso.SignUpActivity;

public class Personal9Activity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before, next;
    private EditText input;
    private TextView length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal9);

        before = (ImageButton) findViewById(R.id.PRActivity_imageButton_before);
        next = (ImageButton) findViewById(R.id.PRActivity_imageButton_next);
        input = (EditText) findViewById(R.id.PRActivity_editText_text);
        length = (TextView) findViewById(R.id.PRActivity_Textview_length);

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                length.setText(String.valueOf(charSequence.length()));
            }
            @Override
            public void afterTextChanged(Editable editable) {}
        });

        next.setOnClickListener(v ->{
            if(TextUtils.isEmpty(input.getText())){
                Snackbar.make(v, "빈칸을 채워주세요.",Snackbar.LENGTH_SHORT).show();
            }else{
                //
                startActivity(new Intent(this, MainActivity.class));
            }
        });

        before.setOnClickListener(v->{
            finish();
        });

    }
}
