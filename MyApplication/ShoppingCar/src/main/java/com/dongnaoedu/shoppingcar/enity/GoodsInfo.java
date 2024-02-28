package com.dongnaoedu.shoppingcar.enity;

import com.dongnaoedu.shoppingcar.R;

import java.util.ArrayList;

public class GoodsInfo {

    public int id;
    // 名称
    public String name;
    // 描述
    public String description;
    // 价格
    public float price;
    // 大图的保存路径
    public String picPath;
    // 大图的资源编号
    public int pic;

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "MacBook Air", "小新Pro14", "华为MateBook D14", "XiaomiBook Pro", "v联想ThinkBook", "Xiaomi/小米"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "MacBook Air 教育22款 M2八核/8/256/深空灰XW3",
            "小新Pro14 2022款酷睿I5-12500H/锐炬显卡/2.8K/90HZ/14英寸/银",
            "华为MateBook D14 2023款D14 i5-1340P/16GB/512GB/锐炬显卡皓月银（13代新品)",
            "XiaomiBook小米笔记本Pro 16/14寸2022款4K触控2050独显 OLED电脑",
            "v联想ThinkBook 14+ 2023款13代英特尔酷睿 i5-13500H/RTX3050独显/2.8K屏/苍岩灰",
            "Xiaomi/小米 Redmi G 游戏本 2021款锐龙笔记本电脑  J 22新款PRO i7-12650H-3050TI 165HZ"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6640, 4599, 4299, 3778, 6449, 5080};
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.macbookair, R.drawable.xiaoxinpro14, R.drawable.huaweimatebook,
            R.drawable.xiaomibook, R.drawable.thinkbook, R.drawable.xiaomi
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.id = i;
            info.name = mNameArray[i];
            info.description = mDescArray[i];
            info.price = mPriceArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
