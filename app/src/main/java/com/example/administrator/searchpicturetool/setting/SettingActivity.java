package com.example.administrator.searchpicturetool.setting;

import android.os.Bundle;

import com.example.administrator.searchpicturetool.R;
import com.jude.beam.bijection.RequiresPresenter;
import com.jude.beam.expansion.BeamBaseActivity;
import com.jude.utils.JUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wenhuaijun on 2015/11/14 0014.
 */
@RequiresPresenter(SettingPresenter.class)
public class SettingActivity extends BeamBaseActivity<SettingPresenter>{
    androidx.appcompat.widget.SwitchCompat compat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
        compat = (androidx.appcompat.widget.SwitchCompat)findViewById(R.id.setting_switch);
        if(JUtils.getSharedPreference().getBoolean("shouldPush",true)){
            compat.setChecked(true);
        }else{
            compat.setChecked(false);
        }
    }
    @OnClick(R.id.setting_response)
    public void response(){

    }
    @OnClick(R.id.setting_update)
    public void update(){
    }
    @OnClick(R.id.setting_switch)
    public void openSwitch(){

    }
}
