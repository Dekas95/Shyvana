package lolapi.query;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lolapi.dto.C;
import lolapi.dto.Region;
import lolapi.dto.Season;
import lolapi.dto.Game.RecentGames;
import lolapi.dto.League.League;
import lolapi.dto.Stats.PlayerStatsSummaryList;
import lolapi.dto.Stats.RankedStats;
import lolapi.dto.Summoner.MasteryPages;
import lolapi.dto.Summoner.RunePages;
import lolapi.dto.Summoner.Summoner;
import lolapi.dto.Team.Team;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

public class LeagueApi {
	private QueryManager qm;

	public LeagueApi(String apiKey)
	{
		this.qm = new QueryManager(apiKey);
	}
	
	public List<Team> getTeam(int summonerId, Region region)
	{
	    JsonElement x = qm.sendQuery(C.teamQuery(region, summonerId));
		Type mapType = new TypeToken<List<Team>>(){}.getType(); 
		List<Team> mpdt = new Gson().fromJson(x, mapType);
		return mpdt;
	}
	
	public Map<String, Summoner> getSummonerByName(String[] names, Region region)
	{
        JsonElement x = qm.sendQuery(C.getSummonersByName(region, names));
		Type mapType = new TypeToken<HashMap<String,Summoner>>(){}.getType(); 
		Map<String,Summoner> mpdt = new Gson().fromJson(x, mapType);
		return mpdt;
	}
	
	public Map<String, Summoner> getSummonerById(long[] ids, Region region)
	{
        JsonElement x = qm.sendQuery(C.getSummonersById(region, ids));
		Type mapType = new TypeToken<HashMap<String,Summoner>>(){}.getType(); 
		Map<String,Summoner> mpdt = new Gson().fromJson(x, mapType);
		return mpdt;
	}
	
	public Map<String, RunePages> getRunes(long[] ids, Region region)
	{
        JsonElement x = qm.sendQuery(C.runesQuery(region, ids));
		Type mapType = new TypeToken<HashMap<String,RunePages>>(){}.getType(); 
		Map<String,RunePages> mpdt = new Gson().fromJson(x, mapType);
		return mpdt;
	}
	public Map<String, MasteryPages> getMasteries(long[] ids, Region region)
	{
        JsonElement x = qm.sendQuery(C.masteriesQuery(region, ids));
		Type mapType = new TypeToken<HashMap<String,MasteryPages>>(){}.getType(); 
		Map<String,MasteryPages> mpdt = new Gson().fromJson(x, mapType);
		return mpdt;
	}
	public PlayerStatsSummaryList getStatsSummary(int id, Region region, Season season)
	{
		JsonElement x = qm.sendQuery(C.statsSummaryQuery(region, id, season));
		PlayerStatsSummaryList rsdt = new PlayerStatsSummaryList();
		rsdt = new Gson().fromJson(x, PlayerStatsSummaryList.class);
		return rsdt;

	}
	public RankedStats getStatsRanked(int id, Region region, Season season)
	{
		JsonElement x = qm.sendQuery(C.statsRankedQuery(region, id, season));
		RankedStats rsdt = new RankedStats();
		rsdt = new Gson().fromJson(x, RankedStats.class);
		return rsdt;
	}
	public List<League> getLeague(int id, Region region)
	{
	    JsonElement x = qm.sendQuery(C.leagueQuery(region, id));
		Type mapType = new TypeToken<List<League>>(){}.getType(); 
		List<League> mpdt = new Gson().fromJson(x, mapType);
		return mpdt;
	}
	public RecentGames getGame(int id, Region region)
	{
        JsonElement x = qm.sendQuery(C.gameQuery(region, id));
        RecentGames mygg = new Gson().fromJson(x, RecentGames.class);
        return mygg;
	}
}