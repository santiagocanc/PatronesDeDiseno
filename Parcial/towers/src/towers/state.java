package towers;


public class state {
	private static state s;
	private String status;
	
	private state(){
        System.out.println("run server");
    }
	
    
	public static state getstate(){
        if(s==null){
            s=new state();
        }
        return s;
    }


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
    
}
