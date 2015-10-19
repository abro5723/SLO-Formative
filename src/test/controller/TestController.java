package test.controller;

import test.view.TestDisplay;

public class TestController 
{
	private TestDisplay myTest;
	
	public TestController()
	{
		myTest = new TestDisplay();
	}
	
	public void start()
	{
		myTest.showResponse("My name is Kalamazoo");
		int myEyes;
		myEyes = 21;
		
		if (myEyes == 21)
		{
			myTest.showResponse("I have " + myEyes + " eyes.");
		}
		else
		{
			myTest.showResponse("I have eighty-three toes.");
		}
		
		double myTeeth;
		myTeeth = -16.2;
		if (myTeeth == -16.2)
		{
			myTest.showResponse("I have " + myTeeth + " teeth.");
		}
	}

}
