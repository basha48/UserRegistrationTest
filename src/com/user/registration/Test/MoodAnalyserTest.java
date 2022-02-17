package com.user.registration.Test;

import org.hamcrest.CoreMatchers;

import com.user.regestration.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
		@Test
	    public void testMoodAnalyse(){
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	     String mood =  moodAnalyser.analyseMood("This is a sad message");
	        Assert.assertTrue(mood, CoreMatchers.is("SAD") != null);
	    }

}
