package bwie.com.mymvp.view.activity;

import android.os.Bundle;
import android.util.Log;


import bwie.com.mymvp.R;

import bwie.com.mymvp.presenter.MainPresenter;
import bwie.com.mymvp.view.interfaces.IMainView;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainView {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void initData() {
        MainPresenter basePresenter = getBasePresenter();
        if (basePresenter!=null){
            basePresenter.getDataFromServer();
        }else{

            try {
                throw new Exception("mainpresenter为空");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public MainPresenter intiBasePresenter() {
        return new MainPresenter();
    }


    @Override
    public void onSuccess(String str) {
        Log.e("fzw", "onSuccess: "+str );
    }
}
