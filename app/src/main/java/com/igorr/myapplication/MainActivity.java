package com.igorr.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import custom.MyCustomViewGroup;
import me.ilich.juggler.change.Add;
import me.ilich.juggler.gui.JugglerActivity;
import me.ilich.juggler.states.TargetBound;

public class MainActivity extends JugglerActivity {
    private FragmentManager fragManager;
    String NAME = "Lifecycle";
    String MAIN = "ACTIVITY_ONE: ";

    private static void onClick(View view) {
        Log.d("НАЖАТИЯ", view.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activ_test_main);

        MyCustomViewGroup myCustomViewGroup = findViewById(R.id.myCustomViewGroup);
        MyCustomViewGroup myCustomViewGroup2 = findViewById(R.id.myCustomViewGroup2);

        myCustomViewGroup.setOnClickListener(MainActivity::onClick);
        myCustomViewGroup.title.setText("Абонимент");
        myCustomViewGroup2.title.setText("Москва - Санкт-Петербург\nМосква - Нижний Новгород");

        /*setContentView(R.layout.activity_main);*/
       /* CustomTouchableObj customTouchableObj = new CustomTouchableObj(this);
        customTouchableObj.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("Touch", "Сработал другой обработчик");
                return false;
            }
        });

        setContentView(customTouchableObj);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final Fragment redFragment = new Fr1();
        final Fragment yellowFragment = new Fr2();

        final Intent actTwo = new Intent(this, Activ2.class);
        findViewById(R.id.btnNext).setOnClickListener(v -> startActivity(actTwo));

        findViewById(R.id.btAddRed).setOnClickListener(v -> {
                   navigateTo().state(Add.linear(new MainState(), new TargetBound(R.id.content, 0,0)));
        });

        findViewById(R.id.btAddYellow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.content, yellowFragment)
                        .addToBackStack(null).commit();
            }
        });
        Log.d(NAME, MAIN+"onCreate");*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(NAME, MAIN + "onStart");
    }

    @Override
    protected void onResume() {
        Log.d(NAME, MAIN + "onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(NAME, MAIN + "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(NAME, MAIN + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(NAME, MAIN + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("NAME", MAIN + "onDestroy");
    }
}