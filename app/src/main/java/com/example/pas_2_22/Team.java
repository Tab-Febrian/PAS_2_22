package com.example.pas_2_22;
import com.google.gson.annotations.SerializedName;
public class Team {
    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strStadium")
    private String strStadium;

    @SerializedName("strBadge")
    private String strBadge;
    public String getStrTeam() {
        return strTeam;
    }
    public String getStrStadium() {
        return strStadium;
    }
    public String getStrBadge() {
        return strBadge;
    }
}
