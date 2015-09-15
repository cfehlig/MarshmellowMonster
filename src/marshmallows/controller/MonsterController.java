package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallow.view.Marshmalloutput;

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
		
		myOutput = new MarshmallowOutput();
		cassandraMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(cassandraMonster.toString());
		ask questions();
		myOUtput.displayMonsterInfo("New MOnster Info" + casdraMonster.toString());
	}
	private void askQuestions()
	{
		
	}
}
