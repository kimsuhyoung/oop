package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.GradeBean;

public class GradeService { 
 	//field 
	//GradeBean gradeB new GradeBea(); 필드안에는 이런식으로 선언을 하면 안되기 때문에  
 	public int calctoltal(GradeBean gradeB) { // 이런식으로 파라미터존 안에 직접 선언한다.
 		return gradeB.getKor()+gradeB.getEng()+gradeB.getMath(); 
 	} 
 	 
 	public int calcAvg(GradeBean gradeB) { // 이런식으로 파라미터존 안에 직접 선언한다.
 		return (gradeB.getKor()+gradeB.getEng()+gradeB.getMath()) / 3; 
 	} 
 	 
 	public String getGrade(int clacAvg) { 
 		//method area 
 		String grade = "";
 		switch (clacAvg/10) { 
 		case 9 : 
 		case 10 : 
 			grade = "A"; 
 			break; 
 		case 8 : 
 			grade = "B"; 
 			break; 
 		case 7 : 
 			grade = "C"; 
 			break; 
 		case 6 : 
 			grade = "D"; 
 			break; 
 		case 5 : 
 			grade = "E"; 
 			break; 
 		case 4 : 
 			grade = "낙제 이새끼야"; 
 		case 3 : 
 			grade = "낙제 이새끼야"; 
 		case 2 : 
 			grade = "낙제 이새끼야"; 
 		case 1 : 
 			grade = "낙제 이새끼야"; 
 		} 
 		return grade;
 	} 
 		
 } 
