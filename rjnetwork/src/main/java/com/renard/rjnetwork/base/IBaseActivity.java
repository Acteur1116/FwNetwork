package com.renard.rjnetwork.base;

/**
 * Created by Riven_rabbit on 2019/1/8
 */
public interface IBaseActivity {
    /**
     * 初始化界面传递参数
     */
    void initParam();
    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化界面观察者的监听
     */
    void initViewObservable();
}
