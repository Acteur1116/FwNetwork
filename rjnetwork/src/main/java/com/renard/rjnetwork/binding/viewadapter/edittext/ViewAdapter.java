package com.renard.rjnetwork.binding.viewadapter.edittext;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.renard.rjnetwork.binding.command.BindingCommand;

/**
 * Created by Riven_rabbit on 2019/1/9
 */
public class ViewAdapter {
    /**
     * EditText重新回去焦点的事件绑定
     */
    @BindingAdapter(value = {"requestFocus"},requireAll = false)
    public static void requestFocusCommand(EditText editText,final Boolean needRequestFocus){
        if (needRequestFocus){
            editText.setSelection(editText.getText().length());
            editText.requestFocus();
            InputMethodManager imm= (InputMethodManager) editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(editText,InputMethodManager.SHOW_IMPLICIT);
        }
        editText.setFocusableInTouchMode(needRequestFocus);
    }
    /**
     * EditText输入文字改变监听
     */
    @BindingAdapter(value = {"textChanged"},requireAll = false)
    public static void addTextChangedListener(EditText editText, final BindingCommand<String>textChanged){
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (textChanged != null) {
                    textChanged.execute(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
