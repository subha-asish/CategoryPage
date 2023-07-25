package com.example.putatoecategory;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class parentadapter extends RecyclerView.Adapter<parentadapter.ViewHolder> {
    List<parentmodelclass> parentmodelClassList;
    Context context;

    public parentadapter(List<parentmodelclass> parentmodelClassList, Context context) {
        this.parentmodelClassList = parentmodelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public parentadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.parent_rv_layout,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull parentadapter.ViewHolder holder, int position) {
        holder.categoryName.setText(parentmodelClassList.get(position).title);
        childadapter childadapter = new childadapter(parentmodelClassList.get(position).li,context);

        holder.rv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        holder.rv.setAdapter(childadapter);
        childadapter.notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return parentmodelClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView rv;
        TextView categoryName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.rv = itemView.findViewById(R.id.rv_child);
            this.categoryName = itemView.findViewById(R.id.tv_parent_title);

        }
    }
}

