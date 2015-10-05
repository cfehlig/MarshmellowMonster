package monster.input.contoller;

import monster.input.view.MonsterPopupDisplay;

public class MonsterPopupController
{
	private MonsterPopupDisplay myPopups;
	private MonsterThingy myTestThing;
	
	public MonsterPopupController ()
	{
		myPopups = new MonsterPopupDisplay();
	}
	
	public void start()
	{
		 String myName = myPopups.grabAnswer("Type in your name");
		 myPopups.showResponse("You typed in: " + myName);
	}


}
