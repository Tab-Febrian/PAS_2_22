package com.example.pas_2_22;
import com.google.gson.annotations.SerializedName;
public class Team {
    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strStadium")
    private String strStadium;

    @SerializedName("intStadiumCapacity")
    private String intStadiumCapacity;

    @SerializedName("strLocation")
    private String strLocation;

    @SerializedName("strBadge")
    private String strBadge;

    public String getStrTeam() {
        return strTeam;
    }
    public String getStrStadium() {
        return strStadium;
    }
    public String getIntStadiumCapacity() { return intStadiumCapacity; }
    public  String getStrLocation() { return strLocation; }
    public String getStrBadge() {
        return strBadge;
    }
}
