package com.naman.darwinlabstask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Send2Activity extends AppCompatActivity implements View.OnClickListener {


    private TextView mTitle ;
    private ImageView mIcon;

    private ImageView mForward ;
    private EditText mAmount;



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


    private TextView mEthValue ;

    private String ethvalue  ="";

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


        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


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
        mButtonDot.setOnClickListener(this);
        mButtonBackspace.setOnClickListener(this);


    }



    public void getUi(){

        mTitle = (TextView)findViewById(R.id.txt_title);
        mIcon = (ImageView)findViewById(R.id.img_back_menu);
        mForward = (ImageView)findViewById(R.id.img_forward);
        mButton0 = (Button)findViewById(R.id.btn_0);
        mButton1 = (Button)findViewById(R.id.btn_1);
        mButton2 = (Button)findViewById(R.id.btn_2);
        mButton3 = (Button)findViewById(R.id.btn_3);
        mButton4 = (Button)findViewById(R.id.btn_4);
        mButton5 = (Button)findViewById(R.id.btn_5);
        mButton6 = (Button)findViewById(R.id.btn_6);
        mButton7 = (Button)findViewById(R.id.btn_7);
        mButton8 = (Button)findViewById(R.id.btn_8);;
        mButton9 = (Button)findViewById(R.id.btn_9);
        mButtonDot = (Button)findViewById(R.id.btn_dot);
        mButtonBackspace = (Button)findViewById(R.id.btn_backspace);
        mEthValue= (TextView) findViewById(R.id.txt_ethvalue);
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


            case (R.id.btn_0) :

                ethvalue = ethvalue+ "0";
              //  mEthValue.setText("");
             //   mEthValue.setText("1"+ethvalue);
                break ;

            case (R.id.btn_1) :
                ethvalue =  ethvalue+"1";



                break ;

            case (R.id.btn_2) :
                ethvalue = ethvalue+ "2";
                break ;

            case (R.id.btn_3) :
                ethvalue =  ethvalue+"3";
                break ;

            case (R.id.btn_4) :
                ethvalue =  ethvalue+"4" ;
                break ;

            case (R.id.btn_5) :
                ethvalue =  ethvalue+"5";
                break ;

            case (R.id.btn_6) :

                ethvalue =  ethvalue+"6" ;
                break ;

            case (R.id.btn_7) :
                ethvalue =  ethvalue+"7" ;

                break ;

            case (R.id.btn_8) :
                ethvalue =  ethvalue+"8" ;
                break ;

            case (R.id.btn_9) :

                ethvalue =  ethvalue+"2" ;
                break ;

            case (R.id.btn_dot) :
                ethvalue =  ethvalue+"." ;



                break ;

            case (R.id.btn_backspace) :
               //ethvalue.toString().charAt(ethvalue.length()-1).
                //if
                try {
                    ethvalue = ethvalue.substring(0, ethvalue.length() - 1)/*+"ETH"*/;

                }
                catch (StringIndexOutOfBoundsException ar)
                {
                    ar.printStackTrace();
                }
                break ;



        }
        mEthValue.setText(ethvalue+" ETH");

    }
}
