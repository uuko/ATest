package com.example.atest.login;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.atest.LoginModel;
import com.example.atest.Shareperference.PreferencesHelperImp;
import com.example.atest.service.LoginService;
import com.example.atest.service.RxRetrofitManager;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginViewModel extends AndroidViewModel {
    public static MutableLiveData<String> liveData = new MutableLiveData<>();
    private LoginService rxloginService=
            RxRetrofitManager.getInstance().RxgetLoginData();
    private LoginService mainrxloginService=RxRetrofitManager.getInstance().RxgetLoginToken();

    public ObservableField<String> account = new ObservableField<>();
    private String user_account;
    public static PreferencesHelperImp preferencesHelperImp;

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<String> getGameList() {
        Log.d("1112", "getGameList: "+liveData.getValue());
        return liveData;
    }

    public void onClickEmailSignin(String email, String password) {
        Log.d("111", ""+email+password);
        preferencesHelperImp=new PreferencesHelperImp(getApplication().getApplicationContext());
        rxloginService.rxGetLoginToken(email, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginTokenModel>() {

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginTokenModel loginTokenModel) {
                        String token=loginTokenModel.getToken();
                        preferencesHelperImp.setStringData(token);
                        getRxLoginAccout(token);
                        Log.d("test", "token: "+token);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("", "onError: "+e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void getRxLoginAccout(String token){
        mainrxloginService=
                RxRetrofitManager.getInstance().RxgetLoginData();
        rxloginService.getRxLoginImformation(token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginModel loginModel) {

                        init(loginModel.getName());

                        Log.d("1112", "onNext111: "+liveData);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void init(String value){
        liveData.postValue(value);
        account.set(liveData.getValue());
        Log.d("112", "init: "+account);
    }



    public boolean isEmailAndPasswordValid(String email, String password) {
        // validate email and password
        if (TextUtils.isEmpty(email)) {
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            return false;
        }
        return true;
    }

}
