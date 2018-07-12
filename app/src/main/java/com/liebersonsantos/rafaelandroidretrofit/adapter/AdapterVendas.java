package com.liebersonsantos.rafaelandroidretrofit.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.liebersonsantos.rafaelandroidretrofit.R;
import com.liebersonsantos.rafaelandroidretrofit.model.VendasR;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterVendas extends RecyclerView.Adapter<AdapterVendas.AdapterViewHolder>{

    private List<VendasR> vendasRList;

    public AdapterVendas() {
        vendasRList = new ArrayList<>();
    }

    public AdapterVendas(List<VendasR> vendasRList) {
        this.vendasRList = vendasRList;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view, parent, false);

        return new AdapterVendas.AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {

        holder.bind(vendasRList.get(position));

    }

    @Override
    public int getItemCount() {
        return (vendasRList != null && vendasRList.size() > 0) ? vendasRList.size() : 0;
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.txt_dt_emissao_venda)
        TextView textDtEmissaoVenda;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }

        public  void bind(VendasR vendasR){

            textDtEmissaoVenda.setText("Data de emissão da venda: " + vendasR.getDtEmissaoVenda());

        }
    }

    public void setVendasRList(List<VendasR> vendasR){
        this.vendasRList = vendasR;
        notifyDataSetChanged();
    }
}
