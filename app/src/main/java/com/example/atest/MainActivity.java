package com.example.atest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.atest.choose.ChooseActivity;
import com.example.atest.databinding.ActivityMainBinding;
import com.example.atest.login.LoginActivity;
import com.example.atest.login.LoginViewModel;

import static com.example.atest.login.LoginActivity.loginViewModel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        Log.d("111", "onCreate: "+loginViewModel.liveData.getValue());
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        binding.name.setText(ts);
        binding.go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this, ChooseActivity.class);
                startActivity(intent1);
            }
        });


    }
}
