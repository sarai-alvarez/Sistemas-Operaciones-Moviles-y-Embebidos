package com.test.examenhito3.adapter;


import com.test.examenhito3.Onboarding.Fragment1;
import com.test.examenhito3.Onboarding.Fragment2;
import com.test.examenhito3.Onboarding.Fragmentlogin;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


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
                return new Fragmentlogin();
            default:
                return null;
        }
    }
    @Override
    public int getCount()
    {
        return 3;
    }
}
