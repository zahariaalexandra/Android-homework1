package com.example.android_tema1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        F1A1 f1a1 = new F1A1();
        fragmentTransaction.add(R.id.F1A1, f1a1);
        fragmentTransaction.commit();

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
    }

    public void goToActivity2(View view) {
        Intent intent = new Intent(A1.this, A2.class);

        startActivity(intent);
    }

    public void addSecondFragment(View view) {
        addSecondFragment(view);
    }

    public void closeActivity(View view) {
        closeActivity(view);
    }

    public void replaceFragment(View view) {
        replaceFragment(view);
    }

    public void removeFragment(View view) {
        removeFragment(view);
    }
}
