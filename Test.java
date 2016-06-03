package applisynthese;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test {

	
	public static void main(String[] args) throws SQLException {
		/*ChampionsLeague championsLeague2016 = new ChampionsLeague(2);
		 championsLeague2016.createChampionsLeague();
		 
		 Div1 ligue1 = new Div1(1, 4);
		 ligue1.createDiv1();
		int nbrequipes=0;
		String requete = "select nb_equipes from championnat where id_championnat = 1";
		String columnIndex = "nb_equipes";
		Connexion c = new Connexion();
		List<Object> reponse = c.lireBase(requete, columnIndex);
		if (reponse == null) System.out.println("null");
		if (reponse.size() > 1) System.out.println("fuck");
		else nbrequipes=(int) (reponse.get(0));
		
		requete = "select id_club from club where nationalite = 1 and not exists "
				+ "(select club.id_club from club, participation where participation.id_club = "
				+ "club.id_club and id_competition = 1 and nationalite = 1)";
		
		List<Object> listeEquipe = c.lireBase(requete, "id_club");
		if (reponse == null) System.out.println("null");
		if (reponse.size() > 1) System.out.println("fuck");
		else 
		for (int cpt=0; cpt<=nbrequipes;cpt++){
	
		}*/
		
		int nb_matchs_joues, points, goalaverage, marques, encaisses;
		Connexion c = new Connexion();
		String requete = "select name, nb_matchs_joues, points, goalaverage, marques, encaisses from club, participation where club.id_club = "
				+ "participation.id_club and id_competition=7 order by points desc, goalaverage desc, marques desc, encaisses desc";
		ResultSet classement = c.lireBase(requete);
		
		
	}
		

}
