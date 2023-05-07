package week1.day1;
// class - common car  object - bmw  method - action
public class mobile {
	
	public void message() {
		System.out.println("sending a message");
	}
	public void call() {
		System.out.println("making a call");
	}
	public void app() {
		System.out.println("opening a app");
	}
	public void document() {
		System.out.println("opening a document");
	}
	
	public static void main(String[] args) {
		// auto generate method stub    object - send 
		mobile end = new mobile();
		end.message();
		end.call();
		end.app();
		end.document();
		
	}

}
