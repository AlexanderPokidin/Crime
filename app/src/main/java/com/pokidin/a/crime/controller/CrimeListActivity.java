package com.pokidin.a.crime.controller;

import android.support.v4.app.Fragment;

import com.pokidin.a.crime.SingleFragmentActivity;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
