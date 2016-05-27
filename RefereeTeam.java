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

    public RefereeTeam(int referee, int assistant1, int assistant2, int assistant3, int assistant4) {
        this.referee = referee;
        this.assistant1 = assistant1;
        this.assistant2 = assistant2;
        this.assistant3 = assistant3;
        this.assistant4 = assistant4;
    }

    public RefereeTeam() {
        this.referee = referee;
        this.assistant1 = assistant1;
        this.assistant2 = assistant2;
        this.assistant3 = assistant3;
        this.assistant4 = assistant4;
    }
    public int getReferee() {
        return referee;
    }

    public int getAssistant1() {
        return assistant1;
    }

    public int getAssistant2() {
        return assistant2;
    }

    public int getAssistant3() {
        return assistant3;
    }

    public int getAssistant4() {
        return assistant4;
    }
    
    private int referee;
    private int assistant1;
    private int assistant2;
    private int assistant3;
    private int assistant4;
    
}
