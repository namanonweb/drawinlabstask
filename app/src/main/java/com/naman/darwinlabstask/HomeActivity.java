package com.naman.darwinlabstask;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{


    private TextView mTitle ;
    private TextView mTitleCont ;
    private ImageView mIcon;

    private ImageView mSend ;
    private ImageView mReceive ;
    private ImageView mBuySell ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        getUi();


        mIcon.setOnClickListener(this);

        mTitle.setText(R.string.home_title);
        mIcon.setBackgroundResource(R.drawable.menuicon);

        mTitleCont.setVisibility(View.VISIBLE);
        //  mTitleCont.setTextColor(getResources().getColor(R.color.colorBlue));

        mIcon.setOnClickListener(this);
        mTitle.setOnClickListener(this);

        mSend.setOnClickListener(this);
        mReceive.setOnClickListener(this);
        mBuySell.setOnClickListener(this);


    }


    public void getUi(){

        mTitle = (TextView)findViewById(R.id.txt_title);
        mIcon = (ImageView)findViewById(R.id.img_back_menu);
        mTitleCont = (TextView)findViewById(R.id.txt_title_cont);

        mSend = (ImageView)findViewById(R.id.img_send);
        mReceive = (ImageView)findViewById(R.id.img_receive);
        mBuySell = (ImageView)findViewById(R.id.img_buy);


    }

    @Override
    public void onClick(View view) {

     switch (view.getId())
     {

         case (R.id.img_send) :
             Intent i = new Intent(HomeActivity.this,Send2Activity.class);
             startActivity(i);

             break ;

         case (R.id.img_receive):

             Intent i2 = new Intent(HomeActivity.this,ReceiveActivity.class);
             startActivity(i2);

             break ;

         case R.id.img_back_menu :
             Toast.makeText(HomeActivity.this,"in progress",Toast.LENGTH_SHORT).show();

             //onBackPressed();
             break ;

         case (R.id.img_buy):

             Toast.makeText(HomeActivity.this,"in progress",Toast.LENGTH_SHORT).show();

             break ;




     }


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
               //  onBackPressed();
               finish();

        }
       /* mTextView.setText(item.getTitle());*/
        return super.onOptionsItemSelected(item);
    }

}
