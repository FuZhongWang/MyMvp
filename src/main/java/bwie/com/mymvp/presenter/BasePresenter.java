package bwie.com.mymvp.presenter;


import bwie.com.mymvp.view.interfaces.IBaseView;

public class BasePresenter<T extends IBaseView>{
    private T iBaseView;

    public void  attachView(T iBaseView){
        this.iBaseView=iBaseView;

    }

    public T getiBaseView() {
        return iBaseView;
    }
}
