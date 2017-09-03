package com.naman.darwinlabstask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Send2Activity extends AppCompatActivity implements View.OnClickListener {


    private TextView mTitle ;
    private ImageView mIcon;

    private ImageView mForward ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send2);

        getUi();

        mTitle.setText(R.string.send2_title);
        mIcon.setBackgroundResource(R.drawable.backicon);

        mTitle.setOnClickListener(this);
        mIcon.setOnClickListener(this);

        mForward.setOnClickListener(this);



    }



    public void getUi(){

        mTitle = (TextView)findViewById(R.id.txt_title);
        mIcon = (ImageView)findViewById(R.id.img_back_menu);
        mForward = (ImageView)findViewById(R.id.img_forward);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.img_forward :

                break ;

            case R.id.img_back_menu :

              //onBackPressed();

                finish();
                break ;

        }

    }
}
