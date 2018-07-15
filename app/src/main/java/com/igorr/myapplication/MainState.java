package com.igorr.myapplication;

import android.support.annotation.Nullable;

import me.ilich.juggler.gui.JugglerFragment;
import me.ilich.juggler.states.ContentOnlyState;
import me.ilich.juggler.states.ContentToolbarNavigationState;
import me.ilich.juggler.states.State;
import me.ilich.juggler.states.VoidParams;

public class MainState extends ContentOnlyState {
    public MainState() {
        super(VoidParams.instance());
    }

    @Override
    protected JugglerFragment onConvertContent(Params params, @Nullable JugglerFragment fragment) {
      return Fr1.newInstance();
    }
}
