package Week3.Day2;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
System.out.println("C");		
	}

	@Override
	public void disconnect() {
System.out.println("D");		
	}

	@Override
	public void executeUpdate() {
System.out.println("E");		
	}
	public static void main(String[] args) {
		JavaConnection j=new JavaConnection();
		j.connect();
		j.executeUpdate();
		j.disconnect();
	}

}
