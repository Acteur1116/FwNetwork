package com.renard.rjnetwork.binding.viewadapter.swiperefresh;

import android.databinding.BindingAdapter;
import android.support.v4.widget.SwipeRefreshLayout;

import com.renard.rjnetwork.binding.command.BindingCommand;


/**
 * Created by Riven_rabbit on 2019/1/9
 */
public class ViewAdapter {
    @BindingAdapter({"onRefreshCommand"})
    public static void onRefreshCommand(SwipeRefreshLayout swipeRefreshLayout, final BindingCommand onRefreshCommand) {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (onRefreshCommand != null) {
                    onRefreshCommand.execute();
                }
            }
        });
    }

}
