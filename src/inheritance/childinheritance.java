package inheritance;

public class childinheritance extends parentInheritance {
    
	public void engine()
	{
		System.out.println("new engine");
	}
    
	public void color()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
	    
		childinheritance cd =new childinheritance();
		cd.color();
		cd.breaks();
		cd.engine();
		cd.gear();
		cd.autoplay();
	}

}
