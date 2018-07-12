package com.liebersonsantos.rafaelandroidretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ClienteVenda implements Parcelable{

    @SerializedName("strNomePessoa")
    private String strNomePessoa;

    public ClienteVenda() {
    }

    public ClienteVenda(String strNomePessoa) {
        this.strNomePessoa = strNomePessoa;
    }

    protected ClienteVenda(Parcel in) {
        strNomePessoa = in.readString();
    }

    public static final Creator<ClienteVenda> CREATOR = new Creator<ClienteVenda>() {
        @Override
        public ClienteVenda createFromParcel(Parcel in) {
            return new ClienteVenda(in);
        }

        @Override
        public ClienteVenda[] newArray(int size) {
            return new ClienteVenda[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(strNomePessoa);
    }

    public String getStrNomePessoa() {
        return strNomePessoa;
    }

    public void setStrNomePessoa(String strNomePessoa) {
        this.strNomePessoa = strNomePessoa;
    }
}
