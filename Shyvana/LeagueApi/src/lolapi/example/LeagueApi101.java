package lolapi.example;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

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

		LeagueApi api = new LeagueApi("5fe6ede1-90ba-4a44-9035-d9cb37067b48");
		api.getQm().setDoOutput(false);
		String[] names = new String[]{"Dyrus"};
		int id = 5908;
		long[] ids = new long[]{5908};
		Region region = Region.NA;
		Season season = Season.SEASON_4;
		
			Map<String, Summoner>	a = api.getSummonerByName(names, region);
			RecentGames				b = api.getGame(id, region);
			List<League> 			c = api.getLeague(id, region);
		Map<String, MasteryPages> 	d = api.getMasteries(ids, region);
			Map<String, RunePages> 	e = api.getRunes(ids, region);
			RankedStats 			f = api.getStatsRanked(id, region, season);
			PlayerStatsSummaryList 	h = api.getStatsSummary(id, region, season);
			Map<String, Summoner> 	g = api.getSummonerById(ids, region);
			Map<String, Summoner> 	i = api.getSummonerByName(names, region);
						List<Team> 	j = api.getTeam(id, region);
						   Champion k = api.getStaticChampion(1, region);
					   ChampionList l = api.getStaticChampionList(region);
							   Item m = api.getStaticItem(3169, region);
						   ItemList n = api.getStaticItemList(region);
						    Mastery o = api.getStaticMastery(4353, region);
						MasteryList p = api.getStaticMasteryList(region);
							  Realm q = api.getStaticRealm(region);
							   Rune r = api.getStaticRune(5235, region);
						   RuneList s = api.getStaticRuneList(region);
					  SummonerSpell t = api.getStaticSummonerSpell("SummonerBoost", region);
				  SummonerSpellList u = api.getStaticSummonerSpellList(region);
										
									
	}	
}
