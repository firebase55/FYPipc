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
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.fypipc.R;
import com.example.fypipc.addnewproject.addnewProject;
import com.example.fypipc.databinding.FragmentSlideshowBinding;
import com.example.fypipc.taskactivity;


public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private ImageView imageView;
    private TextView nametext;
    private CardView cardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);
        imageView = (ImageView) view.findViewById(R.id.addnewpage);
        nametext = (TextView) view.findViewById(R.id.getNAme);
        cardView = (CardView) view.findViewById(R.id.newtask);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), taskactivity.class);
                startActivity(intent);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), addnewProject.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}