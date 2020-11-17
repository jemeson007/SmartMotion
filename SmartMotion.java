package alexax;
import java.util.HashMap;
import java.util.Scanner;


public class SmartMotion {

	public static int projection() { 
		  HashMap<Integer, String> Gesture = new HashMap<Integer, String>();
		 
			  Gesture.put(1,"PlayNamedChoreo");
			  Gesture.put(2,"TurnToPrimaryUser");
			  Gesture.put(3,"StopMotion");
			  Gesture.put(4,"SetWakeWordResponse");
			  Gesture.put(5,"GoToCenter");
			  Gesture.put(6,"FollowPrimaryUser");
		  
		  try(Scanner sn = new Scanner(System.in)){
			   System.out.println("Show Motion ... ");
			   String mto = sn.next();
		  
		  
		  int j = 6;
		  Gesture.put(++j, mto);
		  int echos = j; // post to alexaex<=>smartmotion {10}
//		  ++j;
		  sn.close();
		  
		  return echos;
		  }
		  
		  	  
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = projection();
		System.out.println(w);

	}

}

