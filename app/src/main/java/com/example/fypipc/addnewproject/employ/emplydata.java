package com.example.fypipc.addnewproject.employ;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fypipc.R;
import com.example.fypipc.emplodataActivity.EmployActivity;

public class emplydata extends Fragment {
    private emplydata binding;

    private ImageView employ_activity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.employ,container,false);
        employ_activity = (ImageView) view.findViewById(R.id.addEmploy);

        employ_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emp = new Intent(getContext(), EmployActivity.class);
                startActivity(emp);
            }
        });
        return  view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
