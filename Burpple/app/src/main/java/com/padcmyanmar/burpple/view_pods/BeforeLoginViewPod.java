package com.padcmyanmar.burpple.view_pods;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;


import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.delegates.BeforeLoginDelegate;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by eidoshack on 1/23/18.
 */

public class BeforeLoginViewPod extends RelativeLayout {

    private BeforeLoginDelegate mDelegate;

    public BeforeLoginViewPod(Context context) {
        super(context);
    }

    public BeforeLoginViewPod(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BeforeLoginViewPod(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this,this);
    }

    public void setDelegate(BeforeLoginDelegate delegate) {
      mDelegate = delegate;
    }

    @OnClick(R.id.btn_login)
    public void onTapToLogin(View view){
        mDelegate.onTapToLogin();
    }
    @OnClick(R.id.btn_register)
    public void onTapToRegister(View view){
        mDelegate.onTapToRegister();
    }
}
