package com.example.fypipc.Dahsboard.ui.calender;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fypipc.R;
import com.example.fypipc.newMeeting.newmettingActivity;

public class calender extends Fragment
{
    private calender binding;
    private Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.calender,container,false);
        button = (Button)view.findViewById(R.id.newMetting);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getContext(), newmettingActivity.class);
                startActivity(add);
            }
        });
    return view;
    }

}
