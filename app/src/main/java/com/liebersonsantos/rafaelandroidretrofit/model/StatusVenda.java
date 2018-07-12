package com.liebersonsantos.rafaelandroidretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class StatusVenda implements Parcelable{

    @SerializedName("strVendaStatusEntidade")
    private String strVendaStatusEntidade;
    @SerializedName("strDescricaoVendaStatusEntidade")
    private String strDescricaoVendaStatusEntidade;

    public StatusVenda() {
    }

    public StatusVenda(String strVendaStatusEntidade, String strDescricaoVendaStatusEntidade) {
        this.strVendaStatusEntidade = strVendaStatusEntidade;
        this.strDescricaoVendaStatusEntidade = strDescricaoVendaStatusEntidade;
    }

    protected StatusVenda(Parcel in) {
        strVendaStatusEntidade = in.readString();
        strDescricaoVendaStatusEntidade = in.readString();
    }

    public static final Creator<StatusVenda> CREATOR = new Creator<StatusVenda>() {
        @Override
        public StatusVenda createFromParcel(Parcel in) {
            return new StatusVenda(in);
        }

        @Override
        public StatusVenda[] newArray(int size) {
            return new StatusVenda[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(strVendaStatusEntidade);
        dest.writeString(strDescricaoVendaStatusEntidade);
    }

    public String getStrVendaStatusEntidade() {
        return strVendaStatusEntidade;
    }

    public void setStrVendaStatusEntidade(String strVendaStatusEntidade) {
        this.strVendaStatusEntidade = strVendaStatusEntidade;
    }

    public String getStrDescricaoVendaStatusEntidade() {
        return strDescricaoVendaStatusEntidade;
    }

    public void setStrDescricaoVendaStatusEntidade(String strDescricaoVendaStatusEntidade) {
        this.strDescricaoVendaStatusEntidade = strDescricaoVendaStatusEntidade;
    }
}
