package com.example.android_tema1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class A2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_layout, new F1A2(), "first");
        fragmentTransaction.commit();
    }

    public void addSecondFragment(View view) {

        Fragment f2a2 = new F2A2();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, f2a2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void closeActivity(View view) {

        this.finish();
    }

    public void replaceFragment(View view) {
        Fragment f3a2 = new F3A2();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, f3a2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), A1.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);
    }

    public void removeFragment(View view){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("first");
        if(fragment!=null) fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();

        Toast toast = Toast.makeText(getApplicationContext(), "Removed", Toast.LENGTH_SHORT);
        toast.show();
    }
}
