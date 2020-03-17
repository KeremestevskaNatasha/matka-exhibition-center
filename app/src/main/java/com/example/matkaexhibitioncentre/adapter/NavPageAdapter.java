package com.example.matkaexhibitioncentre.adapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.matkaexhibitioncentre.MainActivity;
import com.example.matkaexhibitioncentre.MatkaItems;
import com.example.matkaexhibitioncentre.fragments.ExhibitionFragment;

import java.util.List;

public class NavPageAdapter extends FragmentPagerAdapter {

    private static int numb_pages=4;

    public NavPageAdapter(@NonNull MainActivity fm, FragmentManager behavior) {
        super(fm, behavior);
    }




    @NonNull
    @Override
    public Fragment getItem(int position) {
        ExhibitionFragment navFragment = new ExhibitionFragment();
        Bundle bundle = new Bundle();

        //logika za navigation pg

        navFragment.setArguments(bundle);
        return navFragment;
    }

    @Override
    public int getCount() {
        return numb_pages;
    }


    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "History";
            case 1:
                return "Exhibition";
            case 2:
                return "Videos";
            case 3:
                return "More";

            default:
                return null;

        }        }




}
