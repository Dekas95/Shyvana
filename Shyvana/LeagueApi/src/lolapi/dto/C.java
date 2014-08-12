package lolapi.dto;

import lolapi.constants.Version;

public class C {
	public static String gameQuery(Region region, long summonerId)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.gameQVersion + "/game/by-summoner/" + summonerId + "/recent?";
	}
	public static String leagueQuery(Region region, String[] summonerIds, int type)
	{	
		String ids = C.arrayToString(summonerIds);
		if(type == 1)
			return "/api/lol/" + region.getName() + "/" + Version.leagueQVersion + "/league/by-summoner/" + ids + "?";
		else if(type == 2)
			return "/api/lol/" + region.getName() + "/" + Version.leagueQVersion + "/league/by-summoner/" + ids + "/entry?";
		else if(type == 3)
			return "/api/lol/" + region.getName() + "/" + Version.leagueQVersion + "/league/by-team/" + ids + "?";
		else
			return "/api/lol/" + region.getName() + "/" + Version.leagueQVersion + "/league/by-team/" + ids + "/entry?";
	}
	public static String leagueQuery(Region region, LeagueType leagueType) {
		return "/api/lol/" + region.getName() + "/" + Version.leagueQVersion + "/league/challenger/?type="+ leagueType.getName() + "&";		
	}
	public static String statsSummaryQuery(Region region, long summonerId, Season season)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.statsQVersion + "/stats/by-summoner/" + summonerId + "/summary?season=" + season.getName() + "&";
	}
	public static String statsRankedQuery(Region region, long summonerId, Season season)
	{	
		return "/api/lol/" + region.getName() + "/" + Version.statsQVersion + "/stats/by-summoner/" + summonerId + "/ranked?season=" + season.getName() + "&";
	}
	public static String masteriesQuery(Region region, String[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "/masteries?";
	}
	public static String runesQuery(Region region, String[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "/runes?";
	}
	public static String getSummonersByName(Region region, String[] summonerNames)
	{	
		String ids = C.arrayToString(summonerNames);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/by-name/" + ids + "?";
	}
	public static String getSummonersById(Region region, String[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "?";
	}
	public static String getSummonerNameByIds(Region region, long[] summonerIds)
	{	
		String ids = C.arrayToString(summonerIds);
		return "/api/lol/" + region.getName() + "/" + Version.summonerQVersion + "/summoner/" + ids + "/name?";
	}
	public static String teamQuery(Region region, String[] summonerIds, int type)
	{	
		String ids = C.arrayToString(summonerIds);
		if(type == 1)
			return "/api/lol/" + region.getName() + "/" + Version.teamQVersion  + "/team/by-summoner/" + ids + "?";
		else
			return "/api/lol/" + region.getName() + "/" + Version.teamQVersion  + "/team/" + ids + "?";

	}
	
	public static String staticDataQuery(Region region, String type, Object id)
	{	
		return "/api/lol/static-data/" + region.getName() + "/" + Version.staticdataQVerison  + "/" + type + "/" + id.toString() + "?";
	}
	public static String staticDataQuery(Region region, String type)
	{	
		return "/api/lol/static-data/" + region.getName() + "/" + Version.staticdataQVerison  + "/" + type  + "?";
	}
	
	private static String arrayToString(Object[] summonerIds) {
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
