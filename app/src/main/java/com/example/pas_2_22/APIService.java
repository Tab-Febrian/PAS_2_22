package com.example.pas_2_22;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("lookup_all_teams.php?id=4328")
    Call<TeamResponse> getAllTeams();

    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse> getSpanishLeagueTeams();
}
