package com.home.androidmvcarchitecturalpatterndemo.controller.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.home.androidmvcarchitecturalpatterndemo.R;
import com.home.androidmvcarchitecturalpatterndemo.controller.adapter.MainClassicGodPagerAdapter;
import com.home.androidmvcarchitecturalpatterndemo.controller.adapter.MainMyComicsRecyclerViewAdapter;
import com.home.androidmvcarchitecturalpatterndemo.model.MainBean;
import com.home.androidmvcarchitecturalpatterndemo.model.MainModel;
import com.home.androidmvcarchitecturalpatterndemo.utils.ZoomOutPageTransformer;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMainData();
    }

    private void getMainData() {
        MainModel mainModel = new MainModel();
        mainModel.getMainData(new MainModel.OnMainDataListener() {
            @Override
            public void onSuccess(MainBean mainData) {
                initializeViewPager(mainData.getClassicGod());
                initializeRecyclerView(mainData.getMyComics());
            }
        });
    }

    private void initializeViewPager(final List<MainBean.ClassicGodBean> classicGod) {
        final MainClassicGodPagerAdapter adapter = new MainClassicGodPagerAdapter();
        adapter.setClassicGod(classicGod);
        final ViewPager classicGodViewPager = findViewById(R.id.view_pager_classic_god);
        classicGodViewPager.setAdapter(adapter);
        classicGodViewPager.setOffscreenPageLimit(classicGod.size()); // 設置預加載數量
        classicGodViewPager.setPageMargin(0); // 控制兩幅圖之間的間距
        classicGodViewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        findViewById(R.id.constraint_layout_root).setOnTouchListener(new View.OnTouchListener() { // ViewPager左右兩邊滑動無效的處理
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return classicGodViewPager.dispatchTouchEvent(motionEvent);
            }
        });
        classicGodViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }

            @Override
            public void onPageSelected(int position) {
                TextView classicGodNameTextView = findViewById(R.id.text_view_classic_god_name);
                classicGodNameTextView.setText(classicGod.get(position).getName());
                TextView classicGodAmountTextView = findViewById(R.id.text_view_classic_god_amount);
                classicGodAmountTextView.setText(classicGod.get(position).getWatch());
                TextView classicGodIntroductionTextView = findViewById(R.id.text_view_classic_god_introduction);
                classicGodIntroductionTextView.setText(classicGod.get(position).getIntroduction());
            }
        });
        classicGodViewPager.setCurrentItem(1);
        classicGodViewPager.setCurrentItem(0);
    }

    private void initializeRecyclerView(List<MainBean.MyComicsBean> myComics) {
        MainMyComicsRecyclerViewAdapter adapter = new MainMyComicsRecyclerViewAdapter();
        adapter.setMyComics(myComics);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_my_comics);
        recyclerView.setAdapter(adapter);
    }
}
