package dsm.yeonso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class FindPwActivity extends AppCompatActivity {

    private ImageButton back;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_pw);

        back = (ImageButton) findViewById(R.id.back);
        search = (Button) findViewById(R.id.search);

        back.setOnClickListener(v -> {
            finish();
        });

        search.setOnClickListener(v -> {
            CustomDialog customDialog = new CustomDialog(this);
            customDialog.show();
        });
    }
}
