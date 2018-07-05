package dsm.yeonso.Personal;

import android.content.Intent;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

import dsm.yeonso.R;

public class Personal2Activity extends AppCompatActivity {

    private Intent intent;
    private DatePicker datePicker;
    private TextView textView;
    private ImageButton before;
    private ImageButton next;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal2);

        datePicker = findViewById(R.id.birthActivity_datePicker);
        textView = findViewById(R.id.birthActivity_textView_age);
        before = findViewById(R.id.birthActivity_imageButton_before);
        next = findViewById(R.id.birthActivity_imageButton_next);

        textView.setVisibility(View.GONE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                    Calendar current = Calendar.getInstance();
                    int currentYear = current.get(Calendar.YEAR);
                    int currentMonth = current.get(Calendar.MONTH);
                    int currentDay = current.get(Calendar.DAY_OF_MONTH);
                    int birthYear = datePicker.getYear();
                    age = currentYear - birthYear;
                    if (birthYear * 100 + birthYear > currentMonth * 100 + currentDay) {
                        age--;
                    }

                    textView.setText("만 " + age + "세 입니다.");
                    textView.setVisibility(View.VISIBLE);
                }
            });
        }

        before.setOnClickListener(v->{
            finish();
        });

        next.setOnClickListener(v -> {
            if (!(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)) {
                Calendar current = Calendar.getInstance();
                int currentYear = current.get(Calendar.YEAR);
                int currentMonth = current.get(Calendar.MONTH);
                int currentDay = current.get(Calendar.DAY_OF_MONTH);
                int birthYear = datePicker.getYear();
                age = currentYear - birthYear;
                if (birthYear * 100 + birthYear > currentMonth * 100 + currentDay) {
                    age--;
                }
            }

            if (age < 18) {
                Snackbar.make(v, "만 18세 이상부터 사용이 가능합니다.",Snackbar.LENGTH_SHORT).show();
            } else {
                intent = new Intent(getApplicationContext(), Personal3Activity.class);
                startActivity(intent);
            }
        });
    }
}
