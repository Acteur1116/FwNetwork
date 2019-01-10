package com.renard.rjnetwork.bus.event;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;

/**
 * Created by Riven_rabbit on 2019/1/9
 */
public class SnackbarMessage extends SingleLiveEvent<Integer> {

    public void observe(LifecycleOwner owner, final SnackbarObserver observer) {
        super.observe(owner, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer t) {
                if (t == null) {
                    return;
                }
                observer.onNewMessage(t);
            }
        });
    }

    public interface SnackbarObserver {
        /**
         * Called when there is a new message to be shown.
         * @param snackbarMessageResourceId The new message, non-null.
         */
        void onNewMessage(@StringRes int snackbarMessageResourceId);
    }
}
