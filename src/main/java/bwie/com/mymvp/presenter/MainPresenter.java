package bwie.com.mymvp.presenter;



import bwie.com.mymvp.model.NetUtil;
import bwie.com.mymvp.view.interfaces.IMainView;

public class MainPresenter extends BasePresenter<IMainView> {
    private  String data;

    public MainPresenter() {
        data = NetUtil.getData();
    }
    public void getDataFromServer(){
        getiBaseView().onSuccess(data);
    }

}
