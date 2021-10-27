package towers;

public class Wizard {
	private String name;
	private rols rol;

	public Wizard(String name, rols rol) {
		this.name=name;
		this.rol=rol;
	}
	
	public void work(String a) {
		switch(a) {
			case "trats":
				System.out.println(name+rol.start());
				break;
			case "dne":
				System.out.println(name+rol.end());
				break;
			case "vg1":
				System.out.println(name+rol.gank_l());
				break;
			case "vg2":
				System.out.println(name+rol.gank_m());
				break;
			case "vg3":
				System.out.println(name+rol.gank_r());
				break;
			case "vaa":
				System.out.println(name+rol.team_figth());
				break;
			case "vva":
				System.out.println(name+rol.normal_game());
				break;
			default:
				System.err.println("command not found");
				break;
		}
	}

	public String to_string_match() {
		return name;
	}
	@Override
	public String toString() {
		return name + " -> "+rol.name();
	}
		
}
