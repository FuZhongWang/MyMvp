package bwie.com.mymvp.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import bwie.com.mymvp.presenter.SencondPresenter;
import bwie.com.mymvp.view.interfaces.ISencondView;

public class SecondActivity extends BaseActivity<SencondPresenter> implements ISencondView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void initData() {
        SencondPresenter basePresenter = getBasePresenter();
        basePresenter.getDataFromServer();
    }

    @Override
    public SencondPresenter intiBasePresenter() {
        return new SencondPresenter();
    }

    @Override
    public void onSuccess(String string) {
        Log.e("fzw", "onSuccess: "+string );
    }
}
