package com.example.atest.search_result;

import androidx.lifecycle.ViewModel;

import com.example.atest.service.LoginService;
import com.example.atest.service.RxRetrofitManager;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.atest.login.LoginViewModel.preferencesHelperImp;

public class SearchLoadViewModel extends ViewModel {
    private LoginService rx_preService;

    public void  getPreInput(String so_id,String item_id){
        String token=preferencesHelperImp.getStringData();
        getRxPreData(so_id,item_id,token);
    }
    public void getRxPreData(String so_id,String item_id,String token){
        rx_preService=
                RxRetrofitManager.getInstance().RxgetPreData();
        rx_preService.getPrevManufature(so_id, item_id, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<PrevManufactureModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<PrevManufactureModel> prevManufactureModels) {

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
