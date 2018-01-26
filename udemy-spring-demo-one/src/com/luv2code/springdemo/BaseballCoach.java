/**
 * 
 */
package com.luv2code.springdemo;

/**
 * @author BABAI
 *
 */
class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}
}
