package towers;

public class proxy extends Towers{
	
	private int gods;
	private Towers twr;
	
	public proxy(Towers tower) {
		this.twr=tower;
	}
	
	public void enter(Wizard w){
		if (gods < twr.getNUM_TEAM_ALLOWED()) {
	      twr.enter(w);
	      gods++;
	    }else {
	    	System.out.println("Full team \n Sorry "+w);
	    }
		
	}

	@Override
	public void info() {
		if(gods== twr.getNUM_TEAM_ALLOWED()) {
			System.out.println("Start Match");
			twr.info();
		}else {
			System.out.println("INCOMPLETE TEAM. missing= "+ (twr.getNUM_TEAM_ALLOWED()-gods));
			twr.info();
		}
		
	}

	@Override
	public void in_game() {
		twr.in_game();
	}
		
}
