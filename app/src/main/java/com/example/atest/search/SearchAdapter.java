package com.example.atest.search;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atest.databinding.SearchItemBinding;
import com.example.atest.someinterface.SearchScheduleResultContract;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder>  implements SearchScheduleResultContract {

    private List<SearchManufactureModel> searchManufactureModelList;
    private final OnItemClickListener listener;

    public SearchAdapter(List<SearchManufactureModel> searchManufactureModelList, OnItemClickListener listener) {
        this.searchManufactureModelList = searchManufactureModelList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        SearchItemBinding binding=SearchItemBinding.inflate(layoutInflater,parent,false);
        return new ViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchManufactureModel repo = searchManufactureModelList.get(position);
        holder.bind(searchManufactureModelList.get(position),listener,position);
    }

    @Override
    public int getItemCount() {
        return searchManufactureModelList.size();
    }

    public  void  replaceData(List<SearchManufactureModel> list)  {
        searchManufactureModelList = list;
        notifyDataSetChanged();
    }
    public  class ViewHolder extends RecyclerView.ViewHolder{

        private final SearchItemBinding binding;

        ViewHolder( SearchItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

        void bind(SearchManufactureModel repo,OnItemClickListener listener,int position) {
            binding.setData(repo);
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(position,repo);
                }
            });
            binding.executePendingBindings();
        }
    }
}
