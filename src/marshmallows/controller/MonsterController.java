package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmellow.view.Marshmalloutput;

public class MonsterController
{
	private MarshmallowMonster cassandraMonster;
	private MarshmellowOuput myOutput;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 4;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = false;
		String name ="Happy Monster";
		
		myOutput = new MarshmellowOutput();
		cassandraMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(cassandraMonster.toString());
	}
	
}
