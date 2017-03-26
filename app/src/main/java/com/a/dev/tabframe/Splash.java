package com.a.dev.tabframe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Asus on 26/03/2017.
 */

public class Splash extends AppCompatActivity {

    //lama interval
    private static int splashinterval = 6000;
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.actifity_splash);
        eksekusi();
    }

    protected void eksekusi() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, splashinterval);
    }
    public void onBackPressed() {
        super.onBackPressed();
        finish();

    }
}
