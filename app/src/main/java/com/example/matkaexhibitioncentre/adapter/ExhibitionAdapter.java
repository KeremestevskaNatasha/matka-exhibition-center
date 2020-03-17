package com.example.matkaexhibitioncentre.adapter;


import android.content.Context;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.matkaexhibitioncentre.MatkaItems;
import com.example.matkaexhibitioncentre.R;

import java.util.List;

public class ExhibitionAdapter extends RecyclerView.Adapter<ExhibitionAdapter.ExhibitionViewHolder> implements View.OnClickListener {

public List<MatkaItems> items;
public List <MediaStore.Video> videos;
   Context mContext;

    public ExhibitionAdapter(List<MatkaItems> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ExhibitionAdapter.ExhibitionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View mView = inflater.inflate(R.layout.items_exhibition, parent, false);

        ExhibitionViewHolder viewHolder =new ExhibitionViewHolder(mView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ExhibitionViewHolder holder, int position ) {

        final MatkaItems matkaItems = items.get(holder.getAdapterPosition());
          holder.tvDetailName.setText(matkaItems.getTitle());
          holder.tvDetailsDescription.setText(matkaItems.getDescription());
        String uri = matkaItems.getUrl();
        Glide.with(holder.imgDetails.getContext()).load(uri).into(holder.imgDetails);




    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class ExhibitionViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgDetails;
        public TextView  tvDetailName;
        public TextView tvDetailsDescription;


        public ExhibitionViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDetails = itemView.findViewById(R.id.details_img);
            tvDetailName = itemView.findViewById(R.id.details_name);
            tvDetailsDescription =itemView.findViewById(R.id.details_description);




        }
    }
}
