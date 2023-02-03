public class Dashboard {
    // this is the main method to run the program
    public static void main(String[] args) {
        // creating teams
        Team team1 = new Team("FC Barcelona");
        Team team2 = new Team("FC Bayern Munich");
        Team team3 = new Team("Chelsea FC");

        Team team4 = new Team("Paris Saint-Germain FC");
        Team team5 = new Team("Real Madrid CF");
        Team team6 = new Team("Man CIty FC");

        // creating the football league
        FootballLeague footballLeague = new FootballLeague("UEFA Champions League");

        // teams are being added to the league
        footballLeague.addFootballTeam(team1);
        footballLeague.addFootballTeam(team2);
        footballLeague.addFootballTeam(team3);
        footballLeague.addFootballTeam(team4);
        footballLeague.addFootballTeam(team5);
        footballLeague.addFootballTeam(team6);

        // matches and results
        footballLeague.win_Match(team2,team1);
        footballLeague.win_Match(team2,team4);
        footballLeague.win_Match(team4,team5);
        footballLeague.draw_Match(team1,team5);

        // sorting the teams in descending orders
        footballLeague.descendingOrderSorting();

        // printing out the output of the league
        System.out.println(footballLeague);
    }
}