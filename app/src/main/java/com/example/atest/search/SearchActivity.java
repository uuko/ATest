package com.example.atest.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.atest.R;
import com.example.atest.databinding.ActivityChooseBinding;
import com.example.atest.databinding.ActivitySearchBinding;
import com.example.atest.search_result.SearchLoadActivity;
import com.example.atest.someinterface.SearchScheduleResultContract;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import static com.example.atest.choose.ChooseActivity.searchManufactureViewModel;

public class SearchActivity extends AppCompatActivity {

    private ActivitySearchBinding searchBinding;
    private List<SearchManufactureModel> searchManufactureModelList;
    private SearchAdapter searchAdapter;
    private String SEARCH_DATA="SEARCH_DATA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchBinding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        Log.d("s2", "onCreate: "+ searchManufactureViewModel.searchManufactureModelMutableLiveData.getValue());
        searchBinding.recycleView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        ArrayList<SearchManufactureModel> list = (ArrayList<SearchManufactureModel>)getIntent().getExtras().getSerializable("SEARCH_DATA");
        for (int i=0;i<list.size();i++){
            Log.d("s3", "onCreate: "+list.get(i).getMoId());
        }

        searchAdapter=new SearchAdapter(list, new SearchScheduleResultContract.OnItemClickListener() {
            @Override
            public void onItemClick(int position, SearchManufactureModel item) {
                Intent intent=new Intent(SearchActivity.this,SearchLoadActivity.class);
                intent.putExtra(SEARCH_DATA, item.getSoId());
                intent.putExtra("itemid", item.getItemId());
                Log.d("47", "onItemClick: "+item.getSoId());
                startActivity(intent);
            }
        });
        searchBinding.recycleView.setLayoutManager(new LinearLayoutManager(this));
        searchBinding.recycleView.setAdapter(searchAdapter);
        searchManufactureViewModel.getSearchList().observe(this, searchManufactureModelMutableLiveData -> {
           searchAdapter.replaceData(searchManufactureModelMutableLiveData);
        });
    }
}
