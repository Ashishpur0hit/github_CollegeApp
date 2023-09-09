package com.example.collegeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {


    private Context context;
    private ArrayList<PostModel> list;







    public PostAdapter (Context context , ArrayList<PostModel>list)
    {

        this.context = context;
        this.list = list;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.postcard , parent , false);
        ViewHolder postview = new ViewHolder(v);
        return postview;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Caption.setText(list.get(position).Caption);
        Glide.with(context).load(list.get(position).getPostImage()).into(holder.Image);
        holder.Name.setText(list.get(position).Name);
        Glide.with(context).load(list.get(position).getProfile()).into(holder.Profile);
        holder.Institute.setText(list.get(position).Institute);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder
    {

        TextView Caption, Name,Institute;
        ImageView Image , Profile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Caption = itemView.findViewById(R.id.caption);
            Image = itemView.findViewById(R.id.UploadedImage);
            Profile  = itemView.findViewById(R.id.ProfilePic);
            Name = itemView.findViewById(R.id.UserName) ;
            Institute = itemView.findViewById(R.id.Institute);
        }
    }
}
