package applisynthese;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lireEnBase();
	}
	
	public static void lireEnBase() {

		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://134.214.113.155/p1512799";
		String login = "p1512799";
		String passwd = "******";
		Connection cn =null;
		Statement st =null;
		ResultSet rs =null;
		
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "update club set city='Lyon' where id_club='120'";

			// Etape 4 : ex�cution requ�te
			//rs = st.executeQuery(sql);
			int rowsAffected    = st.executeUpdate(sql);
			
			

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

			//while (rs.next()) {
			//	System.out.println(rs.getString("name"));
				
			//}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : lib�rer ressources de la m�moire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}