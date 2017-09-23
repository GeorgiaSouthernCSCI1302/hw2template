package assignment;

public class MyAthleticProgram {

	public static void main(String[] args) {
		//Create a Swimmer
		Swimmer s = new Swimmer("Missy Franklin", 1995, 5, 10);
		s.setGender('F');
		Swimmer.Event[] e = {Swimmer.Event.Backstroke,Swimmer.Event.Freestyle,Swimmer.Event.Medley};
		s.setEvent(e);
		s.setTeamName("Colorado Stars");
		s.setIsAPro(false);
		System.out.println(s);
		
		//Create a golfer
		Golfer g = new Golfer("Tiger Woods", 1975, 12, 30 );
		g.setGender('m');
		g.setIsAPro(true);
		System.out.println(g);
	
		
	}

}
