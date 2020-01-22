/**
 * 
 */
package com.fairfield.chalktalk.exceptions;

/**
 * @author Ashwini Sajjan
 *
 */
public class UsernameDoesnotExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsernameDoesnotExistException(String message) {
		super(message);
	}
}
