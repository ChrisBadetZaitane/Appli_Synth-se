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
	
    public ChampionsLeague(int season) {
		super(season);
		
	}
    
    @Override
	/*public String toString() {
		return "ChampionsLeague [getCompetitionName()=" + getCompetitionName() + "]";
	}*/

	public int getSeason(){
  	  return super.getSeason();
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
	public void createChampionsLeague(){
		 String seasonString = Integer.toString(season);
		 String requete = "insert into competition (id_championnat, id_saison) values ('17', '" + seasonString +"')" ;
		 Connexion c = new Connexion();
		 c.modifBase(requete);
	}
	
}
