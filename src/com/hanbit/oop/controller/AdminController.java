package com.hanbit.oop.controller;

import javax.swing.JOptionPane; 
 

 import com.hanbit.oop.domain.MemberBean; 
 import com.hanbit.oop.service.AdminService; 
 import com.hanbit.oop.serviceImpl.AdminServiceImpl; 
 

 public class AdminController { 
	public static void main(String[] args) { 
 		String sCount=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요"); 
 		AdminService service=new AdminServiceImpl(Integer.parseInt(sCount)); 
 		MemberBean member=null; //멤버에 널값을 할당한다.
 		while(true){ 
 			switch(JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수보기 3.회원목록보기 4.findbyid")){ 
 			case "0": 
 				return; 
 			case "1":
 				member=new MemberBean();//와일룹 안으로 멤버빈을 끌어오게 되면 주소값을 서로 공유하게 되므로 오버라이딩이 되지 않는다.
 												// 지금 같은 모양은 call by value와 같은 모양이다.   
 												// call by value (값에 의한 전달)
 												 // call by refernce (주소에 의한 전달)
 				member.setId(JOptionPane.showInputDialog("ID를 입력하세요")); 
 				member.setName(JOptionPane.showInputDialog("이름을 입력하세요")); 
 				member.setPw(JOptionPane.showInputDialog("비밀번호를 입력하세요")); 
 				member.setSsn(JOptionPane.showInputDialog("주민번호를 입력하세요")); 
 				service.addMember(member); // 세터의 개념
 				JOptionPane.showMessageDialog(null,"회원가입성공 !"); 
 				break; 
 			case "2": 
 				JOptionPane.showConfirmDialog(null,service.countMembers()+"명"); 
 				break; 
 			case "3": 
 				JOptionPane.showConfirmDialog(null, service.getMembers());
 				System.out.println();
 				break;
 				
 			case "4" :
 				JOptionPane.showConfirmDialog(null, service.findById(JOptionPane.showInputDialog("조회하려는 아이디를 입력해주세요.")).toString());
 				break;
 			} 
 		} 
 	} 
 } 
