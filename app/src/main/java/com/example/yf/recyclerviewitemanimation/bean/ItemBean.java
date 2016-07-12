package com.example.yf.recyclerviewitemanimation.bean;

import java.io.Serializable;

/**
 * Created by YF on 2016/7/12.
 */
public class ItemBean implements Serializable {

    private boolean isChecked;

    public boolean isChecked(){
        return isChecked;
    }

    public void setChecked(boolean checked){
        isChecked = checked;
    }
}
