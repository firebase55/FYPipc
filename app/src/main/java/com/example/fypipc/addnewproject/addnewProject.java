package com.example.fypipc.addnewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.fypipc.Dahsboard.ui.slideshow.SlideshowFragment;
import com.example.fypipc.R;
import com.example.fypipc.datepickerclass.DatePickerFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class addnewProject extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    final Calendar myCalendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnew_project);
    }

    public void back(View view)
    {


        Intent intent = new Intent(getApplicationContext(), SlideshowFragment.class);
        startActivity(intent);
    }

    public void start_date(View view)
    {
        DialogFragment datePicker1= new DatePickerFragment();
        datePicker1.show(getSupportFragmentManager(), "date picker1");

    }

    public void end_date(View view)
    {
        DialogFragment datePicker = new DatePickerFragment();
        datePicker.show(getSupportFragmentManager(), "date picker");

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
    {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView Start_date = (TextView) findViewById(R.id.setstatrt_date);
        TextView End_date = (TextView) findViewById(R.id.end_date);

        Start_date.setText(currentDateString);
        End_date.setText(currentDateString);


    }



}