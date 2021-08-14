package com.example.fypipc.Dahsboard.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.fypipc.R;
import com.example.fypipc.addnewproject.addnewProject;
import com.example.fypipc.databinding.FragmentSlideshowBinding;


public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow,container,false);
        imageView = (ImageView) view.findViewById(R.id.addnewpage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), addnewProject.class);
                startActivity(intent);
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