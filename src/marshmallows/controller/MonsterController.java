package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster cassandraMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 2 ;
		double legs = 4 ;
		double hair = 3 ;
		int noses = 2 ;
		boolean hasBellyButton = false;
		String name ="Happy Monster";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		cassandraMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()

	{
		myOutput.displayMonsterInfo(cassandraMonster.toString());
		myOutput.displayMonsterGUI(cassandraMonster.toString());
		this.makeUserMonster();
		myOutput.displayMonsterInfo("New Monster Info" + userMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		cassandraMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		cassandraMonster.setMonsterEyes(betterMonsterEyes);
		System.out.println("Type in a different number of legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		cassandraMonster.setMonsterLegs(betterMonsterLegs);
		System.out.println("Type in a different number of hair for your monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		cassandraMonster.setMonsterHair(betterMonsterHair);
		System.out.println("Type in a different number of noses for your monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		cassandraMonster.setMonsterNoses(betterMonsterNoses);
		System.out.println("Type in a different number of bellybuttons for your monster");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		
		cassandraMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}
		
	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
		//Step one: Get variables
		String userName;
		int userEyes;
		int userNoses;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		//Step two: Define variables by using the Scanner to get user input.
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes your monster has");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses you monster has");
		userNoses = monsterScanner.nextInt();
		System.out.println("How many hairs does you monster have? Type in a deciaml or floating point");
		userHair = monsterScanner.nextDouble();
		System.out.println("Type in the number of legs your monster has");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does yout monster have a bellybutton? Type true or false");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster- use the Constructor! Remember that order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userHair, userLegs, userBellyButton);
		
	}
}
