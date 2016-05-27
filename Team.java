package appliSynthese;

public class Team {

	public Team (String name, int nationality, String city, String stadium, 
			int championshipPoints, int matchsGoalFor, int matchsGoalAgainst){
		
		name =this.name;
		nationality =this.nationality;
		city=this.city;
		stadium=this.stadium;
		championshipPoints=this.championshipPoints;
		matchsGoalFor=this.matchsGoalFor;
		matchsGoalAgainst=this.matchsGoalAgainst;
	}
	
	
	public String getName() {
		return name;
	}
	public int getNationality() {
		return nationality;
	}
	public String getCity() {
		return city;
	}
	public String getStadium() {
		return stadium;
	}
	public int getChampionshipPoints() {
		return championshipPoints;
	}
	public int getMatchsGoalFor() {
		return matchsGoalFor;
	}
	public int getMatchsGoalAgainst() {
		return matchsGoalAgainst;
	}
	


	public void setChampionshipPoints(int championshipPoints) {
		this.championshipPoints = championshipPoints;
	}


	public void setMatchsGoalFor(int matchsGoalFor) {
		this.matchsGoalFor = matchsGoalFor;
	}


	public void setMatchsGoalAgainst(int matchsGoalAgainst) {
		this.matchsGoalAgainst = matchsGoalAgainst;
	}



	private String name;
	private int nationality;
	private String city;
	private String stadium;
	private int championshipPoints;
	private int matchsGoalFor;
	private int matchsGoalAgainst;
}
