package com.test.examenhito3.Onboarding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.test.examenhito3.R;
import androidx.viewpager.widget.ViewPager;
import android.widget.TextView;
import android.widget.Button;
public class Fragment2 extends Fragment {
    private TextView Next;
    private Button btnlogin;
    private ViewPager viewPager;
    private View view;
    public Fragment2() {   }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initializeInflater(inflater, container);
        initializeComponents();
        eventClickNext();
        return view; }
    public void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_2, container, false);    }
    public void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        Next = view.findViewById(R.id.tvNext);
        btnlogin = view.findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);     }
        });    }
    public void eventClickNext(){
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);       }
        });  }
}

