package com.example.atest.someinterface;

import com.example.atest.search.SearchManufactureModel;

import java.util.List;

public interface SearchScheduleResultContract {
    public interface OnItemClickListener {
        void onItemClick(SearchManufactureModel item);
    }
}
