package com.example.galaxyhut.models;

import android.os.Parcel;
import android.os.Parcelable;

// Root class containing Collection object
public class NasaModel implements Parcelable {
    private Collection collection;

    public NasaModel(Collection collection) {
        this.collection = collection;
    }

    protected NasaModel(Parcel in) {
    }

    public static final Creator<NasaModel> CREATOR = new Creator<NasaModel>() {
        @Override
        public NasaModel createFromParcel(Parcel in) {
            return new NasaModel(in);
        }

        @Override
        public NasaModel[] newArray(int size) {
            return new NasaModel[size];
        }
    };

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
