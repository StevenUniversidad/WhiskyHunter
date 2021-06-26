package com.example.whiskyhunterapi;

import com.google.gson.annotations.SerializedName;

public class PosstDistilleries {


    @SerializedName("name")
    private String nameDistilleries;

    public String getNameDistilleries() {
        return nameDistilleries;
    }

    public void setNameDistilleries(String nameDistilleries) {
        this.nameDistilleries = nameDistilleries;
    }
}
