package com.example.matkaexhibitioncentre.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.matkaexhibitioncentre.MatkaItems;
import com.example.matkaexhibitioncentre.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExhibitionFragment extends Fragment {


    List<MatkaItems> itemsList;

    public ExhibitionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View View = inflater.inflate(R.layout.fragment_exhibition, container, false);
         final RecyclerView rvExhibits = View.findViewById(R.id.rv_exhibits);
         final LinearLayoutManager llManager = new LinearLayoutManager(this.getContext());
          rvExhibits.setLayoutManager(llManager);

        String title = "";
        if (getArguments() != null) {
            title = getArguments().getString("title");
        }
         final List<MatkaItems> itemsList = new ArrayList<>();

        List<MatkaItems> AllItems = getAllItems();

        for (int i = 0; i < AllItems.size(); i++) {
            MatkaItems matkaitems = AllItems.get(i);


            if (matkaitems.getTitle().equals(title)){
                itemsList.add(matkaitems);
            }

//          final NavPageAdapter adapterNav = new NavPageAdapter(getContext(),itemsList);
//            rvExhibits.setAdapter(adapterNav);
        }


        return View;
    }

    private List<MatkaItems> getAllItems() {
        return  itemsList;
    }


}
