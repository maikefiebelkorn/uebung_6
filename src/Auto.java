

public class Auto {
	public double kilometerstand;
	public double tankinhalt1= 40;
	public double tankinhalt;
	public double maxtankinhalt = 40;
	public double Benzinverbrauch = 0.1;
	
	public void fahre(double kilometer) {
		tankinhalt = tankinhalt1 - (kilometer * Benzinverbrauch);
		
		if (tankinhalt <= 0)
		{ tankinhalt = 0;
	
		kilometer = (tankinhalt1 - tankinhalt)/Benzinverbrauch;
		kilometerstand = kilometerstand + kilometer;
		}
		
		kilometerstand =  kilometer;
}
}
