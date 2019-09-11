package com.home.androidmvcarchitecturalpatterndemo.controller.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.home.androidmvcarchitecturalpatterndemo.R;
import com.home.androidmvcarchitecturalpatterndemo.model.MainBean;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MainMyComicsRecyclerViewAdapter
        extends RecyclerView.Adapter<MainMyComicsRecyclerViewAdapter.ViewHolder> {

    private List<MainBean.MyComicsBean> myComicsBeanList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main_my_comics_recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (position == myComicsBeanList.size()) {
            holder.generalConstraintLayout.setVisibility(View.GONE);
            holder.comeBackConstraintLayout.setVisibility(View.VISIBLE);
        } else {
            holder.generalConstraintLayout.setVisibility(View.VISIBLE);
            holder.comeBackConstraintLayout.setVisibility(View.GONE);
            Glide.with(holder.imageView.getContext())
                    .load(myComicsBeanList.get(position).getImageUrl()).into(holder.imageView);
            holder.nameTextView.setText(myComicsBeanList.get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        return myComicsBeanList.size() + 1;
    }

    public void setMyComics(List<MainBean.MyComicsBean> myComicsBeanList) {
        this.myComicsBeanList = myComicsBeanList;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ConstraintLayout generalConstraintLayout, comeBackConstraintLayout;
        private ImageView imageView;
        private TextView nameTextView;

        ViewHolder(View itemView) {
            super(itemView);
            generalConstraintLayout = itemView.findViewById(R.id.constraint_layout_general);
            comeBackConstraintLayout = itemView.findViewById(R.id.constraint_layout_come_back);
            imageView = itemView.findViewById(R.id.image_view);
            nameTextView = itemView.findViewById(R.id.text_view_name);
        }
    }
}
