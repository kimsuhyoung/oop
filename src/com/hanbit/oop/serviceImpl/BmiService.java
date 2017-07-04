package com.hanbit.oop.serviceImpl;

public class BmiService {

	public String bmiexe(double high, double weigh) {
		double a = weigh / (high * high);
		String bmi = "";
		if (a <= 18.5) {
			bmi = "저체중";
		} else if (a <= 24.9) {
			bmi = "정상";
		} else if (a <= 29.9) {
			bmi = "과체중";
		} else {
			bmi = "비만";
		}
		String result = a +","+ bmi;
		return result;
	}
}
