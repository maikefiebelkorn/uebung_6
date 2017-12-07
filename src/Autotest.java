

public class Autotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Auto();
		Auto testwagen1;
		Auto testwagen2;
		testwagen1 = new Auto();
		testwagen2 = new Auto();
		for (int i = 1; i <= 3; i ++){
		testwagen1.fahre(Zufall.getZufallInt(10, 100));
		testwagen2.fahre(Zufall.getZufallInt(10,4010));
	
		System.out.println("Kilometerstand Auto 1:" + testwagen1.kilometerstand);
		System.out.println("Tankinhalt Auto 1:" + testwagen1.tankinhalt);
		System.out.println("Kilometerstand Auto 2:" +testwagen2.kilometerstand);
		System.out.println("Tankinhalt Auto 2:"+testwagen2.tankinhalt);


	}

}}
