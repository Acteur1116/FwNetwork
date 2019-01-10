package com.renard.rjnetwork.binding.viewadapter.spinner;

/**
 * Created by Riven_rabbit on 2019/1/9
 * 下拉Spinner控件的键值对, 实现该接口,返回key,value值, 在xml绑定List<IKeyAndValue>
 */
public interface IKeyAndValue {
    String getKey();

    String getValue();
}
