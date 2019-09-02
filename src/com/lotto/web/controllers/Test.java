package com.lotto.web.controllers;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random ran = new Random();
		String lotto ="";
		for(int i=0; i<6; i++) {
			lotto = String.valueOf(ran.nextInt(45)+1);
			String.format("%s" ,lotto);
		}
	}
}
