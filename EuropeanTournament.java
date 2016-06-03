package applisynthese;
import java.lang.*;
/**
 *
 * @author Antoine Daigremont
 */
public abstract class EuropeanTournament extends Competition{
    
    public EuropeanTournament(String competitionName) {
		super(competitionName);
		// TODO Auto-generated constructor stub
	}
    
    public String getCompetitionName(){
  	  return super.getCompetitionName();
    }

	//Méthode de classement des poules
    public abstract int groupRanking();
    
    //Vérification de la nationalité de l'arbitre, qui ne doit pas être la même que celle de l'une des deux équipes
    public abstract void checkRefereeNationality();
}
