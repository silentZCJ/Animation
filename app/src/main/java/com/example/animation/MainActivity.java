package com.example.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.*;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button alphaButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.image);
        imageView.setImageResource(R.drawable.netease);
        AlphaAnimation first = new AlphaAnimation(0, 1);
        first.setDuration(4000);
        imageView.startAnimation(first);
        first.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

                    }

            @Override
            public void onAnimationEnd(Animation animation) {
                        AlphaAnimation second = new AlphaAnimation(1, 0);
                        second.setDuration(2000);
                        imageView.startAnimation(second);
                        second.setFillAfter(true);
                        second.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                Intent intent=new Intent(MainActivity.this,IndexActivity.class);
                                startActivity(intent);
                                MainActivity.this.finish();
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                    }

            @Override
            public void onAnimationRepeat(Animation animation) {

                    }

                });
            }
    }

