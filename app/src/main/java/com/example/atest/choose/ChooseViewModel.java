package com.example.atest.choose;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.atest.Shareperference.PreferencesHelperImp;
import com.example.atest.login.LoginTokenModel;
import com.example.atest.service.LoginService;
import com.example.atest.service.RxRetrofitManager;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.atest.login.LoginViewModel.preferencesHelperImp;

public class ChooseViewModel extends ViewModel {
    public  MutableLiveData<List<ChooseModel>> liveData = new MutableLiveData<>();
    public  MutableLiveData<List<ChoosenMoModel>> moLiveData=new MutableLiveData<>();
    private List<ChooseModel> chooseModelList=new ArrayList<ChooseModel>();
    private List<ChoosenMoModel> chooseMo_ModelList=new ArrayList<ChoosenMoModel>();
    private LoginService rxloginService=
            RxRetrofitManager.getInstance().RxgetCustomer();
    private LoginService morxService=RxRetrofitManager.getInstance().RxgetMoId();
    public void onGetSaleOrderId(String customer_name){
        String token=preferencesHelperImp.getStringData();
        Log.d("cus", "onGetSaleOrderId: "+customer_name+"token"+token);
        String custom_namex=customer_name;
        onClickCustom(custom_namex,token);
    }
    public void onGetMoId(String mo_id){
        String token=preferencesHelperImp.getStringData();
        String mo_idx=mo_id;
        Log.d("mo", "onGetMoId: ");
        onClickMo(mo_idx,token);
    }

    public LiveData<List<ChooseModel>> getCustomList() {
        return liveData;
    }

    public LiveData<List<ChoosenMoModel>> getMoList(){
        return moLiveData;
    }

    public void onClickCustom(String customer_name, String token) {
        rxloginService.getRxChooseData(customer_name, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ChooseModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<ChooseModel> chooseModels) {
                        Log.d("cus", "onNext: "+chooseModels.size());
                        for (int i=0;i<chooseModels.size();i++){
                            chooseModelList.add(chooseModels.get(i));
                            liveData.setValue(chooseModelList);
                            Log.d("cus", "onNext: "+liveData.getValue().get(i).getCustomer_name());
                        }

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void onClickMo(String mo_id,String token) {
        morxService.getRxChoosenMoData(mo_id, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ChoosenMoModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                    @Override
                    public void onNext(List<ChoosenMoModel> choosenMoModels) {
                        for (int i = 0; i < choosenMoModels.size(); i++) {
                            chooseMo_ModelList.add(choosenMoModels.get(i));
                            moLiveData.setValue(chooseMo_ModelList);
                            Log.d("cus", "onNext: " + moLiveData.getValue().get(i).getMo_id());
                        }
                    }
                    @Override
                    public void onError(Throwable e) {

                    }
                    @Override
                    public void onComplete() {

                    }
                });
    }
}
