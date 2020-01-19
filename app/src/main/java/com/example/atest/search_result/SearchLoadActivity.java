package com.example.atest.search_result;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.example.atest.R;
import com.example.atest.login.LoginViewModel;
import com.google.android.material.tabs.TabLayout;

public class SearchLoadActivity extends AppCompatActivity {
    private TabLayout report_tab_layout;
    private ViewPager report_tab_viewPager;
    private TabLayout.OnTabSelectedListener listener;
    private String SEARCH_DATA="SEARCH_DATA";
    private SearchLoadViewModel searchLoadViewModel;
    private String so_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_load);
        report_tab_layout=findViewById(R.id.product_des_tablayout);
        report_tab_viewPager=findViewById(R.id.product_des_tabviewpager);

        searchLoadViewModel=ViewModelProviders.of(this).get(SearchLoadViewModel.class);
        so_id=getIntent().getExtras().getString(SEARCH_DATA);
        String item_id=getIntent().getExtras().getString("itemid");
        searchLoadViewModel.getPreInput(so_id,item_id);


        Log.d("47", "onCreate: "+so_id);
        //  Toast.makeText(this, ""+ getIntent().getExtras().get(SEARCH_DATA), Toast.LENGTH_SHORT).show();
        listener=new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position=tab.getPosition();
                switch (position){
                    case 0:

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };

    }
}
