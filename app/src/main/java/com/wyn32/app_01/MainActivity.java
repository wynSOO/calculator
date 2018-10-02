package com.wyn32.app_01;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private TextView mTextMessage;

    TextInputEditText num1;
    TextInputEditText num2;

    Button btn_add;
    Button btn_min;
    Button btn_div;
    Button btn_rhq;

    TextView answer;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.input_num01);
        num2 = findViewById(R.id.input_num02);

        btn_add = findViewById(R.id.btn_add);
        btn_min = findViewById(R.id.btn_min);
        btn_rhq = findViewById(R.id.btn_rhq);
        btn_div = findViewById(R.id.btn_div);

        answer = findViewById(R.id.answer);





        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = num1.getText().toString();
                String b = num2.getText().toString();

                int in_num1 = Integer.parseInt(a);
                int in_num2 = Integer.parseInt(b);
                 int num3 = in_num1+in_num2;
                String string = Integer.toString(num3);
                 answer.setText("덧셈결과:" + string);

            }
        });

        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = num1.getText().toString();
                String b = num2.getText().toString();

                int in_num1 = Integer.parseInt(a);
                int in_num2 = Integer.parseInt(b);
                int num3 = in_num1-in_num2;
                String string = Integer.toString(num3);
                answer.setText("뺄셈결과:" + string);

            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = num1.getText().toString();
                String b = num2.getText().toString();

                int in_num1 = Integer.parseInt(a);
                int in_num2 = Integer.parseInt(b);
                int num3 = in_num1/in_num2;
                String string = Integer.toString(num3);
                answer.setText("나눗셈결과:" + string);

            }
        });

        btn_rhq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = num1.getText().toString();
                String b = num2.getText().toString();

                int in_num1 = Integer.parseInt(a);
                int in_num2 = Integer.parseInt(b);
                int num3 = in_num1*in_num2;
                String string = Integer.toString(num3);
                answer.setText("곱셈결과:" + string);

            }
        });



        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
