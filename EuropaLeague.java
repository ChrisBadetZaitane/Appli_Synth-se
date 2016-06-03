package applisynthese;
/**
 *
 * @author Fanny Rottee/Antoine Daigremont/Christophe Badet Zaitane
 */
public class EuropaLeague extends EuropeanTournament{
    public EuropaLeague(int season) {
		super(season);
		// TODO Auto-generated constructor stub
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
	public void createChampionsLeague(){
		 String seasonString = Integer.toString(season);
		 String requete = "insert into competition (id_championnat, id_saison) values ('18', '" + seasonString +"')" ;
		 Connexion c = new Connexion();
		 c.modifBase(requete);
	}
}
