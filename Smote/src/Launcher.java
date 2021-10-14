import mages.HeBot;
import mages.component;
import mages.objets.*;

public class Launcher {
	public static void main(String[] args) {
		component c = new HeBot();
		System.out.println("Hebo base "+c.getStats()+"\n");
		c =  new Bancroft(c);
		System.out.println("Hebo 1 item "+c.getStats()+"\n");
		c = new Typhons(c);
		System.out.println("Hebo 2 item "+c.getStats()+"\n");
		c = new Soul_Reaver(c);
		System.out.println("Hebo 3 item "+c.getStats()+"\n");
		c = new Stone_of_Fal(c);
		System.out.println("Hebo 4 item "+c.getStats()+"\n");
	}
}
