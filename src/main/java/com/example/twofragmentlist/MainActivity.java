package com.example.twofragmentlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTabHost;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FragmentManager which is used to create transactions for
        // //adding, removing or replacing fragments.
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        transaction.add(R.id.frame1, fragmentA);
        transaction.commit();


    }

    public void fromFragmentAToB(String item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Log.i("It entered here", "yes");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        Bundle bundle = new Bundle();
        bundle.putString("item", item);
        fragmentB.setArguments(bundle);
        transaction.replace(R.id.frame1, fragmentB);
        transaction.commit();

    }
}
