package applisynthese;
import java.lang.*;
/**
 *
 * @author Antoine Daigremont
 */
public class Div1 extends Championship{

	public Div1(int season, int league) {
		super(season);
		this.league=league;
		
	}
	
	public void createDiv1(){
		 String seasonString = Integer.toString(season);
		 String leagueString = Integer.toString(league);
		 String requete = "insert into competition (id_championnat, id_saison) values ('"+ leagueString+"', '" + seasonString +"')" ;
		 Connexion c = new Connexion();
		 c.modifBase(requete);
	}
	
	public void participationTeam(){
		int nbequipes;
		String requete = "select nb_equipes from championnat where id_championnat = 1";
		Connexion c = new Connexion();
		c.lireBase(requete);
		int idCompet;
		for (int cpt=0; cpt<=nbrequipes;cpt++{
			
		})
	}
   
	@Override
	public Team getWinner() {
		return null;
	}
	@Override
	public Team[] getAllWinners() {
		return null;
	}
	 private int league;
}

