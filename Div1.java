package applisynthese;
import java.lang.*;
/**
 *
 * @author Antoine Daigremont
 */
public abstract class Div1 extends Championship{

	public Div1(int season) {
		super(season);
		// TODO Auto-generated constructor stub
	}
	public void createDiv1(){
		 String seasonString = Integer.toString(season);
		 String requete = "insert into competition (id_championnat, id_saison) values ('17', '" + seasonString +"')" ;
		 Connexion c = new Connexion();
		 c.modifBase(requete);
	}
    
    
}

