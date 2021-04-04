package com.Saurabh.AutomationProject;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class TesterClass extends Base{
	
	@Test
	public void testMethod() throws FileNotFoundException, IOException {
		initializeBorwser();
		System.out.println("loaded successfully");
	}

}
