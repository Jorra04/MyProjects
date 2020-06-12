
public class Elevator {
	final int max_level = 45;
	private int curr_level;
	
	Elevator(){
		this.curr_level = 0;
		
	}
	
	public void advance(int level) {
		if(level + curr_level > this.max_level) curr_level = this.max_level;
		
		else this.curr_level += level;
	}
	
	public void go_down(int level) {
		if(this.curr_level - level < -1) curr_level = -1; //-1 represents the basement.
		
		else this.curr_level -= level;
	}
	
	
	public int getLevel() {
		return this.curr_level;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator elevator = new Elevator();
		System.out.println(elevator.curr_level);
		elevator.advance(3);
		System.out.println(elevator.curr_level);
		elevator.go_down(100);
		System.out.println(elevator.getLevel());
		elevator.advance(100);
		System.out.println(elevator.getLevel());
	}

}
