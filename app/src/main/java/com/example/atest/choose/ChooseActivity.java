package com.example.atest.choose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.atest.MainActivity;
import com.example.atest.R;
import com.example.atest.databinding.ActivityChooseBinding;
import com.example.atest.login.LoginActivity;
import com.example.atest.login.LoginViewModel;
import com.example.atest.search.SearchActivity;
import com.example.atest.search.SearchManufactureModel;
import com.example.atest.search.SearchManufactureViewModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import io.reactivex.Observer;

public class ChooseActivity extends AppCompatActivity {
    private ActivityChooseBinding chooseBinding;
    private ChooseViewModel chooseViewModel;
    public static SearchManufactureViewModel searchManufactureViewModel;
    private String inputData = new ChooseData().customer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        chooseViewModel = ViewModelProviders.of(this).get(ChooseViewModel.class);

        chooseBinding= DataBindingUtil.setContentView(this,R.layout.activity_choose);
        chooseBinding.custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String custom_name=chooseBinding.customId.getText().toString();
                chooseViewModel.onGetSaleOrderId(custom_name);
                Log.d("cus", "onClick: ");
            }
        });
        chooseViewModel.getCustomList().observe(this, liveData -> {
            // update UI
            List<String> custom=new ArrayList<String>();
            Log.d("1112", "onCreate: ");
            Log.d("1112", "onCreate: "+liveData.get(0).getCustomer_name());
            for (int x=0;x<liveData.size();x++){
               custom.add(liveData.get(x).getCustomer_name());

            }
            final String[] dinner=custom.stream().toArray(n -> new String[n]);
            AlertDialog.Builder dialog_list = new AlertDialog.Builder(ChooseActivity.this);
            AlertDialog OptionDialog = dialog_list.create();
            dialog_list.setItems(dinner, new DialogInterface.OnClickListener(){
                @Override
                //只要你在onClick處理事件內，使用which參數，就可以知道按下陣列裡的哪一個了
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
                    Toast.makeText(ChooseActivity.this, "你選的是" + dinner[which], Toast.LENGTH_SHORT).show();
                    chooseBinding.customId.setText(dinner[which]);
                    OptionDialog.dismiss();
                }
            });
            dialog_list.show();

        });
        chooseBinding.manufacture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mo_id=chooseBinding.moId.getText().toString();
                chooseViewModel.onGetMoId(mo_id);
            }
        });
        chooseViewModel.getMoList().observe(this, moLiveData -> {
            // update UI
            List<String> mo=new ArrayList<String>();
            Log.d("1112", "onCreate: ");
            Log.d("1112", "onCreate: "+moLiveData.get(0).getMo_id());
            for (int x=0;x<moLiveData.size();x++){
                mo.add(moLiveData.get(x).getMo_id());
            }
            final String[] mo_id=mo.stream().toArray(n -> new String[n]);
            AlertDialog.Builder dialog_list = new AlertDialog.Builder(ChooseActivity.this);
            AlertDialog OptionDialog = dialog_list.create();
            dialog_list.setTitle("利用List呈現");
            dialog_list.setItems(mo_id, new DialogInterface.OnClickListener(){
                @Override
                //只要你在onClick處理事件內，使用which參數，就可以知道按下陣列裡的哪一個了
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
                    Toast.makeText(ChooseActivity.this, "你選的是" + mo_id[which], Toast.LENGTH_SHORT).show();
                    OptionDialog.dismiss();
                }
            });
            dialog_list.show();
        });

        chooseBinding.checked.setOnClickListener((View v)->{
            searchManufactureViewModel=ViewModelProviders.of(this).get(SearchManufactureViewModel.class);
            String manufacture=chooseBinding.moId.getText().toString();
            String customer=chooseBinding.customId.getText().toString();
            String online_date=chooseBinding.onlinedate.getText().toString();
            String sale_order=chooseBinding.saleId.getText().toString();
            searchManufactureViewModel.onGetManuFactureInput(manufacture,customer,online_date,sale_order);
            searchManufactureViewModel.getSearchList().observe(this, searchManufactureModelMutableLiveData -> {
                // update UI
                Log.d("s2", "onCreate: "+ searchManufactureViewModel.searchManufactureModelMutableLiveData.getValue());
                List<List<SearchManufactureModel>> search=new ArrayList<>();
                Log.d("1112", "onCreate: ");
                Log.d("1112", "onCreate: "+searchManufactureModelMutableLiveData.get(0).getCustomer());

                Intent intent=new Intent(ChooseActivity.this, SearchActivity.class);

                List<SearchManufactureModel>  searchManufactureModelList=searchManufactureViewModel.searchManufactureModelMutableLiveData.getValue();
                intent.putExtra("SEARCH_DATA", (Serializable)(ArrayList)searchManufactureModelList);
                startActivity(intent);
            });
        });


    }
}
