package com.liebersonsantos.rafaelandroidretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VendasResponse implements Parcelable{

    private List<VendasR> vendasRList;

    public VendasResponse() {
    }

    public VendasResponse(List<VendasR> vendasRList) {
        this.vendasRList = vendasRList;
    }

    protected VendasResponse(Parcel in) {
        vendasRList = in.createTypedArrayList(VendasR.CREATOR);
    }

    public static final Creator<VendasResponse> CREATOR = new Creator<VendasResponse>() {
        @Override
        public VendasResponse createFromParcel(Parcel in) {
            return new VendasResponse(in);
        }

        @Override
        public VendasResponse[] newArray(int size) {
            return new VendasResponse[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(vendasRList);
    }

    public List<VendasR> getVendasRList() {
        return vendasRList;
    }

    public void setVendasRList(List<VendasR> vendasRList) {
        this.vendasRList = vendasRList;
    }
}
