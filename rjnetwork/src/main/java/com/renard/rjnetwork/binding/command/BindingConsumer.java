package com.renard.rjnetwork.binding.command;

/**
 * Created by Riven_rabbit on 2019/1/9
 */
public interface BindingConsumer<T> {
    void call(T t);
}
