package com.hanbit.oop.domain;

public class MemberBean { 
 	String id,pw,ssn,name,memberByName; 
 	public void setId(String id){ 
 		this.id=id; 
 	} 
	public String getId(){ 
		return id; 
 	} 
 	public void setPw(String pw){ 
 		this.pw=pw; 
 	} 
 	public String getPw(){ 
 		return pw; 
 	} 
 	public void setSsn(String ssn){ 
 		this.ssn=ssn; 
 	} 
 	public String getSsn(){ 
 		return ssn; 
 	} 
 	public void setName(String name){ 
 		this.name=name; 
 	} 
 	public String getName(){ 
 		return name; 
 	} 
 	public String toString(){ 
 		return "회원[id="+id+",pw="+pw+",ssn=" + ssn + ",name="+name+"]"; 
 	}
 	public void setMemberByName(String memberByName){
 		this.memberByName=memberByName;
 	}
 	public String getMemberByName(){
 		return memberByName;
 	}
 	} 
 
