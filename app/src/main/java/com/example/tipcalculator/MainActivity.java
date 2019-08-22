package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcTip(View v)
    {
        EditText billCostEdTxt = (EditText) findViewById(R.id.billCostEdTxt);
        EditText tipPerEdTxt = (EditText) findViewById(R.id.tipPerEdTxt);
        EditText quaSerEdTxt = (EditText) findViewById(R.id.quaSerEdTxt);
        TextView tipTxtView = (TextView) findViewById(R.id.tipTxtView);

        double billCost = Double.parseDouble(billCostEdTxt.getText().toString());
        double perTipped = Double.parseDouble(tipPerEdTxt.getText().toString());

        String serviceQuality = quaSerEdTxt.getText().toString();

        double totalCost = billCost * (1 + (perTipped*.01));

        String dollarFormat = ("$0000.00");
        DecimalFormat tipFormat = new DecimalFormat(dollarFormat);
        String dollarCost = tipFormat.format(totalCost);

        String output = "";
        output += "Your Total bill with tip is: " + dollarCost + "\n";
        output += "Your Review of the service said: " + serviceQuality + "\n";
        output += "You ended up tipping: " + perTipped + "%" + "\n";
        tipTxtView.setText(output);


    }
}
