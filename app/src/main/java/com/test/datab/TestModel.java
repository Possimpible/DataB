package com.test.datab;

import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;


public class TestModel extends BaseObservable {

    public void textClick(final View view) {
        Log.d("TAG", "textClick(): " + "view = [" + view + "]");
    }

    public void customViewClick(final View view) {
        Log.d("TAG", "customViewClick(): " + "view = [" + view + "]");
    }

}
