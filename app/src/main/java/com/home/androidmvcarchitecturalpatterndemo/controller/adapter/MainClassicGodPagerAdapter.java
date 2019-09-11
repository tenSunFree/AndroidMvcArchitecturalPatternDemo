package com.home.androidmvcarchitecturalpatterndemo.controller.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.home.androidmvcarchitecturalpatterndemo.R;
import com.home.androidmvcarchitecturalpatterndemo.model.MainBean;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class MainClassicGodPagerAdapter extends PagerAdapter {

    private List<MainBean.ClassicGodBean> classicGodBeanList;

    @Override
    public int getCount() {
        return classicGodBeanList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.activity_main_classic_god_view_pager_item, container, false);
        ImageView img = view.findViewById(R.id.image_view);
        Glide.with(container.getContext()).load(classicGodBeanList.get(position).getImageUrl()).into(img);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    public void setClassicGod(List<MainBean.ClassicGodBean> classicGod) {
        this.classicGodBeanList = classicGod;
        notifyDataSetChanged();
    }
}