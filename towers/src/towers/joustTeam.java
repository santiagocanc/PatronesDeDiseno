package towers;

import java.util.ArrayList;
import java.util.Scanner;

public class joustTeam extends Towers{
	private ArrayList<Wizard> team ;
	private String Name;
	private String modo;
	
	public joustTeam(String name) {
		this.team = new ArrayList<Wizard>();
		this.Name=name;
		this.modo="joust";
	}

	@Override
	void enter(Wizard w) {
		team.add(w);
		super.setNUM_TEAM_ALLOWED(3);
	}

	public void info() {
		System.err.println(this.Name+" TEAM IN "+ this.modo);
		team.stream().forEach((a)-> { System.out.println(a.toString());});
	}
	
	private String team_string(){
		String aux="";
		int i=0;
		for(Wizard a: team) {
			aux+=i+". "+a.to_string_match()+"\n";
			i++;
		}
		aux+=i+". Exit\n";
		return aux;
	}
	
	public void in_game() {
		
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
	}
}
