package com.google.android.gms.samples.vision.barcodereader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.TextView;
import com.google.android.gms.vision.barcode.Barcode;


/**
 * Created by maarthaandan on 30/04/17.
 */

public class DisplayDetails extends AppCompatActivity{

    private TextView barcode_val;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.id.display_details);
        setContentView(R.layout.display_details);

        //after inflating the layout, the text view and other UI componenents can be initialised
        barcode_val = (TextView)findViewById(R.id.barcode_value);
        displayInfo();

    }
    // call setText and other methods inside a method
    public void displayInfo(){

        Bundle extras = getIntent().getExtras();
        Barcode barcode = extras.getParcelable(BarcodeCaptureActivity.BarcodeObject);
        barcode_val.setText(barcode.displayValue);
    }
    //Barcode barcode = datadisp.getParcelableExtra(BarcodeCaptureActivity.BarcodeObject);

//    Bundle extras = getIntent().getExtras();
//
//    Barcode barcode = extras.getParcelable(BarcodeCaptureActivity.BarcodeObject);
//    barcode_val.setText(barcode.displayValue);
}
