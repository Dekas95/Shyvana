package lolapi.dto.League;

public class LeagueItem {
	private boolean isFreshBlood;	
	private boolean isHotStreak;	
	private boolean isInactive;	
	private boolean isVeteran;	
	private long lastPlayed;	
	private String leagueName;	
	private int leaguePoints;	
	private MiniSeries miniSeries;	
	private String playerOrTeamId;	
	private String playerOrTeamName;	
	private String queueType;	
	private String rank;	
	private String tier;	
	private int wins;
	/**
	 * @return the isFreshBlood
	 */
	public boolean isFreshBlood() {
		return isFreshBlood;
	}
	/**
	 * @return the isHotStreak
	 */
	public boolean isHotStreak() {
		return isHotStreak;
	}
	/**
	 * @return the isInactive
	 */
	public boolean isInactive() {
		return isInactive;
	}
	/**
	 * @return the isVeteran
	 */
	public boolean isVeteran() {
		return isVeteran;
	}
	/**
	 * @return the lastPlayed
	 */
	public long getLastPlayed() {
		return lastPlayed;
	}
	/**
	 * @return the leagueName
	 */
	public String getLeagueName() {
		return leagueName;
	}
	/**
	 * @return the leaguePoints
	 */
	public int getLeaguePoints() {
		return leaguePoints;
	}
	/**
	 * @return the miniSeries
	 */
	public MiniSeries getMiniSeries() {
		return miniSeries;
	}
	/**
	 * @return the playerOrTeamId
	 */
	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}
	/**
	 * @return the playerOrTeamName
	 */
	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}
	/**
	 * @return the queueType
	 */
	public String getQueueType() {
		return queueType;
	}
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}
	/**
	 * @return the tier
	 */
	public String getTier() {
		return tier;
	}
	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}
	
	
	
}
