package com.example.infofut.datas.remote

import com.example.infofut.datas.classes.ApiResponses
import com.example.infofut.datas.classes.Country
import com.example.infofut.datas.classes.FixturesEvent
import com.example.infofut.datas.classes.FixtureResponse
import com.example.infofut.datas.classes.FixturesPlayer
import com.example.infofut.datas.classes.FixturesStatisticsResponse
import com.example.infofut.datas.classes.Injurys
import com.example.infofut.datas.classes.League
import com.example.infofut.datas.classes.LeagueResponse
import com.example.infofut.datas.classes.Season
import com.example.infofut.datas.classes.StandingsResonse
import com.example.infofut.datas.classes.Teams
import com.example.infofut.datas.classes.TeamResponse
import com.example.infofut.datas.classes.TeamStatistics
import com.example.infofut.datas.classes.Venue
import retrofit2.http.GET
import retrofit2.http.Query
import kotlin.String


interface ApiService {
    @GET("timezone")
    suspend fun getTimeZone(): ApiResponses<List<String>>

    @GET("countries")
    suspend fun getCountries(
        @retrofit2.http.Query("name") name: String? = null
    ): ApiResponses<List<Country>>

    @GET("leagues")
    suspend fun getLeagues(
        @Query("id") id: Int? = null
    ): ApiResponses<LeagueResponse>

    @GET("leagues/seasons")
    suspend fun getLeagueBySeason(
    ): ApiResponses<Int>

    @GET("teams")
    suspend fun getTeams(
        @Query("id") id: Int? = null
    ): ApiResponses<List<TeamResponse>>

    @GET("teams/statistics")
    suspend fun getTeamsStatistics(
        @Query("league") league: Int,
        @Query("team") team: Int,
        @Query("season") season: Int

    ): ApiResponses<List<TeamStatistics>>

    @GET("teams/seasons")
    suspend fun getTeamsSeaons(
        @Query("team") teamd: Int
    ): ApiResponses<List<Int>>

    @GET("teams/countries")
    suspend fun getTeamCountries(
    ): ApiResponses<List<Country>>

    @GET("venues")
    suspend fun getVenues(
        @Query("id") id: Int
    ): ApiResponses<List<Venue>>

    @GET("standings")
    suspend fun getStandings(
        @Query("league") league: Int,
        @Query("season") season: Int
    ): ApiResponses<List<StandingsResonse>>

    @GET("fixtures/rounds")
    suspend fun getFixturesRonuds(
        @Query("league") league: Int,
        @Query("season") season: Int
    ): ApiResponses<List<String>>

    @GET("fixtures")
    suspend fun getFixtures(
        @Query("live")
        live: String
    ): ApiResponses<List<FixtureResponse>>

    @GET("fixtures/headtohead")
    suspend fun getFixturesHeadToHead(
        @Query("h2h") h2h: String,
        @Query("last") last: String,
    ): ApiResponses<List<FixtureResponse>>

    @GET("fixtures/statistics")
    suspend fun getFixturesStatistics(
        @Query("team") team: String,
        @Query("fixtures") fixturees: String
    ): ApiResponses<List<FixturesStatisticsResponse>>

    @GET("fixtures/events")
    suspend fun getFixturesEvents(
        @Query("fixtures") fixtures: String
    ): ApiResponses<List<FixturesEvent>>

    @GET("fixtures/lineups")
    suspend fun getFixturesLineups(
        @Query("fixtures") fixtures: String
    ): ApiResponses<List<FixturesEvent>>

    @GET("fixtures/players")
    suspend fun getFixturesPlayer(
        @Query("fixture") fixtures: Int
    ): ApiResponses<List<FixturesPlayer>>

    @GET("injuries")
    suspend fun getInjuries(
        @Query("injuries") injuries: Int
    ): ApiResponses<List<Injurys>>

//    @GET("predictions")
//    suspend fun getPredictions(
//        @Query("fixtures")fixtures:Int
//    ): ApiResponses<List<>>
}