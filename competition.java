
package applisynthese;

import java.lang.*;
import java.util.Date;


public abstract class Competition{
    
      private String competitionName;
      private Date year;
      private Team calendar;
      private Team Winner;
      
     /* public int getTeamRank( Team teamname){

          
      }
      
      public int[][] getLeagueTable (String competitionName){
      
          return ;
      }*/
      public String getCompetitionName(){
    	  return competitionName;
      }
      public Date getYear(){
    	  return year;
      }
      public abstract Team getWinner();

      public abstract Team[] getAllWinners ();
      
      public void closeChampionship ( String competitionName){

      }

      public void setMatch ( Team team1, Team team2, String competitionName, Date dateMatch){

      }
}
