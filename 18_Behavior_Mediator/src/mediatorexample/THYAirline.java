package mediatorexample;

public class THYAirline extends AirlineBase{
	
	@Override
	public void GetLandingPermission() {
		// TODO Auto-generated method stub
		System.out.println(FlightCode + " number THY plane send a request to land");
		
		if (Airport != null){
			
			boolean hasPermissionForLanding = Airport.GiveLandingPermission(FlightCode);
                               
            if (hasPermissionForLanding)
                System.out.println("Give a permission to land");
            else
            	System.out.println("Not give a permission to land");
        }
        else
        	System.out.println("Plane not registered so that there is no permission to land");
	}

}
