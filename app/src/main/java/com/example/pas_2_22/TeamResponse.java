package com.example.pas_2_22;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TeamResponse {
    @SerializedName("teams")
    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
    }
}
