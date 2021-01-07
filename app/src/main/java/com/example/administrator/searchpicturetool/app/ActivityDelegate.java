package com.example.administrator.searchpicturetool.app;

import android.app.Activity;
import android.os.Bundle;

import com.jude.beam.bijection.ActivityLifeCycleDelegate;

/**
 * Created by wenhuaijun on 2015/11/10 0010.
 */
public class ActivityDelegate extends ActivityLifeCycleDelegate{
    public ActivityDelegate(Activity act) {
        super(act);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  APP.getInstance().mRefWatcher.watch(getActivity());
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
