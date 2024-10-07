package com.example.sybca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LGQ2 extends AppCompatActivity implements View.OnClickListener {

    EditText edt1,edt2,edt3;

    TextView txt1;

    Button bt1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lgq2);

        edt1 = (EditText) findViewById(R.id.edt_amt);
        edt2 = (EditText) findViewById(R.id.edt_int);
        edt3 = (EditText) findViewById(R.id.edt_n);

        txt1= (TextView) findViewById(R.id.txt_si);

        bt1 = (Button) findViewById(R.id.bt_si);

        bt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double p = Double.parseDouble(edt1.getText().toString());
        double r = Double.parseDouble(edt2.getText().toString());
        double n = Double.parseDouble(edt3.getText().toString());
        if(view==bt1)
        {
            double si=(p*r*n)/100;
            txt1.setText("The Simple Interest is: "+si);
        }
    }
}
