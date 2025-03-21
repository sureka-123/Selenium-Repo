package Week3.Day2;


public class safari extends edge {
	 public void readerMode() {
		 System.out.println("readerMode");
	 }
	 public void fullScreenMode() {
System.out.println("fullScreenMode");
	}
	 public static void main(String[] args) {
		safari s=new safari();
		s.readerMode();
		s.fullScreenMode();
		s.clearCookies();
		s.takeSnap();
			
	}
	 
}
