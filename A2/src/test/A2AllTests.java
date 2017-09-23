/************* DO NOT MODIFY THIS FILE ****************/ 
package test;

import student.TestCase;

import java.lang.reflect.*;
import java.time.LocalDate;

import assignment.*;


public class A2AllTests extends TestCase {

	//@TestSwimmer
	public void testCreatingASwimmerObjectTC1a() { //multiple event
		systemOut().clearHistory();
		//Create a Swimmer
		Swimmer s = new Swimmer("Missy Franklin", 1995, 5, 10);
		s.setGender('F');
		Swimmer.Event[] e = {Swimmer.Event.Backstroke,Swimmer.Event.Freestyle,Swimmer.Event.Medley};
		s.setEvent(e);
		s.setTeamName("Colorado Stars");
		s.setIsAPro(false);
		System.out.println(s);
		assertFuzzyEquals("Missy Franklin is a female amateur swimmer for team: Colorado Stars in the following events: Backstroke; Freestyle; Medley\n"+
				"Missy Franklin is 22 years, 4 months and 13 days old.\n", 
				systemOut().getHistory());
	}

	//@TestSwimmer
	public void testCreatingASwimmerObjectTC1b() { //single event
		systemOut().clearHistory();
		//Create a Swimmer
		Swimmer s = new Swimmer("Missy Franklin", 1995, 5, 10);
		s.setGender('F');
		Swimmer.Event e = Swimmer.Event.Freestyle;
		s.setEvent(e);
		s.setTeamName("Colorado Stars");
		s.setIsAPro(false);
		System.out.println(s);
		assertFuzzyEquals("Missy Franklin is a female amateur swimmer for team: Colorado Stars in the following events: Freestyle\n"+
				"Missy Franklin is 22 years, 4 months and 13 days old.\n", 
				systemOut().getHistory());
	}

	//@TestSwimmer
	public void testEqualsOnTwoSwimmerObjectsTC1c() { //checks the implementation of the equals method
		//Create a Swimmer
		Swimmer s = new Swimmer("Missy Franklin", 1995, 5, 10);
		Swimmer other = new Swimmer("Missy Franklin", 1995, 5, 10);
		boolean expected = true;
		boolean actual = s.equals(other);
		assertEquals(expected, actual);
	}

	//@TestSwimmer
	public void testEqualsOnTwoSwimmerObjectsTC1d() { //checks the implementation of the equals method
		//Create a Swimmer
		Swimmer s = new Swimmer("Missy Franklin", 1995, 5, 10);
		Swimmer other = new Swimmer("Katie Ledecky", 1995, 5, 10);
		boolean expected = false;
		boolean actual = s.equals(other);
		assertEquals(expected, actual);
	}

	//@TestSwimmer
	public void testEqualsOnTwoSwimmerObjectsTC1e() { //checks the implementation of the equals method
		//Create a Swimmer
		Swimmer s = new Swimmer("Missy Franklin", 1995, 5, 10);
		Swimmer other = new Swimmer("Missy Franklin", 1997, 3, 17);
		boolean expected = false;
		boolean actual = s.equals(other);
		assertEquals(expected, actual);
	}
	//@TestGolfer
	public void testCreatingAGolferObjectTC2() { 
		systemOut().clearHistory();
		//Create a golfer
		Golfer g = new Golfer("Tiger Woods", 1975, 12, 30 );
		g.setGender('m');
		g.setIsAPro(true);
		System.out.println(g);
		assertFuzzyEquals("Tiger Woods is a male professional golfer.\n"+
				"Tiger Woods is 41 years, 8 months and 24 days old.",
				systemOut().getHistory());
	}

	//@TestAthlete
	public void testCheckAthleteClassTC3() { //check if Athlete is an abstract class
		Class athlete = Athlete.class;
		boolean expected = true;
		boolean actual = Modifier.isAbstract(athlete.getModifiers());
		assertEquals(expected, actual);
	}

	//@TestAthlete
	public void testCheckAthleteClassTC4() { //check if Athlete has only one constructor
		Class athlete = Athlete.class;
		int expected = 1;
		int actual = athlete.getConstructors().length;
		assertEquals(expected, actual);
	}

	//@TestAthlete
	public void testCheckAthleteClassTC5() { //check if Athlete has the correct constructor signature
		Class athlete = Athlete.class;
		try{
			Constructor expected = athlete.getConstructor(String.class, int.class, int.class, int.class);
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Constructor parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC6() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("setIsAPro", new Class[]{ boolean.class});
			Class returnType = expected.getReturnType();
			if(returnType != void.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC7() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("getIsAPro", null);
			Class returnType = expected.getReturnType();
			if(returnType != boolean.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC8() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("setGender", new Class[]{ char.class});
			Class returnType = expected.getReturnType();
			if(returnType != void.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC9() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("getGender", null);
			Class returnType = expected.getReturnType();
			if(returnType != String.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC10() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("getName", null);
			Class returnType = expected.getReturnType();
			if(returnType != String.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC11() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("getLevel", null);
			Class returnType = expected.getReturnType();
			if(returnType != String.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC12() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("getAge", null);
			Class returnType = expected.getReturnType();
			if(returnType != String.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestAthlete
	public void testCheckAthleteClassTC13() { //check if Athlete has the correct method signature
		Class athlete = Athlete.class;
		try{
			Method expected = athlete.getMethod("getDob", null);
			Class returnType = expected.getReturnType();
			if(returnType != LocalDate.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}
	
	//@TestSwimmer
	public void testCheckSwimmerClassTC14() { //check if Swimmer has the correct method signature
		Class athlete = Swimmer.class;
		try{
			Method expected = athlete.getMethod("setTeamName", new Class[]{ String.class});
			Class returnType = expected.getReturnType();
			if(returnType != void.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestSwimmer
	public void testCheckSwimmerClassTC15() { //check if Swimmer has the correct method signature
		Class athlete = Swimmer.class;
		try{
			Method expected = athlete.getMethod("getTeamName", null);
			Class returnType = expected.getReturnType();
			if(returnType != String.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestGolfer
	public void testCheckGolferClassTC16() { //check if Golfer has the correct method signature
		Class athlete = Golfer.class;
		try{
			Method expected = athlete.getMethod("setHandicap", new Class[]{ int.class});
			Class returnType = expected.getReturnType();
			if(returnType != void.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}

	//@TestGolfer
	public void testCheckGolferClassTC17() { //check if Golfer has the correct method signature
		Class athlete = Golfer.class;
		try{
			Method expected = athlete.getMethod("getHandicap", null);
			Class returnType = expected.getReturnType();
			if(returnType != int.class) fail("Method return type is incorrect");
			assert(true);
		}catch(NoSuchMethodException e){
			fail("Method parameters are incorrect");
		}
	}



}
