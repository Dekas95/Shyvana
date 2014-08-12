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

```

## Supported Versions

| Query Type    | Version       |
| ------------- |:-------------:|
| Game          | 1.3           |
| League        | 2.4           |
| Stats         | 1.2           |
| Summoner      | 1.4           |
| Team          | 2.3           |
| Static-Data   | 1.2           |


###Future Plans

Highest Priority: 
+ Currently nothing

Normal Priortity:
+ Maybe I will implement Champion data (since its in static data, it can wait)
+ Some additional features of query types can be added.
 
Least Priority:
+ Multiple api_key management
+ Better exception handling
