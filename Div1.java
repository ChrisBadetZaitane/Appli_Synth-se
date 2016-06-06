package applisynthese;
import java.lang.*;
import java.sql.ResultSet;
import java.util.List;
/**
 *
 * @author
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
	
	public void participationTeam(int competition){
		Connexion c = new Connexion();
		String requete = "select id_club from participation where id_competition=7 order by points desc, goalaverage desc, marques desc, encaisses desc limit 18";
		List classement = c.lireBase(requete, "id_club");
		for (int i=0; i< classement.size(); i++){
			String requeteBis = "insert into participation (id_club, id_competition, nb_matchs_joues, points, goalaverage, marques, encaisses) "
					+ "VALUES ("+classement.get(i)+", "+competition+", 0, 0, 0, 0, 0)";
			c.modifBase(requeteBis);
		}
		requete = "select id_club from participation where id_competition=7 order by points desc, goalaverage desc, marques desc, encaisses desc limit 3";
	    classement =  c.lireBase(requete, "id_club");
	    for (int i=0; i< classement.size(); i++){
			String requeteBis = "insert into participation (id_club, id_competition, nb_matchs_joues, points, goalaverage, marques, encaisses) "
					+ "VALUES ("+classement.get(i)+", "+competition+", 0, 0, 0, 0, 0)";
			c.modifBase(requeteBis);
			
		}
	    c.closeConnexion();
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

