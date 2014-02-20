package lolapi.dto;

import lolapi.constants.Version;

public class C {
	public static String gameQuery(Region region, long summonerId)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.gameQVersion + "/game/by-summoner/" + summonerId + "/recent?";
	}
	public static String leagueQuery(Region region, long summonerId)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.leagueQVersion + "/league/by-summoner/" + summonerId + "?";
	}
	public static String statsSummaryQuery(Region region, long summonerId, Season season)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.statsQVersion + "/stats/by-summoner/" + summonerId + "/summary?season=" + season.getName();
	}
	public static String statsRankedQuery(Region region, long summonerId, Season season)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.statsQVersion + "/stats/by-summoner/" + summonerId + "/ranked?season=" + season.getName();
	}
	public static String masteriesQuery(Region region, long[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "/masteries?";
	}
	public static String runesQuery(Region region, long[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "/runes?";
	}
	public static String getSummonersByName(Region region, String[] summonerNames)
	{	
		String ids = C.arrayToString(summonerNames);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/by-name/" + ids + "?";
	}
	public static String getSummonersById(Region region, long[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "?";
	}
	public static String getSummonerNameByIds(Region region, long[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "/name?";
	}
	public static String teamQuery(Region region, long summonerId)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.teamQVersion  + "/team/by-summoner/" + summonerId + "?";
	}
	private static String arrayToString(String[] summonerNames) {
		String ids = "";
		for(int i=0; i<summonerNames.length;i++)
		{
			if( i+1 == summonerNames.length)
				ids += summonerNames[i];
			else
				ids = ids + summonerNames[i] + ",";
			
		}
		return ids;
	}
	private static String arrayToString(long[] summonerIds) {
		String ids = "";
		for(int i=0; i<summonerIds.length;i++)
		{
			if( i+1 == summonerIds.length)
				ids += summonerIds[i];
			else
				ids = ids + summonerIds[i] + ",";
			
		}
		return ids;
	}

}
