package com.igorr.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import me.ilich.juggler.change.Add;
import me.ilich.juggler.gui.JugglerActivity;

/**
 * Created by Igorr on 07.02.2018.
 */

public class Activ2 extends JugglerActivity {
    FragmentManager fragManager;
    String TAG = "ACTIVITY_TWO: ";
    String NAME = "Lifecycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activ_two);
        Log.d(NAME, TAG+"onCreate");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(NAME, TAG+"onStart");
    }

    @Override
    protected void onResume() {
        Log.d(NAME, TAG+"onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(NAME, TAG+"onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(NAME, TAG+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(NAME, TAG+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(NAME, TAG+"onDestroy");
    }
}
