public class Team implements Comparable<Team>{

    private String team_Name;
    private int team_Wins;
    private int team_Draws;
    private int team_Losses;
    private Integer team_Points;

    // constructor is being set to initialize name, win, draw, loss and points
    public Team(String team_Name) {
        this.team_Name = team_Name;
        this.team_Wins = 0;
        this.team_Draws = 0;
        this.team_Losses = 0;
        this.team_Points = 0;
    }

    // getter for team name
    public String getTeamName() {
        return team_Name;
    }


    // getter for team points
    public int getPoints() {
        return team_Points;
    }

    // method to increase the number of team wins by 1 and the number of team points by 3
    public void incrementteamWin() {
        team_Wins = team_Wins + 1;
        team_Points = team_Points + 3;
    }

    // method to increase the number of team losses by 1
    public void incrementteamLoss() {
        this.team_Losses = this.team_Losses + 1;
    }

    // method to increase the number of team draws by 1 and the number of team points by 1
    public void incrementteamDraws() {
        team_Draws = team_Draws + 1;
        team_Points = team_Points + 1;
    }

    // toString method to return a string representation of the team object
    @Override
    public String toString() {
        return
                "Team Name = " + team_Name + '\n' +
                "Wins = " + team_Wins +
                " \nDraws = " + team_Draws +
                " \nLosses = " + team_Losses +
                " \nPoints = " + team_Points + "\n"
                ;
    }

    // compareTo method to compare the team points of two teams
    @Override
    public int compareTo(Team o) {
        return - this.team_Points.compareTo(o.team_Points);
    }
}