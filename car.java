package week1.day1;
// class - common car  object - bmw  method - action
public class car {
	
	public void applyingBreak() {
		System.out.println("applying a break");
	}
	public void gear () {
		System.out.println("applying a gear");
	}
	public void ac() {
		System.out.println("switch on AC");
	}
	public void light() {
		System.out.println("switch on light");
	}
	
	public static void main(String[] args) {
		// auto generate method stub    object - send 
		car end = new car();
		end.applyingBreak();
		end.gear();
		end.ac();
		end.light();
		
	}

}
