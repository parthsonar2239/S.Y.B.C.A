package com.example.sybca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LGQ1 extends AppCompatActivity implements View.OnClickListener {
    EditText edt1,edt2;
    TextView txt1;
    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lgq1);

        edt1 = (EditText) findViewById(R.id.num1);
        edt2 = (EditText) findViewById(R.id.num2);

        txt1 = (TextView) findViewById(R.id.txt_ans);

        bt1 = (Button) findViewById(R.id.bt_sum);
        bt2 = (Button) findViewById(R.id.bt_sub);
        bt3 = (Button) findViewById(R.id.bt_mul);
        bt4= (Button) findViewById(R.id.bt_div);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }


    double ans;
    @Override

    public void onClick(View view) {
        double n1= Double.parseDouble(edt1.getText().toString());
        double n2= Double.parseDouble(edt2.getText().toString());
        if(view==bt1)
        {
           ans=n1+n2;
           txt1.setText("The Sum of "+n1+" and "+n2+" is: "+ans);
        }

        if(view==bt2)
        {
            ans=n1-n2;
            txt1.setText("The Subtraction of "+n1+" and "+n2+" is: "+ans);
        }

        if(view==bt3)
        {
            ans=n1*n2;
            txt1.setText("The Multiplication of "+n1+" and "+n2+" is: "+ans);
        }

        if(view==bt4)
        {
            if(n2==0)
            {
                txt1.setText("Number should not be zero.");
            }
            else
            {
                ans= n1/n2;
                txt1.setText("The Division of "+n1+" and "+n2+" is: "+ans);
            }

        }

    }
}
