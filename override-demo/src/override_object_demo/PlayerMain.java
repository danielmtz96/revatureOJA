package override_object_demo;

public class PlayerMain {
	public static void main(String[] args) {
		
		Player p1 = new Player(100, "Sachin R T");
		System.out.println(p1);
		System.out.println(p1.toString());
	    
		Player p2 = new Player(100, "Sachin R T");
		if(p1.equals(p2)) {
			System.out.println("p1 and p2 are the same");
		} else {
			System.out.println("p1 and p2 are different");
		}
		
	}
}
