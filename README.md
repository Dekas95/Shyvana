#(5 Aug 2014) CAREFUL: This library is OUTDATED. It will be updated soon.

#Shyvana - Java League Library

Shyvana is completely free tool for non-profit purposes. Shyvana is a simple way to access League of Legends API.

##How to Install

Download the latest JAR file -> https://github.com/shyos/Shyvana/releases

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
						
						/* Shyvana v1.1.0 Static Data Available */
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

```

## Supported Versions

| Query Type    | Version       |
| ------------- |:-------------:|
| Game          | 1.3           |
| League        | 2.3           |
| Stats         | 1.2           |
| Summoner      | 1.3           |
| Team          | 2.2           |
| Static-Data   | 1.0           |


###Future Plans

Highest Priority: 
+ League Query Type will be updated with extra features.

Least Priority:
+ Multiple api_key management
+ Better exception handling
