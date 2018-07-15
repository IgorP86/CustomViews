package com.igorr.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.ilich.juggler.gui.JugglerFragment;

/**
 * Created by Igorr on 07.02.2018.
 */
public class Fr1 extends JugglerFragment {

    String TAG = "Red: ";
    String NAME = "Lifecycle";

    public static Fr1 newInstance() {
        return new Fr1();
    }

    @LayoutRes
    protected int getLayoutRes() {
        return R.layout.fr1;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(NAME, TAG + "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(NAME, TAG + "onCreate");
    }

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        Log.d(NAME, TAG + "onCreateView");
        return v = inflater.inflate(R.layout.fr1, parent, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(NAME, TAG + "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(NAME, TAG + "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(NAME, TAG + "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(NAME, TAG + "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(NAME, TAG + "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(NAME, TAG + "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(NAME, TAG + "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(NAME, TAG + "onDetach");
    }
}


