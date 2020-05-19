package com.test.examenhito3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.test.examenhito3.adapter.OnboardingAdapter;


public class MainActivity extends AppCompatActivity {
private ViewPager viewPagerContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _initializeComponents();
        _initializeFragmentAdapter();
    }

    private void _initializeFragmentAdapter() {
        OnboardingAdapter adapter= new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }

    private void _initializeComponents() {
        viewPagerContainer=findViewById(R.id.viewPagerContainer);
    }
}
