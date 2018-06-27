package dsm.yeonso.Personal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Spinner;

import dsm.yeonso.Adapter.Spinner_job;
import dsm.yeonso.R;

public class Personal5Activity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before, next;
    private Spinner first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal5);

        before = (ImageButton) findViewById(R.id.jobActivity_imageButton_before);
        next = (ImageButton) findViewById(R.id.jobActivity_imageButton_next);
        first = (Spinner) findViewById(R.id.jobActivity_job_first);
        second = (Spinner) findViewById(R.id.jobActivity_job_second);

        Spinner_job x = new Spinner_job(first, second,this);
        x.setSpinner();

        next.setOnClickListener(v->{
            if(first.getSelectedItem().toString().equals("대분류")){
                Snackbar.make(v, "직업을 선택해주세요",Snackbar.LENGTH_SHORT).show();
                return;
            }
            intent = new Intent(this, Personal6Activity.class);
            startActivity(intent);
        });

        before.setOnClickListener(v->{
            finish();
        });

    }
}
