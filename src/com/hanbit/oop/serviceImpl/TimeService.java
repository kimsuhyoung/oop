package com.hanbit.oop.serviceImpl;

public class TimeService {
	public int[] timeexe(int num) {
			int[] time =new int[3];
		time[0] = num / 3600;
		time[1] = num % 3600 / 60;
		time[2] = num % 3600 % 60;
		return time;
	}
}
