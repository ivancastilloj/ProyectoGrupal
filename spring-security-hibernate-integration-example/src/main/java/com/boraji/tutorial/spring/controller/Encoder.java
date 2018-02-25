package com.boraji.tutorial.spring.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String encoded=new BCryptPasswordEncoder().encode("admin@123");
		System.out.println(encoded);
	}

}
