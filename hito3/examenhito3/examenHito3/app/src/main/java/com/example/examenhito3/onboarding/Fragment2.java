package com.example.examenhito3.onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;

import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

import android.widget.Button;
import com.example.examenhito3.R;

public class Fragment2 extends Fragment {
    private TextView Next;
    private Button btnlogin;
    private ViewPager viewPager;
    private View view;
    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_pantalla2, container, false);
        initializeInflater(inflater, container);
        initializeComponents();
        eventClickNext();
        return view;
    }
    public void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_pantalla1, container, false);
    }
    public void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        Next = view.findViewById(R.id.tvNext;
        btnlogin = view.findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

    }

    public void eventClickNext(){
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

    }
}
