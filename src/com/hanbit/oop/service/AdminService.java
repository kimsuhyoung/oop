package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean; 
 
 
 public interface AdminService { 
 	public void addMember(MemberBean member); 
 	public String getMembers(); 
 	public int countMembers(); 
 	public MemberBean findById(String id);
 	public MemberBean[] findByName(String name);//리턴타입이 복수이면 배열이다.
 	public void updatePass(MemberBean member);
 	
 
 } 
 
