package bwie.com.mymvp.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import bwie.com.mymvp.presenter.BasePresenter;
import bwie.com.mymvp.view.interfaces.IBaseView;


public abstract class BaseActivity<X extends BasePresenter> extends AppCompatActivity implements IBaseView{
    private X basePresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basePresenter=intiBasePresenter();
        basePresenter.attachView(this);
        initData();
    }
    public X getBasePresenter(){

        return basePresenter;
    }
    public abstract void initData();
    public abstract X intiBasePresenter();
}
