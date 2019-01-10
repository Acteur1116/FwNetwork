package com.renard.rjnetwork.bus;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by Riven_rabbit on 2019/1/9
 */
public abstract class RxBusSubscriber<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T t) {
        try {
            onEvent(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
    }

    @Override
    public void onComplete() {

    }
    protected abstract void onEvent(T t);
}
