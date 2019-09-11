package com.home.androidmvcarchitecturalpatterndemo.utils;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

/**
 * 設置切換動畫
 */
public class ZoomOutPageTransformer implements ViewPager.PageTransformer {

    // 自由控制縮放比例
    private static final float MAX_SCALE = 1f;
    private static final float MIN_SCALE = 0.88f;

    @Override
    public void transformPage(@NonNull View page, float position) {
        if (position <= 1) {
            float scaleFactor = MIN_SCALE + (1 - Math.abs(position)) * (MAX_SCALE - MIN_SCALE);
            page.setScaleX(scaleFactor);
            if (position > 0) {
                page.setTranslationX(-scaleFactor * 2);
            } else if (position < 0) {
                page.setTranslationX(scaleFactor * 2);
            }
            page.setScaleY(scaleFactor);
        } else {
            page.setScaleX(MIN_SCALE);
            page.setScaleY(MIN_SCALE);
        }
    }
}