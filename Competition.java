
package applisynthese;

import java.lang.*;
import java.util.Date;


public abstract class Competition{
    
      protected int season;
      // private Date year;
      //private Team calendar;
      private Team winner;
      
      public Competition(int season){
    	  this.season=season;
    	  //this.year=year;
    	  
      }
     /* public int getTeamRank( Team teamname){

          
      }
      
      public int[][] getLeagueTable (String competitionName){
      
          return ;
      }*/
      public int getSeason(){
    	  return season;
      }
      /*public Date getYear(){
    	  return year;
      }*/
      public abstract Team getWinner();

      public abstract Team[] getAllWinners ();
      
      public void closeChampionship ( String competitionName){

      }

      public void setMatch ( Team team1, Team team2, String competitionName, Date dateMatch){

      }
}
