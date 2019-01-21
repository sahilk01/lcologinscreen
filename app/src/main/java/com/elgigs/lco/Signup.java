package com.elgigs.lco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.animleft, R.anim.animoutright);
    }

    public void welc(View v) {
        Intent wel=new Intent(Signup.this, signupsuccess.class);
        startActivity(wel);
        overridePendingTransition(R.anim.animright, R.anim.animoutleft);
    }
}
