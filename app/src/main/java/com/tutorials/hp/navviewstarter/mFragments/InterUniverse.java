package com.tutorials.hp.navviewstarter.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.navviewstarter.R;

/**
 * Created by Hp on 3/22/2016.
 */
public class InterUniverse extends Fragment {

    public static InterUniverse newInstance()
    {
        return new InterUniverse();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.interuniverse,null);
        return rootView;
    }

    @Override
    public String toString() {
        return "InterStellar";
    }
}
