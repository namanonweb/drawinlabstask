package com.naman.darwinlabstask;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class EnterPinActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView mTitle ;
    private ImageView mIcon;


    private CircleImageView mCode1 ;
    private CircleImageView mCode2 ;
    private CircleImageView mCode3 ;
    private CircleImageView mCode4 ;

    private Button mButton1 ;
    private Button mButton2 ;
    private Button mButton3 ;
    private Button mButton4 ;
    private Button mButton5 ;
    private Button mButton6 ;
    private Button mButton7 ;
    private Button mButton8 ;
    private Button mButton9 ;
    private Button mButton0 ;
    private Button mButtonBackspace ;
    private Button mButtonDot ;

    private int count ;

    private ImageView mForward ;

    boolean flag = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_pin);

        getUi();

        mTitle.setText(R.string.enter_pin);
        mIcon.setBackgroundResource(R.drawable.backicon);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
        mButton9.setOnClickListener(this);
        mButton0.setOnClickListener(this);
        mCode1.setOnClickListener(this);
        mCode2.setOnClickListener(this);
        mCode3.setOnClickListener(this);
        mCode4.setOnClickListener(this);
        mButtonDot.setOnClickListener(this);
        mButtonBackspace.setOnClickListener(this);
        mForward.setOnClickListener(this);
        mIcon.setOnClickListener(this);
            }


    public void getUi(){

        mTitle = (TextView)findViewById(R.id.txt_title);
        mIcon = (ImageView)findViewById(R.id.img_back_menu);
        mButton0 = (Button)findViewById(R.id.btn_0);
        mButton1 = (Button)findViewById(R.id.btn_1);
        mButton2 = (Button)findViewById(R.id.btn_2);
        mButton3 = (Button)findViewById(R.id.btn_3);
        mButton4 = (Button)findViewById(R.id.btn_4);
        mButton5 = (Button)findViewById(R.id.btn_5);
        mButton6 = (Button)findViewById(R.id.btn_6);
        mButton7 = (Button)findViewById(R.id.btn_7);
        mButton8 = (Button)findViewById(R.id.btn_8);
        mButton9 = (Button)findViewById(R.id.btn_9);
        mButtonDot = (Button)findViewById(R.id.btn_dot);
        mButtonBackspace = (Button)findViewById(R.id.btn_backspace);
        mCode1=(CircleImageView)findViewById(R.id.img_logincode1);
        mCode2=(CircleImageView)findViewById(R.id.img_logincode2);
        mCode3=(CircleImageView)findViewById(R.id.img_logincode3);
        mCode4=(CircleImageView)findViewById(R.id.img_logincode4);
        mForward = (ImageView)findViewById(R.id.img_forward);

       // mButtonBackspace.setBackgroundResource(R.drawable.backspace);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {



            case R.id.img_back_menu :
               showAlert(this);
                //
                //onBackPressed();
                break ;

            case (R.id.img_forward) :

                if (count == 4)
                {
                    Intent i = new Intent(EnterPinActivity.this,HomeActivity.class);
                    startActivity(i);
                }

                break;

            case (R.id.btn_0) :

                if (count!=4) {
                    check();

                    changeVisibility();
                }
                break ;

            case (R.id.btn_1) :
                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_2) :
                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_3) :
                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_4) :
                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_5) :
                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_6) :

                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_7) :
                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_8) :
                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_9) :

                if (count!=4) {
                    check();
                    changeVisibility();
                }
                break ;

            case (R.id.btn_dot) :

                break ;

            case (R.id.btn_backspace) :
                delete() ;
                flag = true ;

                changeVisibility();
                break ;



        }

    }


    public void check()
    {
        if (count < 4)
        {

            count++ ;
        }
        else {

            Toast.makeText(EnterPinActivity.this,"4 only",Toast.LENGTH_SHORT).show();
        }
        Log.v("textcheck",count+"") ;

    }


    public void delete()
    {
        if (count >0)
        {

            count-- ;
        }
        else {

            Toast.makeText(EnterPinActivity.this,"No code entered",Toast.LENGTH_SHORT).show();
        }
        Log.v("textdelete",count+"") ;

    }

    public void changeVisibility ()

    {

       /* if ( !flag )
        {*/

            if (count==1)
            {
                mCode1.setBackgroundResource(R.drawable.blue);
                mCode2.setBackgroundResource(R.drawable.circleexact);
                mCode2.setBackgroundResource(R.drawable.circleexact);
                mCode3.setBackgroundResource(R.drawable.circleexact);
                mCode4.setBackgroundResource(R.drawable.circleexact);

            }
            else if (count ==2) {

                mCode1.setBackgroundResource(R.drawable.blue);
                mCode2.setBackgroundResource(R.drawable.blue);
                mCode3.setBackgroundResource(R.drawable.circleexact);
                mCode4.setBackgroundResource(R.drawable.circleexact);

            }


            else if (count ==0) {

                mCode1.setBackgroundResource(R.drawable.circleexact);
                mCode2.setBackgroundResource(R.drawable.circleexact);
                mCode3.setBackgroundResource(R.drawable.circleexact);
                mCode4.setBackgroundResource(R.drawable.circleexact);

            }
            else if (count ==3)

            {
                mCode1.setBackgroundResource(R.drawable.blue);
                mCode2.setBackgroundResource(R.drawable.blue);
                mCode3.setBackgroundResource(R.drawable.blue);
                mCode4.setBackgroundResource(R.drawable.circleexact);

            }

            else if (count ==4)
            {

                mCode1.setBackgroundResource(R.drawable.blue);
                mCode2.setBackgroundResource(R.drawable.blue);
                mCode3.setBackgroundResource(R.drawable.blue);
                mCode4.setBackgroundResource(R.drawable.blue);


            }







     //   }

    }


    public void changeVisibilityDelete ()

    {
        if (count==1)
        {
            mCode1.setBackgroundResource(R.color.colorWhite);

        }
        else if (count ==2) {

            mCode1.setBackgroundResource(R.color.colorGrey);
            mCode2.setBackgroundResource(R.color.colorGrey);

        }
        else if (count ==3)

        {
            mCode1.setBackgroundResource(R.color.colorGrey);
            mCode2.setBackgroundResource(R.color.colorGrey);
            mCode3.setBackgroundResource(R.color.colorGrey);

        }

        else if (count ==4)
        {

            mCode1.setBackgroundResource(R.color.colorGrey);
            mCode2.setBackgroundResource(R.color.colorGrey);
            mCode3.setBackgroundResource(R.color.colorGrey);
            mCode4.setBackgroundResource(R.color.colorGrey);


        }


    }

public   void showAlert (Context context)
{

    AlertDialog.Builder builder;
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        builder = new AlertDialog.Builder(context, android.R.style.Theme_Material_Dialog_Alert);
    } else {
        builder = new AlertDialog.Builder(context);
    }
    builder.setTitle("Exit App ")
            .setMessage("Are you sure you want to exit the App?")
            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // continue with delete

                    finish();
                }
            })
            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // do nothing
                }
            })
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show();

}


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //  onBackPressed();
                showAlert(this);

        }
       /* mTextView.setText(item.getTitle());*/
        return super.onOptionsItemSelected(item);
    }

}
