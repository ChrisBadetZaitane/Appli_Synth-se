package applisynthese;
import java.lang.*;
import java.util.Date;
/**
 *
 * @author Antoine Daigremont
 */
public abstract class EuropeanTournament extends Competition{
    
    public EuropeanTournament(int season) {
		super(season);
		// TODO Auto-generated constructor stub
	}
    
    public int getSeason(){
  	  return super.getSeason();
    }

	//Méthode de classement des poules
    public abstract int groupRanking();
    
    //Vérification de la nationalité de l'arbitre, qui ne doit pas être la même que celle de l'une des deux équipes
    public abstract void checkRefereeNationality();
}
