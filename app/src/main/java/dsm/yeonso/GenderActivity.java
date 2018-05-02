package dsm.yeonso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GenderActivity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before;
    private ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        before = (ImageButton) findViewById(R.id.genderActivity_button_before);
        next = (ImageButton) findViewById(R.id.genderActivity_next);

        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });

        next.setOnClickListener(v -> {
            intent = new Intent(getApplicationContext(), BirthActivity.class);
            startActivity(intent);
        });
    }
}
