package dsm.yeonso;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;

public class AcceptActivity extends AppCompatActivity {

    private CheckBox firstCheckBox;
    private CheckBox secondCheckBox;
    private Button next;

    private String TAG = getClass().getSimpleName().trim();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept);

        firstCheckBox = (CheckBox) findViewById(R.id.checkBox_first);
        secondCheckBox = (CheckBox) findViewById(R.id.checkBox_second);
        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(v -> {
            Log.d(TAG, "if");
            if (firstCheckBox.isChecked() && secondCheckBox.isChecked()) {
                startActivity(new Intent(this, SignInActivity.class));
            } else {
                Log.d(TAG, "else");
                Snackbar.make(v, "모두 동의를 해주세요.", Snackbar.LENGTH_SHORT).show();
            }
        });


    }
}
