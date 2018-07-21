package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppBarLayout collapsingToolbar = findViewById(R.id.appBar);
        final CardView cv_data = findViewById(R.id.cv_data);
        collapsingToolbar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
                    cv_data.setCardElevation(0);
                } else {
                    cv_data.setCardElevation(getResources().getDimension(R.dimen._2sdp));
                }
            }
        });
    }
}
