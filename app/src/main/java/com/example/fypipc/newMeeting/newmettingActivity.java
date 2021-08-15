package com.example.fypipc.newMeeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fypipc.Dahsboard.ui.calender.calender;
import com.example.fypipc.R;

public class newmettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newmetting);
    }

    public void end_date(View view) {
    }

    public void back(View view)
    {
        Intent add = new Intent(getApplicationContext(), calender.class);
        startActivity(add);
    }
}