import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


// creating class for football league
public class FootballLeague {

    // declaring variables
    private String footballLeague;
    // creating a list of type Team to store a list of teams
    List<Team> footballListing = new LinkedList();

    // constructor to initialize a football league
    public FootballLeague(String footballLeague) {
        this.footballLeague = footballLeague;
    }
    // method to sort the list of teams in descending order based on points
    public void descendingOrderSorting(){
        // using sort method from collection class to sort the list of teams
        Collections.sort(footballListing, new Comparator<Team>() {
            @Override
            //Comparing the points of the two teams and returning a negative value
            public int compare(Team team1, Team team2) {
                return - (team1.getPoints()-team2.getPoints());
            }
        });
    }

    // displaying the ranking of the team in the league
    public String toString() {
        String output = "";
        output += "FootballLeague: " + this.footballLeague + "\n";
        Integer teamPosition = 1;
        for (Team team : this.footballListing) {
            output += "\nRanking " + teamPosition.toString() + "\n";
            output += team;
            teamPosition += 1;
        }
        return output;
    }

    // method to add a team to the league
    public void addFootballTeam(Team teamToAdd) {
        this.footballListing.add(teamToAdd);
    }

    // method to remove a team from the league
    public void removeFootballTeam(Team teamToRemove){
        this.footballListing.remove(teamToRemove);
    }

    // method to update the points of the winning and losing team
    public void win_Match(Team winningTeam, Team losingTeam) {
        for (int i = 0; i < this.footballListing.size(); i++) {
            if (footballListing.get(i).getTeamName().compareTo(winningTeam.getTeamName()) == 0) {
                winningTeam.incrementteamWin();
            }
            if (this.footballListing.get(i).getTeamName().compareTo(losingTeam.getTeamName()) == 0) {
                losingTeam.incrementteamLoss();
            }
        }
    }
    // method to update the points of the teams based on a draw result
    public void draw_Match(Team one, Team two) {
        for (int i = 0; i < this.footballListing.size(); i++) {
            if (footballListing.get(i).getTeamName().compareTo(one.getTeamName()) == 0) {
                one.incrementteamDraws();;
            }
            if (this.footballListing.get(i).getTeamName().compareTo(two.getTeamName()) == 0) {
                two.incrementteamDraws();
            }
        }
    }
}