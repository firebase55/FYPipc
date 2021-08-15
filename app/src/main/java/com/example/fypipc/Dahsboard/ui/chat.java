package com.example.fypipc.Dahsboard.ui;

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
import com.example.fypipc.chatClasspackeg.chatMainActivity;

public class chat extends Fragment
{
    private chat binding;
    private Button chat_button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat,container,false);
        chat_button = (Button) view.findViewById(R.id.chat_id);
        chat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), chatMainActivity.class);
                startActivity(intent);
            }
        });
    return  view;
    }
}
