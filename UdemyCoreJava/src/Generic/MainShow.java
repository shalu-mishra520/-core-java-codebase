package Generic;

import java.util.Collections;
import java.util.HashMap;

public class MainShow {
	
	public static void main(String args[]){
		League<Team<FootBallPlayer>> league=new League<>("FootBall Tournament");
		Team<FootBallPlayer> RCB=new Team<>("Royal Challenge");
		Team<FootBallPlayer> BangalTiger=new Team<>("Bengal Tiger");
		Team<FootBallPlayer> DelhiDevil=new Team<>("Delhi Devil");
		Team<FootBallPlayer> kingsGroup=new Team<>("kings Group");
		
		league.addTeamInLeague(RCB);
		league.addTeamInLeague(kingsGroup);
		league.addTeamInLeague(DelhiDevil);
		league.addTeamInLeague(BangalTiger);
		
		
		RCB.matchResult(kingsGroup, 1, 6);
		kingsGroup.matchResult(BangalTiger, 5, 6);
		DelhiDevil.matchResult(RCB, 10, 6);
		RCB.matchResult(kingsGroup, 1, 6);
		//DelhiDevil.matchResult(RCB, 10, 6);
		league.showLeague();
		
		HashMap<String, String> map=new HashMap<>();
		map.put("name", "shalu");
		map.put("age","23");
		System.out.println(map.put("name", "shalumishra"));
		//System.out.println(map.put("age","23"));
		System.out.println(map.put("name", "shalumishra"));
		
	}

}
