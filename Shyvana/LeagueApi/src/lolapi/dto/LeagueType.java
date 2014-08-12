package lolapi.dto;

public enum LeagueType {
    S5 ("RANKED_SOLO_5x5"),
    T3 ("RANKED_TEAM_3x3"),
    T5 ("RANKED_TEAM_5x5");

    private String name = null;

    LeagueType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
