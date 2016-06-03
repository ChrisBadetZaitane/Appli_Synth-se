package applisynthese;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {

    String url;
    String login;
    String passwd;
    Connection cn;
    Statement st;
    ResultSet rs;
        
    public Connexion(){
        url = "jdbc:mysql://134.214.113.155/p1512799";
        login = "p1512799";
        passwd = "248128";
        cn =null;
        st =null;
        rs =null;
    }
    
    public void openConnexion(){
        try {
            // Etape 1 : Chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            // Etape 2 : r�cup�ration de la connexion
            cn = DriverManager.getConnection(url, login, passwd);
        }catch (java.sql.SQLException e){
            System.out.println("Erreur connexion : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur connexion : " + e.getMessage());
        }
        if (cn == null) {
            System.out.println("Probleme de connexion.");
            System.exit(1);
        }
        
    }
    
    public void closeConnexion(){
        try {
            cn.close();	// Fermeture de la connexion
      }catch (java.sql.SQLException e){
            System.out.println("ERREUR ORACLE" + e.getMessage());
      }
    }
    

    public void modifBase(String requete) {

        try {
            if (cn == null) {
                openConnexion();
            }
            // Etape 3 : Cr�ation d'un statement
            st = cn.createStatement();

            String sql = requete;

            // Etape 4 : ex�cution requ�te
            //rs = st.executeQuery(sql);
            int rowsAffected = st.executeUpdate(sql);

            // Si r�cup donn�es alors �tapes 5 (parcours Resultset)

            //while (rs.next()) {
            //	System.out.println(rs.getString("name"));

            //}
    } catch (SQLException e) {
            e.printStackTrace();
    } finally {
            try {
            // Etape 6 : lib�rer ressources de la m�moire.
                st.close();
                closeConnexion();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
    }
    }
    
    
}