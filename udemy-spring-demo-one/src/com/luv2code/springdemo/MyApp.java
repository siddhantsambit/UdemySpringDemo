/**
 * 
 */
package com.luv2code.springdemo;

/**
 * @author BABAI
 *
 */
class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.print(theCoach.getDailyWorkOut());

	}

}
