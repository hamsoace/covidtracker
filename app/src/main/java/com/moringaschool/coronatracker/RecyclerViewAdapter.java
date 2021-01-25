package com.moringaschool.coronatracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{

    private Context context;
    private ArrayList<CoronaItem> coronaItemArrayList;

    public RecyclerViewAdapter(Context context, ArrayList<CoronaItem> coronaItemArrayList) {
        this.context = context;
        this.coronaItemArrayList = coronaItemArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_items, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        CoronaItem coronaItem = coronaItemArrayList.get(position);
        String state=coronaItem.getState();
        String death=coronaItem.getState();
        String recovered=coronaItem.getState();
        String active=coronaItem.getState();
        String confirmed_=coronaItem.getState();
        String lastUpdt=coronaItem.getState();
        String todayDeath=coronaItem.getState();
        String todayActive=coronaItem.getState();
        String todayRecovered=coronaItem.getState();

        holder.state.setText(state);
        holder.death.setText(death);
        holder.recovered.setText(recovered);
        holder.active.setText(active);
        holder.confirmed.setText(confirmed_);
        holder.lastUpdate.setText(lastUpdt);
        holder.todayDeath.setText(todayDeath);
        holder.todayActive.setText(todayActive);
        holder.todayRecovered.setText(todayRecovered);


    }

    @Override
    public int getItemCount() {
        return coronaItemArrayList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView state,death,recovered,active,confirmed,lastUpdate,todayDeath,todayActive,todayRecovered;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            death=itemView.findViewById(R.id.death);
            state=itemView.findViewById(R.id.stateName);
            recovered=itemView.findViewById(R.id.recovered);
            active=itemView.findViewById(R.id.active);
            confirmed=itemView.findViewById(R.id.confirmed);
            lastUpdate=itemView.findViewById(R.id.lastUpdated);
            todayDeath=itemView.findViewById(R.id.todayDeath);
            todayActive=itemView.findViewById(R.id.todayActive);
            todayRecovered=itemView.findViewById(R.id.todayRecovered);



        }
    }

}


