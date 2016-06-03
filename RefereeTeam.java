/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applisynthese;

/**
 *
 * @author Fanny Rottee
 */
public class RefereeTeam {

    public RefereeTeam(String teamName, int nationality) {
        this.teamName = teamName;
        this.nationality = nationality;
    }
      
    public int getRefereeTeamId() {
        return refereeTeamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getNationality() {
        return nationality;
    }
    
    private int refereeTeamId;
    private String teamName;
    private int nationality;
    
}
