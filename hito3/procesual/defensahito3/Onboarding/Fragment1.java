package com.test.examenhito3.Onboarding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.test.examenhito3.R;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;

public class Fragment1 extends Fragment {
    private TextView Next;
    private Button login;
    private ViewPager viewPager;
    private View view;
    public Fragment1() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initializeInflater(inflater, container);
        initializeComponents();
        eventClickNext();
        return view; }
    public void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_1, container, false);
    }
    public void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        Next = view.findViewById(R.id.tvNext);
        login = view.findViewById(R.id.btnLogin);
    }
    public void eventClickNext(){
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });
    }
}
