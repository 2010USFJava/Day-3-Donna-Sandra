package com.revature.bean;

public class Player {

	private String name;	/* 1.1 */
	private String position;	/* 1.2 */
	private String team;	/* 1.3 */
	
	public Player(String name, String position, String team){ /* 1.4 */
		this.name = name;
		this.position = position;
		this.team = team;
	}

	public String getName() {	/* 2.1 */
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getPosition(){ /* 2.2 */
		return this.position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	
	public String getTeam(){ /* 2.3 */
		return this.team;
	}
	public void setTeam(String team){
		this.team=team;
	}

	@Override 
	public String toString() {
		return "Person [Name:" + name + 
						" Position:" + position +
						" Team:" + team +
				
				"]";
	}
}

public class Food{
	
}
