package com.example.matkaexhibitioncentre.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.matkaexhibitioncentre.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View View = inflater.inflate(R.layout.fragment_history, container, false);

       final RecyclerView rvHistory = View.findViewById(R.id.rv_history);
       final LinearLayoutManager LlManager = new LinearLayoutManager(this.getContext());
       rvHistory.setLayoutManager(LlManager);



        return View;
    }

}
