package com.renard.rjnetwork.binding.viewadapter.viewgroup;

/**
 * Created by Riven_rabbit on 2019/1/9
 */

import android.databinding.ViewDataBinding;

public interface IBindingItemViewModel<V extends ViewDataBinding> {
    void injecDataBinding(V binding);
}
