package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.Marshmallowoutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster cassandraMonster;
	private MarshmallowOuput myOutput;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 4;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = false;
		String name ="Happy Monster";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		cassandraMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(cassandraMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + cassandraMonster.toString());
	}
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		cassandraMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		cassandraMonster.setMonsterEyes(betterMonsterEyes);
		System.println("Type in a different number of legs for the monster");
		double betterMonsterLegs = monsterScanner.nextdouble();
	}
}
