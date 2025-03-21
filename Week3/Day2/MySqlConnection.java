package Week3.Day2;

public abstract class MySqlConnection implements DatabseConnection{
	@Override
	public void connect() {
System.out.println("c");		
	}
	@Override
	public void disconnect() {
System.out.println("D");		
	}
	@Override
	public void executeUpdate() {
System.out.println("EU");		
	}
	public void executeQuery() {
	System.out.println("EQ");	
	}
	public static void main(String[] args) {
	
		MySqlConnection M=new MySqlConnection();
		
		M.connect();
		M.disconnect();
		M.executeQuery();
		M.executeUpdate();
	}

	
	

}
