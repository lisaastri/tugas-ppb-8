package com.astri.sambalijo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnjam = (Button) findViewById(R.id.jam);
    }
    public void btntime(View view){
        Intent i = new Intent(this, timepicker.class);
        startActivity(i);
    }
    public void btndate(View view){
        Intent i = new Intent(this, DatePicker2.class);
        startActivity(i);
    }
}
