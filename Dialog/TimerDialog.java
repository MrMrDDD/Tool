package com.example.cn.application.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.cn.application.R;

public class TimerDialog extends Dialog {
    public TimerDialog(@NonNull Context context) {
        super(context);
    }

    public TimerDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected TimerDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);
    }
}
