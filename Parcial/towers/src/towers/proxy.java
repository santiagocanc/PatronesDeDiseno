package towers;

public class proxy extends Game{
	
	private int gods;
	private Game twr;
	
	public proxy(Game tower) {
		this.twr=tower;
	}
	
	private boolean validate() {
		return twr.auth();
	}
	
	public void enter(Wizard w){
		state s = state.getstate();
		s.setStatus("In Queue");
		if(validate()) {
			if (gods < twr.getNUM_TEAM_ALLOWED()) {
		      twr.enter(w);
		      gods++;
		    }else {
		    	System.out.println("Full team \n Sorry "+w);
		    }
		}else {
			System.out.println("Partida en curso, espere a que termine");
		}
		
	}
	

	@Override
	public void info() {
			if(gods== twr.getNUM_TEAM_ALLOWED()) {
								
				twr.info();
			}else {
				System.out.println("INCOMPLETE TEAM. missing= "+ (twr.getNUM_TEAM_ALLOWED()-gods));
				twr.info();
			}
	}

	@Override
	public void in_game() {
		state s = state.getstate();
		twr.setTime(0);
		if(validate()) {
			System.out.println(s.getStatus());
			s.setStatus("In Match");
			twr.in_game();
		}
	}

	@Override
	public void stats() {
		twr.stats();
	}
		
}
