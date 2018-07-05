package dsm.yeonso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class FindIdActivity extends AppCompatActivity {

    private Button search;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);

        back = findViewById(R.id.findId_back);
        search = findViewById(R.id.findId_search);

    }
}
