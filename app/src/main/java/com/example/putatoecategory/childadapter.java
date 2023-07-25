package com.example.putatoecategory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class childadapter extends RecyclerView.Adapter<childadapter.ViewHolder> {
    List<childmodelClass> childmodelClassList;
    Context context;

    public childadapter(List<childmodelClass> childmodelClassList, Context context) {
        this.childmodelClassList = childmodelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public childadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.child_rv_layout,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull childadapter.ViewHolder holder, int position) {

        childmodelClass childmodelClass = childmodelClassList.get(position);
        holder.productrname.setText(String.valueOf(childmodelClassList.get(position).getName()));
        holder.disc.setText(String.valueOf(childmodelClassList.get(position).getDiscount()));

        String url;
        url = childmodelClass.getImage();
        Picasso.get().load(url).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return childmodelClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView productrname;
        TextView disc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.child_iv);
            this.productrname = itemView.findViewById(R.id.child_productName);
            this.disc = itemView.findViewById(R.id.child_productDiscount);
        }
    }
}
