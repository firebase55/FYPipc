package com.example.fypipc.emplodataActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fypipc.Dahsboard.ui.slideshow.SlideshowFragment;
import com.example.fypipc.R;
import com.example.fypipc.addnewproject.employ.emplydata;

public class EmployActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employ);
    }

    public void backk(View view)
    {
        Intent intent = new Intent(getApplicationContext(), emplydata.class);
        startActivity(intent);
    }
}