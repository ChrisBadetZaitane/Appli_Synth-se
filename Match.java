package applisynthese;

public class Match {
	
	
	public Match(int journee, Team team1, Team team2, String place, RefereeTeam refereeTeam, Competition competition) {
		this.journee = journee;
		this.team1 = team1;
		this.team2 = team2;
		this.place = place;
		this.refereeTeam = refereeTeam;
		this.competition = competition;
		this.matchType=1;
	}
	
	public Match(int journee, Team team1, Team team2, String place, RefereeTeam refereeTeam, Competition competition, int linkedMatch) {
		this.journee = journee;
		this.team1 = team1;
		this.team2 = team2;
		this.place = place;
		this.refereeTeam = refereeTeam;
		this.competition = competition;
		this.matchType = 2;
		this.linkedMatch = linkedMatch;
	}
	
	
	
	public int getJournee() {
		return journee;
	}

	public Team getTeam1() {
		return team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public String getPlace() {
		return place;
	}

	public RefereeTeam getRefereeTeam() {
		return refereeTeam;
	}

	public int getGoalsTeam1() {
		return goalsTeam1;
	}

	public int getGoalsTeam2() {
		return goalsTeam2;
	}

	public Competition getCompetition() {
		return competition;
	}

	public int getMatchType() {
		return matchType;
	}

	public int getLinkedMatch() {
		return linkedMatch;
	}



	public void setJournee(int journee) {
		this.journee = journee;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setRefereeTeam(RefereeTeam refereeTeam) {
		this.refereeTeam = refereeTeam;
	}

	public void setGoalsTeam1(int goalsTeam1) {
		this.goalsTeam1 = goalsTeam1;
	}

	public void setGoalsTeam2(int goalsTeam2) {
		this.goalsTeam2 = goalsTeam2;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public void setMatchType(int matchType) {
		this.matchType = matchType;
	}

	public void setLinkedMatch(int linkedMatch) {
		this.linkedMatch = linkedMatch;
	}



	int journee;
	Team team1;
	Team team2;
	String place;
	RefereeTeam refereeTeam;
	int goalsTeam1;
	int goalsTeam2;
	Competition competition;
	int matchType;
	int linkedMatch;
	
	

}
