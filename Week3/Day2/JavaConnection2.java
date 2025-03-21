package Week3.Day2;

public class JavaConnection2 extends MySqlConnection implements DatabaseConnection2 {
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
		System.out.println("EU");
	}
	@Override
	public void executeQuery() {
		System.out.println("EQ");
	}
	
	public static void main(String[] args) {
		JavaConnection2 j=new JavaConnection2();
		j.connect();
		j.disconnect();
		j.executeQuery();
		j.executeUpdate();
		
	}
	
	}

