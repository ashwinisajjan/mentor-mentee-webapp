/**
 * 
 */
package com.fairfield.chalktalk.utility;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author Ashwini Sajjan
 *
 */
public final class ChacktalkUtil {
	
	private static MultiValueMap<String, String> headersForGetMethod;
	
	private static MultiValueMap<String, String> headersForPostMethod;
	
	private ChacktalkUtil() {}
	
	static {
		headersForGetMethod = new LinkedMultiValueMap<String, String>();
		headersForGetMethod.add("Access-Control-Allow-Origin", "*");
		headersForGetMethod.add("Access-Control-Allow-Methods", "POST, PUT, GET, DELETE, OPTIONS");
		headersForGetMethod.add("Access-Control-Allow-Headers", "X-Requested-With");
		headersForGetMethod.add("Access-Control-Max-Age", "3600");
		
		headersForPostMethod = new LinkedMultiValueMap<String, String>();
		headersForPostMethod.add("Access-Control-Allow-Origin", "*");
		headersForPostMethod.add("Access-Control-Allow-Methods", "POST, PUT, GET, DELETE, OPTIONS");
		headersForPostMethod.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, Accept");
		headersForPostMethod.add("Access-Control-Max-Age", "3600");
	}
	
	/**
	   * Ensures that an object reference passed as a parameter to the calling method is not null.
	   *
	   * @param reference an object reference
	   * @return the non-null reference that was validated
	   * @throws NullPointerException if {@code reference} is null
	   */
	public static <T> T checkNotNull(T reference) {
	    if (reference == null) {
	      throw new NullPointerException();
	    }
	    return reference;
	}
	
 /**
   * Ensures the truth of an expression involving the state of the calling instance, but not
   * involving any parameters to the calling method.
   *
   * @param expression a boolean expression
   * @throws IllegalStateException if {@code expression} is false
   */
	public static void checkState(boolean expression) {
	    if (!expression) {
	      throw new IllegalStateException();
	    }
	}
	
	/**
	 * 
	 * @return
	 */
	public static MultiValueMap<String, String> getHeadersForGetAPI() {
		return headersForGetMethod;
	}
	
	/**
	 * 
	 * @return
	 */
	public static MultiValueMap<String, String> getHeadersForPostAPI() {
		return headersForPostMethod;
	}

}
