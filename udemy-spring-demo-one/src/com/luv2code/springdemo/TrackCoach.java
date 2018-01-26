/**
 * 
 */
package com.luv2code.springdemo;

/**
 * @author BABAI
 *
 */
class TrackCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkOut()
	 */
	@Override
	public String getDailyWorkOut() {
		
		return "Run a hard 5k";
	}

}
