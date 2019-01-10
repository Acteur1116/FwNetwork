package com.renard.rjnetwork.binding.viewadapter.image;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by Riven_rabbit on 2019/1/9
 */
public class ViewAdapter {
    @BindingAdapter(value = {"url","placeholderRes"},requireAll = false)
    public static void setImageUri(ImageView imageView,String url,int placeholderRes){
        if (!TextUtils.isEmpty(url)){
            //使用Glide加载图片
            Glide.with(imageView.getContext())
                    .load(url)
                    .apply(new RequestOptions().placeholder(placeholderRes))
                    .into(imageView);
        }
    }
}
