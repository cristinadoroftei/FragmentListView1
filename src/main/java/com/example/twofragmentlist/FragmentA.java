package com.example.twofragmentlist;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {


    ListView listView;
    ArrayList<String> arrayList;
    //the adapter is like a bridge between the arraylist and the view
    ArrayAdapter<String> arrayAdapter;


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        //initialize the attributes
        listView = view.findViewById(R.id.listFragmentA);
        arrayList = new ArrayList<String>();
        //getActivity() returns the Activity this fragment is currently associated with
        arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1, arrayList);
        listView.setAdapter(arrayAdapter);
        arrayList.add("Cristina");
        arrayList.add("Marian");
        arrayList.add("Chris");
        arrayList.add("Sophie");
        arrayList.add("Anna");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = arrayList.get(position);
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.fromFragmentAToB(item);

            }
        });
        return view;
    }

}
