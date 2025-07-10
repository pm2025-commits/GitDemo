package abstarct;

public class childAbstratc extends ParentAbstract {

	public static void main(String[] args) {
		childAbstratc c= new childAbstratc();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		System.out.println("its shwoing red color");
		
	}

}
