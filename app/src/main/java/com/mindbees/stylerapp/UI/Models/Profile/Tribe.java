package com.mindbees.stylerapp.UI.Models.Profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by User on 12-04-2017.
 */

public class Tribe implements Serializable {
    @SerializedName("tribe_id")
    @Expose
    private String tribeId;
    @SerializedName("tribe_title")
    @Expose
    private String tribeTitle;

    public String getTribeId() {
        return tribeId;
    }

    public void setTribeId(String tribeId) {
        this.tribeId = tribeId;
    }

    public String getTribeTitle() {
        return tribeTitle;
    }

    public void setTribeTitle(String tribeTitle) {
        this.tribeTitle = tribeTitle;
    }
}