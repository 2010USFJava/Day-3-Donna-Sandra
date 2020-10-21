package com.revature.driver;
import com.revature.bean.Player;

public class Driver {
	public static void main(String[] args) {
		
	Player a = new Player("Lebron", "PF", "Lakers");
	Player b = new Player("Kyrie", "PG", "Nets");
	Player c = new Player("Clippers", "SF", "Clippers");
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
