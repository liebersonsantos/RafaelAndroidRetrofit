package com.liebersonsantos.rafaelandroidretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ParametroBody implements Parcelable{


    @SerializedName("intCodigoVendaTipo")
    private int vendaTipo;
    @SerializedName("dtEmissao")
    private String dataEmissao;

    public ParametroBody() {
    }

    public ParametroBody(int vendaTipo, String dataEmissao) {
        this.vendaTipo = vendaTipo;
        this.dataEmissao = dataEmissao;
    }

    protected ParametroBody(Parcel in) {
        vendaTipo = in.readInt();
        dataEmissao = in.readString();
    }

    public static final Creator<ParametroBody> CREATOR = new Creator<ParametroBody>() {
        @Override
        public ParametroBody createFromParcel(Parcel in) {
            return new ParametroBody(in);
        }

        @Override
        public ParametroBody[] newArray(int size) {
            return new ParametroBody[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(vendaTipo);
        dest.writeString(dataEmissao);
    }

    public int getVendaTipo() {
        return vendaTipo;
    }

    public void setVendaTipo(int vendaTipo) {
        this.vendaTipo = vendaTipo;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}
