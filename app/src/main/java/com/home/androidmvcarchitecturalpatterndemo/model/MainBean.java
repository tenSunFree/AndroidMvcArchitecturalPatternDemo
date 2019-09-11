package com.home.androidmvcarchitecturalpatterndemo.model;

import java.util.List;

public class MainBean {

    private List<ClassicGodBean> classicGod;
    private List<MyComicsBean> myComics;

    MainBean(List<ClassicGodBean> classicGod, List<MyComicsBean> myComics) {
        this.classicGod = classicGod;
        this.myComics = myComics;
    }

    public List<ClassicGodBean> getClassicGod() {
        return classicGod;
    }

    public void setClassicGod(List<ClassicGodBean> classicGod) {
        this.classicGod = classicGod;
    }

    public List<MyComicsBean> getMyComics() {
        return myComics;
    }

    public void setMyComics(List<MyComicsBean> myComics) {
        this.myComics = myComics;
    }

    public static class ClassicGodBean {

        private String name;
        private String introduction;
        private String watch;
        private String imageUrl;

        ClassicGodBean(String name, String introduction, String watch, String imageUrl) {
            this.name = name;
            this.introduction = introduction;
            this.watch = watch;
            this.imageUrl = imageUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getWatch() {
            return watch;
        }

        public void setWatch(String watch) {
            this.watch = watch;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

    public static class MyComicsBean {

        private String name;
        private String imageUrl;

        MyComicsBean(String name, String imageUrl) {
            this.name = name;
            this.imageUrl = imageUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }
}
