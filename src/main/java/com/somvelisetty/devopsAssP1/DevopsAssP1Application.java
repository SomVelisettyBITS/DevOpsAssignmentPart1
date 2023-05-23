package com.somvelisetty.devopsAssP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

@SpringBootApplication
public class DevopsAssP1Application {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAssP1Application.class, args);
	}

	boolean T = false;
	void test_divide() {

		String speech = "Now is the time for all good people to come to the aid of their country.";

		String substr1 = speech.substring(-1, speech.length());  // Noncompliant; start and end values both bad
		String substr2 = speech.substring(speech.length(), 0); // Noncompliant, start value must be < end value
		char ch = speech.charAt(speech.length());  // Noncompliant

		int z = 0;
		if (T) {
			// ..
			z = 0;

			byte[] salt = "notrandom".getBytes();

			PBEParameterSpec cipherSpec = new PBEParameterSpec(salt, 10000); // Noncompliant, predictable salt
			char[] chars = {'a', 'b', 'c'};
			PBEKeySpec spec = new PBEKeySpec(chars, salt, 10000, 256); // Noncompliant, predictable salt

		} else {
			// ..
		}
		z = 1 / z; // Noncompliant, possible division by zero
	}

}
