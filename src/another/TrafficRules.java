package another;

public class TrafficRules implements  CentralTraffic,contenentalTraffic{

	public static void main(String[] args) {
		CentralTraffic a= new TrafficRules();
		a.RedLight();
		a.YellowLight();
		a.FlashLight();
		
		TrafficRules at = new TrafficRules();
		at.walkingSignal();
        
		contenentalTraffic city= new TrafficRules();
       city.TrafficRules();
	}

	@Override
	public void RedLight() {
		// TODO Auto-generated method stub
		//code we have to do
		System.out.println("redlight we have to implements");
	}
    
	public void walkingSignal()
	{
		System.out.println("walking");
	}
	@Override
	public void YellowLight() {
		// TODO Auto-generated method stub
		System.out.println("yellowlight we have to implements");
	}

	@Override
	public void FlashLight() {
		// TODO Auto-generated method stub
		System.out.println("flashlight we have to implements");
	}

	@Override
	public void TrafficRules() {
		System.out.println("there are some rules");
		
	}

}
