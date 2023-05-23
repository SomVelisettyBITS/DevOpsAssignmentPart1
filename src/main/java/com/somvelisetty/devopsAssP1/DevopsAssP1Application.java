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

	boolean F = false;
	void test_divide() {
		int z = 0;
		if (F) {
			// ..
			z = 3;

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
