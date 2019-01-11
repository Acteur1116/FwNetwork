package com.renard.rjnetwork.base;

import android.support.annotation.NonNull;

/**
 * Created by Riven_rabbit on 2019/1/11
 */
public class ItemViewModel <VM extends BaseViewModel> {
    protected VM viewModel;

    public ItemViewModel(@NonNull VM viewModel) {
        this.viewModel = viewModel;
    }
}
