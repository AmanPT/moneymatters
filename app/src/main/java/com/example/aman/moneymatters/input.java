package com.example.aman.moneymatters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class input extends AppCompatActivity {
    EditText spet,cpet;
    Button calculatebt,clearbt;
    TextView addResult,pptv;
    Double sp,cp,p,l,pp,lp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        spet=(EditText)findViewById(R.id.spet);
        cpet=(EditText)findViewById(R.id.cpet);
        addResult=(TextView) findViewById(R.id.addResult);
        pptv=(TextView) findViewById(R.id.pptv);
        calculatebt=(Button)findViewById(R.id.calculatebt);
        clearbt=(Button)findViewById(R.id.clearbt);
        calculatebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp = Double.parseDouble(spet.getText().toString());
                cp = Double.parseDouble(cpet.getText().toString());
                if (cp < sp) {
                    p = sp - cp;
                    pp = (p * 100) / cp;
                    addResult.setText("Profit is " + Double.toString(p));
                    pptv.setText("Profit % is " + Double.toString(pp));


                } else
                    if (sp < cp){
                        l = cp - sp;
                    lp = (l * 100) / cp;
                    addResult.setText("Loss is  " + String.valueOf(l));
                    pptv.setText("Loss % is " + String.valueOf(lp));
                } else {
                    addResult.setText("No loss No Gain ");


                     }
                clearbt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        spet.setText("");
                        cpet.setText("");
                        addResult.setText("");
                        pptv.setText("");
                    }
                });
                    }
                });
            }

        }


