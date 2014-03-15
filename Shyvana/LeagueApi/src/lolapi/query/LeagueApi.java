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
import lolapi.dto.staticdata.Champion.Champion;
import lolapi.dto.staticdata.Champion.ChampionList;
import lolapi.dto.staticdata.Item.Item;
import lolapi.dto.staticdata.Item.ItemList;
import lolapi.dto.staticdata.Mastery.Mastery;
import lolapi.dto.staticdata.Mastery.MasteryList;
import lolapi.dto.staticdata.Realm.Realm;
import lolapi.dto.staticdata.Rune.Rune;
import lolapi.dto.staticdata.Rune.RuneList;
import lolapi.dto.staticdata.SummonerSpell.SummonerSpell;
import lolapi.dto.staticdata.SummonerSpell.SummonerSpellList;

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
	
	/* Static Data */
	/**
	 * Returns a champion with given id.
	 * */
	public Champion getStaticChampion(long id, Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "champion", id));
        Champion mygg = new Gson().fromJson(x, Champion.class);
        return mygg;
	}
	/**
	 * Returns whole champion list.
	 * */
	public ChampionList getStaticChampionList(Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "champion"));
        ChampionList mygg = new Gson().fromJson(x, ChampionList.class);
        return mygg;
	}
	
	public Item getStaticItem(long id, Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "item", id));
		Item mygg = new Gson().fromJson(x, Item.class);
        return mygg;
	}
	public ItemList getStaticItemList(Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "item"));
		ItemList mygg = new Gson().fromJson(x, ItemList.class);
        return mygg;
	}
	
	public Mastery getStaticMastery(long id, Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "mastery", id));
		Mastery mygg = new Gson().fromJson(x, Mastery.class);
        return mygg;
	}
	public MasteryList getStaticMasteryList(Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "mastery"));
		MasteryList mygg = new Gson().fromJson(x, MasteryList.class);
        return mygg;
	}
	
	public Realm getStaticRealm(Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "realm"));
		Realm mygg = new Gson().fromJson(x, Realm.class);
        return mygg;
	}
	
	public Rune getStaticRune(long id, Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "rune", id));
		Rune mygg = new Gson().fromJson(x, Rune.class);
        return mygg;
	}
	public RuneList getStaticRuneList(Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "rune"));
		RuneList mygg = new Gson().fromJson(x, RuneList.class);
        return mygg;
	}
	
	public SummonerSpell getStaticSummonerSpell(String id, Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "summoner-spell", id));
		SummonerSpell mygg = new Gson().fromJson(x, SummonerSpell.class);
        return mygg;
	}
	public SummonerSpellList getStaticSummonerSpellList(Region region)
	{
		JsonElement x = qm.sendQuery(C.staticDataQuery(region, "summoner-spell"));
		SummonerSpellList mygg = new Gson().fromJson(x, SummonerSpellList.class);
        return mygg;
	}
	
}