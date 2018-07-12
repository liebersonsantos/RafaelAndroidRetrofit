package com.liebersonsantos.rafaelandroidretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class LVendaItem implements Parcelable{

    @SerializedName("lVendaItem")
    private String lVendaItem;

    public LVendaItem() {
    }

    public LVendaItem(String lVendaItem) {
        this.lVendaItem = lVendaItem;
    }

    protected LVendaItem(Parcel in) {
        lVendaItem = in.readString();
    }

    public static final Creator<LVendaItem> CREATOR = new Creator<LVendaItem>() {
        @Override
        public LVendaItem createFromParcel(Parcel in) {
            return new LVendaItem(in);
        }

        @Override
        public LVendaItem[] newArray(int size) {
            return new LVendaItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(lVendaItem);
    }

    public String getlVendaItem() {
        return lVendaItem;
    }

    public void setlVendaItem(String lVendaItem) {
        this.lVendaItem = lVendaItem;
    }
}
