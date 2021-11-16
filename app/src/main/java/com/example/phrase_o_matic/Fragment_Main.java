package com.example.phrase_o_matic;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.phrase_o_matic.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fragment_Main extends Fragment {


    private FragmentMainBinding binding;
    TextView textView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mainMethod();
            }
        });
        return binding.getRoot();
    }
    void mainMethod() {
        String[] wordListOne = {
                " kick for "," push for "," guidance for "
        };
        String[] wordListTwo = {" life ", " work ", " workout "
                };
        String[] wordListThree = {
                " motivation ", " motivation ", " motivation "
        };
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rant3 = (int) (Math.random()* threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rant3];
        binding.textView.setText("What we need is: "  +  phrase);

    }


}