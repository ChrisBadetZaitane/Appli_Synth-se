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
public class Referee {
    
   
    public Referee(int refereeId, String firstName, String lastName, int nationality) {
        this.refereeId = refereeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }
    
    public int getRefereeNationality(int nationality) {
        
        return refereeId;
    }
    
    public int getRefereeId() {
        return refereeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNationality() {
        return nationality;
    }

    
    private int refereeId;
    private String firstName;
    private String lastName;
    private int nationality;
    
}
