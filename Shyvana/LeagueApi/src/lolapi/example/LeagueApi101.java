package lolapi.example;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import lolapi.dto.LeagueType;
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
import lolapi.query.LeagueApi;

public class LeagueApi101 {
	public static void main(String[] args) throws ParseException, IOException {

		LeagueApi api = new LeagueApi("YOUR_API_KEY_HERE");
		
		String[] names = new String[]{"Dyrus"};
		int id = 5908;
		String[] ids = new String[]{"5908"};
		String[] teamIds = new String[]{"TEAM-1c3a53f0-fbd4-11e3-9c89-782bcb4d1861"};
		Region region = Region.NA;
		Season season = Season.SEASON_4;
		LeagueType leagueType = LeagueType.T5;
		int summonerSpellId = 1;
		
		
				  Map<String, Summoner> a = api.getSummonerByName(names, region);
							RecentGames	b = api.getGame(id, region);
			
			Map<String, List<League>> 	c1 = api.getLeagueBySummonerId(ids, region);
			Map<String, List<League>> 	c2 = api.getLeagueEntryBySummonerId(ids, region);
			Map<String, List<League>> 	c3 = api.getLeagueByTeamId(teamIds, region);
			Map<String, List<League>> 	c4 = api.getLeagueEntryByTeamId(teamIds, region);
			 				   League 	c5 = api.getLeagueChallengers(region, leagueType);

			Map<String, MasteryPages> 	d = api.getMasteries(ids, region);
				Map<String, RunePages> 	e = api.getRunes(ids, region);
				RankedStats 			f = api.getStatsRanked(id, region, season);
				PlayerStatsSummaryList 	h = api.getStatsSummary(id, region, season);
				Map<String, Summoner> 	g = api.getSummonerById(ids, region);
				Map<String, Summoner> 	i = api.getSummonerByName(names, region);
			
				Map<String, List<Team>> j1 = api.getTeamBySummonerId(ids, region);
					  Map<String, Team> j2 = api.getTeamByTeamId(teamIds, region);
			      
					  			Champion k = api.getStaticChampion(1, region);
					  		ChampionList l = api.getStaticChampionList(region);
							   		Item m = api.getStaticItem(3169, region);
							   	ItemList n = api.getStaticItemList(region);
							   	 Mastery o = api.getStaticMastery(4353, region);
							 MasteryList p = api.getStaticMasteryList(region);
							  	   Realm q = api.getStaticRealm(region);
							  	    Rune r = api.getStaticRune(5235, region);
							  	RuneList s = api.getStaticRuneList(region);
						   SummonerSpell t = api.getStaticSummonerSpell(summonerSpellId, region);
					   SummonerSpellList u = api.getStaticSummonerSpellList(region);
									
									
	}	
}
