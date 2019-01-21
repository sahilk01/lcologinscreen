package com.elgigs.lco;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.TextDelegate;

public class splashanim extends AppCompatActivity {

    private ImageView logo;
    long animationDuration=1000;
    long longD=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashanim);
        logo=findViewById(R.id.lg);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animat();


    }

    public void loginb(View v) {
        Intent login=new Intent(splashanim.this, Login.class);
        startActivity(login);
        overridePendingTransition(R.anim.animright, R.anim.animoutleft);
    }
    public void sgb(View v) {
        Intent sgp=new Intent(splashanim.this, Signup.class);
        startActivity(sgp);
        overridePendingTransition(R.anim.animright, R.anim.animoutleft);
    }

    public void animat() {

        ObjectAnimator animatorY = ObjectAnimator.ofFloat(logo,"y", -10f);
        animatorY.setStartDelay(300);
        animatorY.setDuration(animationDuration);

//        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(logo, View.ALPHA, 1.0f, 0.0f);
//        alphaAnimation.setDuration(longD);

        ObjectAnimator rotateAnimator = ObjectAnimator.ofFloat(logo, "rotation", 0f, 360f);
        rotateAnimator.setDuration(animationDuration);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY, rotateAnimator);
        animatorSet.start();
    }
}
