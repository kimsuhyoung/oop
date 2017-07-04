package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.serviceImpl.GradeService;

import javax.swing.*;

public class GradeController {
	
	public static void main(String[] args) {
		GradeService grades = new GradeService();
		GradeBean gradeB = new GradeBean();
		
		System.out.println("프로그램 시작");

		while (true) {

			switch (JOptionPane.showInputDialog("0.stop 1. GradeReport")) {

			case "0":
				System.out.println("프로그램 종료");
				return;
			case "1": 
				 				 
				//input 
				
				gradeB.setName(JOptionPane.showInputDialog("이름을 입력"));
				gradeB.setMajor(JOptionPane.showInputDialog("전공을 입력"));			
				gradeB.setKor(Integer.parseInt(JOptionPane.showInputDialog("Kor")));			
				gradeB.setEng(Integer.parseInt(JOptionPane.showInputDialog("Eng")));				
				gradeB.setMath(Integer.parseInt(JOptionPane.showInputDialog("Math")));				 				 
				//operation 				 				 
				//gradeB.toString(JOptionPane.showMessageDialog(null,gradeB.toString());
				
			}
		}
	}
}
