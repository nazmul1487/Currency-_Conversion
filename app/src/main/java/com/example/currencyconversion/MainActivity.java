package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    DecimalFormat pre = new DecimalFormat("0.00");
    Button btn;
    TextView tv1;
    EditText et1;
    RadioButton usd, cad, inr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn1);
        tv1 = (TextView) findViewById(R.id.tv1);
        et1 = (EditText) findViewById(R.id.et1);
        usd = (RadioButton) findViewById(R.id.usd);
        cad = (RadioButton) findViewById(R.id.cad);
        inr = (RadioButton) findViewById(R.id.inr);
        et1.setText("");
    }

    public void convertTo(View view) {
        String bdtText = et1.getText().toString();
        if(bdtText.equals(""))
        {
            tv1.setTextColor(Color.parseColor("#ff0000"));
            tv1.setText("Enter a  value first");

        }
        else
        {
            tv1.setTextColor(Color.parseColor("#000000"));
            if(usd.isChecked())
            {
                double tk = Double.parseDouble(bdtText);
                tk = tk*84.67;
                String res = pre.format(tk);
                tv1.setText("BDT :");
                tv1.setText(tv1.getText() + res);
            }
            else if(cad.isChecked())
            {
                double tk = Double.parseDouble(bdtText);
                tk = tk*64.89;
                String res = pre.format(tk);
                tv1.setText("BDT :");
                tv1.setText(tv1.getText() + res);
            }
            else if(inr.isChecked())
            {
                double tk = Double.parseDouble(bdtText);
                tk = tk*1.19;
                String res = pre.format(tk);
                tv1.setText("BDT :");
                tv1.setText(tv1.getText() + res);
            }
            else
            {
                tv1.setTextColor(Color.parseColor("#ff0000"));
                tv1.setText("Select an option first");
            }
        }

    }

}
