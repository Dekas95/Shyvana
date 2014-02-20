#LeagueAPI

League API is completely free tool for non-profit purposes. League API is a simple way to access League of Legends API.

##How to Install

Download the latest JAR file from here. 

If you are using eclipse,

1. Create lib file under your project directory.
2. Copy JAR to lib file.
3. From eclipse right click your jar file. Select Build Path -> Add to Build Path

## How to use League API

 ```java
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

```

## Supported Versions

| Query Type    | Version       |
| ------------- |:-------------:|
| Game          | 1.3           |
| League        | 2.3           |
| Stats         | 1.2           |
| Summoner      | 1.3           |
| Team          | 2.2           |


###Future Plans
+ Multiple api_key management
+ Better exception handling

