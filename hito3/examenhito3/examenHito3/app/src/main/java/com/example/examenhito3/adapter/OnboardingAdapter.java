package com.example.examenhito3.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.examenhito3.onboarding.Fragment1;
import com.example.examenhito3.onboarding.loginFragment;
import com.example.examenhito3.onboarding.Fragment2;

public class OnboardingAdapter extends FragmentPagerAdapter {
    public OnboardingAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new loginFragment();
            default:

            return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
