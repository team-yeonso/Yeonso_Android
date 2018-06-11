package dsm.yeonso.Personal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.RadioButton;

import dsm.yeonso.R;
import dsm.yeonso.SignUpActivity;

public class Personal1Activity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before;
    private ImageButton next;
    private RadioButton boy;
    private RadioButton girl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal1);

        before = (ImageButton) findViewById(R.id.genderActivity_button_before);
        next = (ImageButton) findViewById(R.id.genderActivity_next);
        boy = (RadioButton) findViewById(R.id.genderActivity_radioButton_boy);
        girl = (RadioButton) findViewById(R.id.genderActivity_radioButton_girl);

        before.setOnClickListener(view -> {
            intent = new Intent(getApplicationContext(), SignUpActivity.class);
            startActivity(intent);
        });

        next.setOnClickListener(v -> {
            if((boy.isChecked()==false) && (girl.isChecked()==false)) {
                Snackbar.make(v, "성별을 선택해주세요.",Snackbar.LENGTH_SHORT).show();
            } else {
                // TODO: 2018-05-09 통신
                intent = new Intent(getApplicationContext(), Personal2Activity.class);
                startActivity(intent);
            }

        });


    }
}
