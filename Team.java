package applisynthese;

public class Team {

	public Team (String name, int nationality, String city, String stadium, 
			int championshipPoints, int matchsGoalFor, int matchsGoalAgainst){
		
		this.name=name;
		this.nationality=nationality ;
		this.city=city;
		this.stadium=stadium;
		this.championshipPoints=championshipPoints;
		this.matchsGoalFor=matchsGoalFor;
		this.matchsGoalAgainst=matchsGoalAgainst;
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





	private String name;
	private int nationality;
	private String city;
	private String stadium;
	private int championshipPoints;
	private int matchsGoalFor;
	private int matchsGoalAgainst;
}
