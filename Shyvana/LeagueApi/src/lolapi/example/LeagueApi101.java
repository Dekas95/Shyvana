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
import lolapi.query.LeagueApi;

public class LeagueApi101 {
	public static void main(String[] args) throws ParseException, IOException {

		LeagueApi api = new LeagueApi("YOUR_API_KEY_HERE");
		
		String[] names = new String[]{"Dyrus"};
		int id = 5908;
		long[] ids = new long[]{5908};
		
			Map<String, Summoner>	a = api.getSummonerByName(names, Region.NA);
			RecentGames				b = api.getGame(id, Region.NA);
			List<League> 			c = api.getLeague(id, Region.NA);
		Map<String, MasteryPages> 	d = api.getMasteries(ids, Region.NA);
			Map<String, RunePages> 	e = api.getRunes(ids, Region.NA);
			RankedStats 			f = api.getStatsRanked(id, Region.NA, Season.SEASON_4);
			PlayerStatsSummaryList 	h = api.getStatsSummary(id, Region.NA, Season.SEASON_4);
			Map<String, Summoner> 	g = api.getSummonerById(ids, Region.NA);
			Map<String, Summoner> 	i = api.getSummonerByName(names, Region.NA);
						List<Team> 	j = api.getTeam(id, Region.NA);
	}	
}
