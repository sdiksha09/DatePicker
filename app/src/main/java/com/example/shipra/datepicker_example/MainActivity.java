package com.example.shipra.datepicker_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variables

    DatePicker datePicker;
    TextView textView;
    Button changeDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intialize variables
        datePicker = (DatePicker) findViewById(R.id.date_picker);
        textView = (TextView) findViewById(R.id.textView1);
        changeDate = (Button) findViewById(R.id.button1);

        textView.setText(getCurrentDate());  //declare a getCurrent date method

        changeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(getCurrentDate());
            }
        });

    }

    public String getCurrentDate() {

        StringBuilder builder = new StringBuilder();
        builder.append("current Dtae:    ");
        builder.append((datePicker.getMonth() + 1) + "/");   //month is 0 based
        builder.append(datePicker.getDayOfMonth() + "/");
        builder.append(datePicker.getYear() + "/");
        return builder.toString();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}


