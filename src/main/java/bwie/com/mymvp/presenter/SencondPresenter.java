package bwie.com.mymvp.presenter;

import bwie.com.mymvp.model.NetUtil;
import bwie.com.mymvp.view.interfaces.ISencondView;

public class SencondPresenter extends BasePresenter<ISencondView> {
    private final String liYunLong;
    private ISencondView iSencondView;

    public SencondPresenter() {
        liYunLong = NetUtil.getLiYunLong();
    }
    public void getDataFromServer(){
        getiBaseView().onSuccess(liYunLong);
    }


}
