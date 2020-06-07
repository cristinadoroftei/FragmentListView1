package com.example.twofragmentlist;


import android.icu.util.ValueIterator;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    TextView textView;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = view.findViewById(R.id.textView);
        Bundle bundle = getArguments();
        if (bundle != null){
            String item = bundle.getString("item");
            Log.i("Bundle is:", item);
            textView.setText(item);
        }
        return view;
    }

}
