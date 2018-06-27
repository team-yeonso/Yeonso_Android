package dsm.yeonso.Personal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.RadioButton;

import dsm.yeonso.R;

public class Personal4Activity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before, next;
    private RadioButton yes;
    private RadioButton no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal4);

        yes = (RadioButton) findViewById(R.id.marriedActivity_radioButton_yes);
        no = (RadioButton) findViewById(R.id.marriedActivity_radioButton_no);
        before = (ImageButton) findViewById(R.id.marriedActivity_imageButton_before);
        next = (ImageButton) findViewById(R.id.marriedActivity_imageButton_next);

        next.setOnClickListener(v->{
            if((yes.isChecked()==false) && (no.isChecked()==false)) {
                Snackbar.make(v, "선택해주세요.",Snackbar.LENGTH_SHORT).show();
            } else {
                intent = new Intent(this, Personal5Activity.class);
                startActivity(intent);
            }
        });

        before.setOnClickListener(v->{
            finish();
        });
    }
}

