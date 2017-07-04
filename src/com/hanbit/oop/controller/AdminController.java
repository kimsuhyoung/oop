package com.hanbit.oop.controller;

import java.util.jar.JarOutputStream;

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
 			switch(JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수보기 3.회원목록보기 4.findbyid 5.findbyname 6.update")){ 
 			case "0": 
 				return; 
 			case "1":
 				member=new MemberBean();//와일룹 안으로 멤버빈을 끌어오게 되면 주소값을 서로 공유하게 되므로 오버라이딩이 되지 않는다.
 												// 지금 같은 모양은 call by value와 같은 모양이다.   
 												// call by value (값에 의한 전달)
 												 // call by refernce (주소에 의한 전달)
 				
 				String[] arr= JOptionPane.showInputDialog("NAME/ID/PASS/SSN").split("/");
 				member.setName(arr[0]); 
 				member.setId(arr[1]); 
 				member.setPw(arr[2]); 
 				member.setSsn(arr[3]); 
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
 				JOptionPane.showConfirmDialog(null, member=service.
 				findById(JOptionPane.showInputDialog("조회하려는 아이디를 입력해주세요.").toString()));
 				break;	
 				
 			case "5" :
 				String name=JOptionPane.showInputDialog("조회하려는 이름을 입력해주세요");
 				MemberBean[] members=service.findByName(name);
 				String result="";
 				if(members.length==0){
 					result="조회하는 이름이 없습니다.";
 				}else{
 					for(int i=0;i<members.length;i++){
 	 					result+=members[i].toString()+"\n";
 	 				}
 				}
 					JOptionPane.showMessageDialog(null, result);
 				
 			case "6" :
 				MemberBean param=new MemberBean();
 				String id=JOptionPane.showInputDialog("비밀번호를 바꿀 아이디를 입력하세요");
 				String pw=JOptionPane.showInputDialog("비밀번호입력");
 				param.setId(id); 
 				param.setPw(pw);
 				service.updatePass(param);
 				JOptionPane.showMessageDialog(null, "비밀번호 변경 성공");
 			}
 		} 
 	} 
 } 
