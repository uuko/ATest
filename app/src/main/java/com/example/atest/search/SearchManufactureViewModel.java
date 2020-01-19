package com.example.atest.search;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.atest.choose.ChooseModel;
import com.example.atest.service.LoginService;
import com.example.atest.service.RxRetrofitManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.atest.login.LoginViewModel.preferencesHelperImp;

public class SearchManufactureViewModel extends ViewModel {
    private LoginService searchservice= RxRetrofitManager.getInstance().RxgetManufactureData();
    private List<SearchManufactureModel> searchManufactureModelList=new ArrayList<SearchManufactureModel>();
    public MutableLiveData<List<SearchManufactureModel>> searchManufactureModelMutableLiveData=new MutableLiveData<>();

    public LiveData<List<SearchManufactureModel>> getSearchList() {
        return searchManufactureModelMutableLiveData;
    }

    public void onGetManuFactureInput(String manufacture,String customer,String online_date,String sale_order){
        String token=preferencesHelperImp.getStringData();
        Log.d("s", "onGetManuFactureInput: "+manufacture+customer+online_date+sale_order);
        getManufactureItem("11",manufacture,customer,online_date,sale_order,token);

    }

    public void getManufactureItem( String routing_level, String manufacture, String customer
            , String online_date, String sale_order,  String token){
        searchservice.getManufactureItem(routing_level, manufacture, customer, online_date, sale_order, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<SearchManufactureModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<SearchManufactureModel> searchManufactureModels) {
                        for (int i=0;i<searchManufactureModels.size();i++){
                            searchManufactureModelList.add(searchManufactureModels.get(i));
                        }
                      searchManufactureModelMutableLiveData.setValue(searchManufactureModelList);
                        Log.d("cus", "onNext: "+searchManufactureModelMutableLiveData.getValue().get(0).getCustomer());
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
