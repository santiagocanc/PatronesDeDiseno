package towers;

import java.util.ArrayList;
import java.util.Scanner;

public class joustTeam extends Map{
	private ArrayList<Wizard> team ;
	private String Name;
	private String modo;
	
	public joustTeam(String name) {
		this.team = new ArrayList<Wizard>();
		this.Name=name;
		this.modo="joust";
		this.setBoss("Bull Demon");
		this.setNum_phonex(1);
		this.setNum_tower(1);
	}

	@Override
	void enter(Wizard w) {
		team.add(w);
		super.setNUM_TEAM_ALLOWED(3);
	}

	public void info() {
		System.err.println(this.Name+" TEAM IN "+ this.modo);
		System.out.println(this.getNum_tower());
		team.stream().forEach((a)-> { System.out.println(a.toString()+" "+a.items);});
	}
	
	String team_string(){
		String aux="";
		int i=0;
		for(Wizard a: team) {
			aux+=i+". "+a.to_string_match()+"\n";
			i++;
		}
		aux+=i+". Full team\n";
		aux+=i+". Stats\n";
		aux+=i+". Exit\n";
		return aux;
	}
	
	public void in_game() {
		
		int t = 0;
		Scanner input = new Scanner(System.in);
		state s =state.getstate();
		while(t==0){
			if(!hpValidate()) {
				System.out.println("Un integrante se ha muerto");
				System.err.println("FIN DE LA PARTIDA");
				break;
			}
			System.out.println("============="+this.getTime()+"=============");
			stats();
			System.out.println(team_string());
			int index = Integer.parseInt(input.nextLine());
			if(index < team.size()) {
				System.out.print("Actividad individual: ");
				String act = input.nextLine();
				team.get(index).action(act,this.getTime(),false);
			}else if(index == team.size()){
				System.out.print("Actividad grupal: ");
				String act = input.nextLine();
				team.forEach(x -> x.action(act, this.getTime(), true));
			}else if(index == team.size()+1){
				stats();
			}else {
				t=1;
				s.setStatus("In Lobby");
			}
			this.setTime(this.getTime() + 1);
		}
		
	}

	private boolean hpValidate() {
		boolean t = true;
		for(Wizard a:team) {
			if(a.getHp() <= 0){t= false;}
		}
		return t;
	}

	@Override
	public void stats() {
		team.stream().forEach((a)-> { System.out.println(a.getStats());});
		
	}
}
/*
Scanner input = new Scanner(System.in);
		System.err.println("=============================");
		team.stream().forEach((a)-> { a.work("trats"); System.out.println("");});
		System.err.println("=============================");
		do {
			
			System.out.print(team_string()+"-->");
			int index = Integer.parseInt(input.nextLine());
						
			if(index<team.size()) {
				System.out.print("action: ");
				String act = input.nextLine();
				team.get(index).work(act);
			
			}else if(index==team.size()) {
				team.stream().forEach((a)-> { a.work("dne");});
				break;
			}else{

				System.out.println("god not found");
			}
			System.err.println("=============================");
			
		}while(true);
*/