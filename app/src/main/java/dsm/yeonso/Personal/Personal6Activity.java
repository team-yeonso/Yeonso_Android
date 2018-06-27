package dsm.yeonso.Personal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Spinner;

import dsm.yeonso.Adapter.Spinner_contury;
import dsm.yeonso.R;

public class Personal6Activity extends AppCompatActivity {

    private Intent intent;
    private ImageButton before, next;
    private Spinner first, second, third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal6);

        before = (ImageButton) findViewById(R.id.AddressActivity_imageButton_before);
        next = (ImageButton) findViewById(R.id.AddressActivity_imageButton_next);
        first = (Spinner) findViewById(R.id.AddressActivity_address_first);
        second = (Spinner) findViewById(R.id.AddressActivity_address_second);
        third = (Spinner) findViewById(R.id.AddressActivity_address_third);

        Spinner_contury x = new Spinner_contury(first,second,third,this);
        x.setSpinner();

        next.setOnClickListener(v->{
            if(first.getSelectedItem().toString().equals("대분류")){
                Snackbar.make(v, "지역을 선택해주세요",Snackbar.LENGTH_SHORT).show();
                return;
            }
            intent = new Intent(this, Personal7Activity.class);
            startActivity(intent);
        });

        before.setOnClickListener(v->{
            finish();
        });

    }
}
