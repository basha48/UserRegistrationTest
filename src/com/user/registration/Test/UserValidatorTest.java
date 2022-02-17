package com.user.registration.Test;

import org.junit.Assert;
import org.junit.Test;

import com.user.regestration.UserRegistration;

public class UserValidatorTest {
	
	@Test
	public void CheckProperFirstName() {
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateFirstName("Vamshi");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void CheckProperEmail() {
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateEmailAdress("vamshi@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void CheckProperLastName() {
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateLastName("Reddy");
		Assert.assertTrue(result);
	}
	
	@Test
	public void CheckProperPhoneNo() {
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validatePhoneNo("91 9848906054");
		Assert.assertTrue(result);
	}
	
	@Test
	public void CheckProperPassword() {
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validatePassword("Vamshi1@reddydds");
		Assert.assertTrue(result);
	}
}
