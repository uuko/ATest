package com.example.atest.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.atest.MainActivity;
import com.example.atest.R;
import com.example.atest.databinding.ActivityLoginBinding;

import io.reactivex.disposables.Disposable;

public class LoginActivity extends AppCompatActivity {
    public static LoginViewModel loginViewModel;
    private ActivityLoginBinding mActivityLoginBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d("111", "onCreate: ");
        loginViewModel=new LoginViewModel(getApplication());
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        final ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginViewModel.onClickEmailSignin(binding.username.getText().toString(),binding.userpw.getText().toString());

            }
        });

        loginViewModel.getGameList().observe(this, mutableLiveData -> {
            // update UI
            Log.d("1112", "onCreate: ");
            Log.d("1112", "onCreate: "+mutableLiveData);
            Intent intent=new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
