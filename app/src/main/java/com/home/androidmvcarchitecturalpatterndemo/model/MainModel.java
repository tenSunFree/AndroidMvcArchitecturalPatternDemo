package com.home.androidmvcarchitecturalpatterndemo.model;

import java.util.ArrayList;
import java.util.List;

public class MainModel {

    public interface OnMainDataListener {
        void onSuccess(MainBean mainData);
    }

    public void getMainData(OnMainDataListener onMainDataListener) {
        MainBean mainData = new MainBean(getClassicGodData(), getMyComicsData());
        onMainDataListener.onSuccess(mainData);
    }

    private List<MainBean.ClassicGodBean> getClassicGodData() {
        List<MainBean.ClassicGodBean> classicGodBeanList = new ArrayList<>();
        MainBean.ClassicGodBean classicGodBean;
        classicGodBean = new MainBean.ClassicGodBean("七龍珠",
                "地球上有七顆龍珠，每顆七龍珠分別有一至七顆星的標記。七顆龍珠並散布於世界各地，只要集齊它們便可以召喚出神龍，神龍可以滿足召喚者的一個任何願望，龍珠在神龍實現願望後就會變成石頭並自動飛散到世界各地，一年後才會恢復成龍珠。",
                "996453",
                "https://images.chinatimes.com/newsphoto/2018-09-03/900/20180903002816.jpg");
        classicGodBeanList.add(classicGodBean);
        classicGodBean = new MainBean.ClassicGodBean("海賊王",
                "主角蒙其．D．魯夫為了要實現與「紅髮」傑克的約定而出海，在遙遠的路途上找尋著志同道合的夥伴，一起進入「偉大的航道」，目標是得到「ONE PIECE」與成為「海賊王」。",
                "775432",
                "https://www.books.com.tw/img/N00/029/53/N000295364_t_01.jpg");
        classicGodBeanList.add(classicGodBean);
        classicGodBean = new MainBean.ClassicGodBean("灌籃高手",
                "為討好同級暗戀對象赤木晴子的歡心，原來毫無籃球基礎的櫻木花道未仔細考慮就加入了籃球隊，然而晴子卻喜歡從初中起就一直是明星球員的流川楓。櫻木的潛質加上不服輸精神，飛速進步，漸成湘北球隊不可缺的主力球員",
                "885634",
                "https://img.mplus.com.tw/images/article/slam_dunk.jpg");
        classicGodBeanList.add(classicGodBean);
        classicGodBean = new MainBean.ClassicGodBean("火影忍者",
                "12年前，一隻被稱為九尾妖狐的尾獸襲擊木葉忍者村，傳說它一揮動尾巴就會山崩海嘯。第四代火影犧牲自己的性命，把九尾封印在剛出生的兒子漩渦鳴人身上。",
                "563456",
                "https://static.juksy.com/files/articles/42608/567a996236f26.jpg?m=widen&i=800&q=75");
        classicGodBeanList.add(classicGodBean);
        classicGodBean = new MainBean.ClassicGodBean("新世紀福音戰士",
                "2000年，一個科學探險隊在南極洲針對被稱作「第一使徒」亞當的「光之巨人」進行探險。在對其進行接觸實驗時，「光之巨人」自毀，從而發生了「第二次衝擊」，還導致到世界大戰。",
                "863456",
                "https://pic.pimg.tw/a2322322004/1435233310-2135354543_n.jpg");
        classicGodBeanList.add(classicGodBean);
        classicGodBean = new MainBean.ClassicGodBean("哆啦Ａ夢",
                "主角野比大雄，是家中唯一獨子，住在日本東京都練馬區月見台茫原（地名虛構）的小學生和來自未來22世紀的貓型機器人哆啦A夢共同生活。",
                "463456",
                "https://n.sinaimg.cn/fashion/20170901/F0WY-fykpyuf8617083.jpg");
        classicGodBeanList.add(classicGodBean);
        return classicGodBeanList;
    }

    private List<MainBean.MyComicsBean> getMyComicsData() {
        List<MainBean.MyComicsBean> myComicsBeanList = new ArrayList<>();
        MainBean.MyComicsBean myComicsBean;
        myComicsBean = new MainBean.MyComicsBean("七龍珠",
                "https://images.chinatimes.com/newsphoto/2018-09-03/900/20180903002816.jpg");
        myComicsBeanList.add(myComicsBean);
        myComicsBean = new MainBean.MyComicsBean("灌籃高手",
                "https://img.mplus.com.tw/images/article/slam_dunk.jpg");
        myComicsBeanList.add(myComicsBean);
        myComicsBean = new MainBean.MyComicsBean("新世紀福音戰士",
                "https://pic.pimg.tw/a2322322004/1435233310-2135354543_n.jpg");
        myComicsBeanList.add(myComicsBean);
        return myComicsBeanList;
    }
}
