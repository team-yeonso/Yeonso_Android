package dsm.yeonso;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dsm.yeonso.Personal.Personal1Activity;
import dsm.yeonso.Personal.Personal3Activity;
import dsm.yeonso.Personal.Personal5Activity;
import dsm.yeonso.Personal.Personal6Activity;
import dsm.yeonso.Personal.Personal7Activity;
import dsm.yeonso.Personal.Personal9Activity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, SignInActivity.class));
            }
        }, 2000);
    }
}
