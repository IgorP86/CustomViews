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
import android.widget.Button;

import me.ilich.juggler.change.Add;
import me.ilich.juggler.gui.JugglerFragment;

/**
 * Created by Igorr on 07.02.2018.
 */

public class Fr2 extends JugglerFragment {

    String TAG = "Yellow: ";
    String NAME = "Lifecycle";

    public static Fr2 newInstance() {
        return new Fr2();
    }

    @LayoutRes
    protected int getLayoutRes() {
        return R.layout.fr2;
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        Log.d(NAME, TAG + "onCreateView");
        return inflater.inflate(R.layout.fr2, parent, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button b = getActivity().findViewById(R.id.button1);
        b.setOnClickListener(v -> navigateTo().state(Add.newActivity(new MainState(), Activ2.class)));
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
