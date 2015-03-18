package com.praveen.problems;

/**
 * Simple e-mail validation. Note: few scenarios not covered yet.
 * 
 * @author PRAVEEN
 *
 */
public class EmailValidation {

	/**
	 * Check for valid e-mail id.
	 * 
	 * @param id
	 * @return boolean
	 */
	private boolean isValidId(String id) {
		boolean result = false;
		if (id.length() >= 1) {
			if (Character.isLetter(id.charAt(0))) {
				if (id.contains(".")) {
					String[] tokens = id.split("\\.");
					if (tokens.length == 2) {
						for (int i = 0; i < tokens[0].length(); i++) {
							if (!(tokens[0].charAt(i) == '.'
									|| tokens[0].charAt(i) == '_'
									|| tokens[0].charAt(i) == '-' || Character
										.isLetterOrDigit(tokens[0].charAt(i)))) {
								return false;
							}
						}
						for (int i = 0; i < tokens[1].length(); i++) {
							if (!(tokens[0].charAt(i) == '.'
									|| tokens[0].charAt(i) == '_'
									|| tokens[0].charAt(i) == '-' || Character
										.isLetterOrDigit(tokens[0].charAt(i)))) {
								return false;
							}
						}
						return true;
					}
				} else {
					return true;
				}
			}
		}
		return result;
	}

	/**
	 * Check for valid domain name.
	 * 
	 * @param domain
	 * @return boolean
	 */
	private boolean isValidDomain(String domain) {
		if (domain.length() >= 3) {
			String[] tokens = domain.split("\\.");
			if (Character.isLetter(tokens[0].charAt(0)) && tokens.length >= 2
					&& tokens[0].length() >= 0 && tokens[1].length() >= 0)
				return true;
		}
		return false;
	}

	/**
	 * Check for valid e-mail id.
	 * 
	 * @param email
	 * @return boolean
	 */
	public boolean isValidEmaiId(String email) {
		if (email == null || !email.contains("@") || email.length() < 5)
			return false;
		String[] tokens = email.split("@");
		String id = tokens[0];
		String domain = tokens[1];
		// System.out.println(isValidId(id));
		// System.out.println(isValidDomain(domain));
		return isValidId(id) && isValidDomain(domain);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EmailValidation e = new EmailValidation();
		String[] emailIds = new String[] { "john@gmail.com",
				"john.m@gmail.com", "john123@gmail.com", "john_m@gmail.com",
				"john_m123@gmail.com", "john_m123@one97.com",
				"john_m123@97.com", "john_.m123@gmail.com", "abcd", "abcd@abc" };
		for (String email : emailIds) {
			System.out.println(email + ":" + e.isValidEmaiId(email));
		}

	}
}
