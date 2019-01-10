package com.renard.rjnetwork.binding.viewadapter.checkbox;

import android.databinding.BindingAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.renard.rjnetwork.binding.command.BindingCommand;

/**
 * Created by Riven_rabbit on 2019/1/9
 */
public class ViewAdapter {
    @SuppressWarnings("unchecked")
    @BindingAdapter(value = {"onCheckedChangedCommand"},requireAll = false)
    public static void setCheckedChanged(final CheckBox checkBox,final BindingCommand<Boolean> bindingCommand){
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                bindingCommand.execute(b);
            }
        });
    }
}
