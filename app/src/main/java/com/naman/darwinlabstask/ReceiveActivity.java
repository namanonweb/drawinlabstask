package com.naman.darwinlabstask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTitle;
    private ImageView mIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);


        getUi();

        mTitle.setText(R.string.receive_title);
        mIcon.setBackgroundResource(R.drawable.backicon);


        mTitle.setOnClickListener(this);
        mIcon.setOnClickListener(this);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


    }


    public void getUi() {

        mTitle = (TextView) findViewById(R.id.txt_title);
        mIcon = (ImageView) findViewById(R.id.img_back_menu);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.img_back_menu:

                finish();
                break;


        }
    }
}
