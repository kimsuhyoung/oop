package com.hanbit.oop.serviceImpl;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean; 
import com.hanbit.oop.service.AdminService; 
 
 
 public class AdminServiceImpl implements AdminService{ 
 	int count; 
 	MemberBean member; 
 	MemberBean[] members;

 	public AdminServiceImpl(int sCount) { //외부에서 값을 받아와서 하는 정적 배열
 		members=new MemberBean[sCount]; 
 	} 
 	@Override 
 	public void addMember(MemberBean member) { 
 		setCount(); 
 		members[getCount()-1]=member; 
 	}
 	@Override 
 	public String getMembers() { 
 		String MemberList=""; 
 		for(int i=0;i<count;i++){ 
 			MemberList+="id : "+members[i].getId()+"/ pw : "+members[i].getPw()+"\n"; 
 		} 
 		System.out.println(""); 
 		return MemberList; 
 	}
 	@Override 
 	public int countMembers() { 
 		return  count; //count ; //members.length 으로 리턴하면 배열의 총길이가 나온다 그러므로 count 로 해야한다. 
 	} 
 	public void setCount(){ 
 		count++; 
 	} 
 	public int getCount(){ 
 		return count; 
 	}
	@Override
	public MemberBean findById(String id) {
		MemberBean member=null;
		for(int j=0;j<count;j++){
		if(members[j].getId().equals(id)){
			member=members[j];
		}
	}
		return member;
	}
 }
	 
 
