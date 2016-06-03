package applisynthese;


import java.util.Date;

/**
 *
 * @author Antoine Daigremont
 */
public class ChampionsLeague extends EuropeanTournament{
	
	/*public ChampionsLeague(String competitionName, Date year, Team calendar, Team winner){
		super();
	}*/
    public ChampionsLeague(String competitionName) {
		super(competitionName);
		
	}
    
    @Override
	/*public String toString() {
		return "ChampionsLeague [getCompetitionName()=" + getCompetitionName() + "]";
	}*/

	public String getCompetitionName(){
  	  return super.getCompetitionName();
    }
	/**
     * @override
     */
    public void checkRefereeNationality(){
    
    }
    
     /**
     * @override
     */
    public int groupRanking(){
        
        return 0;
    }

	@Override
	public Team getWinner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team[] getAllWinners() {
		// TODO Auto-generated method stub
		return null;
	}
	/*public String getCompetitionName() {
		
		
	}*/
	
}
