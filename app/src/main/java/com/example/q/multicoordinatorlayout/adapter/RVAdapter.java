package com.example.q.multicoordinatorlayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.q.multicoordinatorlayout.R;

import java.util.List;

/**
 * Created by q on 2018/3/8.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVViewHolder>{
    private Context context;
    private List<String> texts;
    public RVAdapter(Context context,List<String> texts){
        this.context=context;
        this.texts=texts;
    }
    @Override
    public RVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View holder= LayoutInflater.from(context).inflate(R.layout.app_adpater_item,parent,false);
        RVViewHolder rvViewHolder=new RVViewHolder(holder);
        return rvViewHolder;
    }

    @Override
    public void onBindViewHolder(RVViewHolder holder, int position) {
        holder.textView.setText(texts.get(position));
    }

    @Override
    public int getItemCount() {
        return texts.size();
    }

    class RVViewHolder extends  RecyclerView.ViewHolder{
      private TextView textView;
       RVViewHolder(View view){
            super(view);
            textView=(TextView) view.findViewById(R.id.tv_app_adpater_content);
       };
  }
}
