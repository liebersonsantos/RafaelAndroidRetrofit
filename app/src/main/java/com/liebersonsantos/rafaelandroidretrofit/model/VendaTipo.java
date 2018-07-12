package com.liebersonsantos.rafaelandroidretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class VendaTipo implements Parcelable{

    @SerializedName("intCodigoVendaTipo")
    private int intCodigoVendaTipo;
    @SerializedName("strNomeVendaTipo")
    private String strNomeVendaTipo;

    public VendaTipo() {
    }

    public VendaTipo(int intCodigoVendaTipo, String strNomeVendaTipo) {
        this.intCodigoVendaTipo = intCodigoVendaTipo;
        this.strNomeVendaTipo = strNomeVendaTipo;
    }

    protected VendaTipo(Parcel in) {
        intCodigoVendaTipo = in.readInt();
        strNomeVendaTipo = in.readString();
    }

    public static final Creator<VendaTipo> CREATOR = new Creator<VendaTipo>() {
        @Override
        public VendaTipo createFromParcel(Parcel in) {
            return new VendaTipo(in);
        }

        @Override
        public VendaTipo[] newArray(int size) {
            return new VendaTipo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(intCodigoVendaTipo);
        dest.writeString(strNomeVendaTipo);
    }

    public int getIntCodigoVendaTipo() {
        return intCodigoVendaTipo;
    }

    public void setIntCodigoVendaTipo(int intCodigoVendaTipo) {
        this.intCodigoVendaTipo = intCodigoVendaTipo;
    }

    public String getStrNomeVendaTipo() {
        return strNomeVendaTipo;
    }

    public void setStrNomeVendaTipo(String strNomeVendaTipo) {
        this.strNomeVendaTipo = strNomeVendaTipo;
    }
}
