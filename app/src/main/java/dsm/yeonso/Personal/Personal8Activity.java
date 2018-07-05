package dsm.yeonso.Personal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import dsm.yeonso.R;

public class Personal8Activity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before, next;
    private TextView name, percent;
    private CircleImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal8);

        before = (ImageButton) findViewById(R.id.resultActivity_imageButton_before);
        next = (ImageButton) findViewById(R.id.resultActivity_imageButton_next);

        name = (TextView) findViewById(R.id.resultActivity_textView_name);
        percent = (TextView) findViewById(R.id.resultActivity_textView_percent);
        picture = (CircleImageView) findViewById(R.id.resultActivity_CircleImageView);

        next.setOnClickListener(v->{
            intent = new Intent(this, Personal9Activity.class);
            startActivity(intent);
        });

        before.setOnClickListener(v->{
            finish();
        });

    }
}
