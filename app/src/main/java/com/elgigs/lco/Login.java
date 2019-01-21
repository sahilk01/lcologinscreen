package com.elgigs.lco;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        LinearLayout loginLayout = findViewById(R.id.linlog);
//        AnimationDrawable animationDrawable = (AnimationDrawable) loginLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(3000);
//        animationDrawable.start();
    }

    public void signup(View view) {
        Intent signup=new Intent(Login.this, Signup.class);
        startActivity(signup);
        overridePendingTransition(R.anim.animright, R.anim.animoutleft);
    }
}
