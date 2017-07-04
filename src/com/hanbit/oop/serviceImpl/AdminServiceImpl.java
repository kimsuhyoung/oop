package com.hanbit.oop.serviceImpl;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean; 
import com.hanbit.oop.service.AdminService; 
 
 
 public class AdminServiceImpl implements AdminService{ 
 	int count; 
 	MemberBean member; 
 	MemberBean[] members;
 	MemberBean[] membersByName;

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
		member=new MemberBean();//MemberBean member=null; 이렇게도 된다. 그전에 member값을 사용해서 
								//member에 값이 남아있을수 있음으로 미리 초기화를 시켜주는게 좋다.
		
		for(int j=0;j<count;j++){
		if(members[j].getId().equals(id)){//id.equals(members[j].getId()) 이렇게 해도 된다.
			member=members[j];
		}
	
	}
		return member;
	}
	@Override
	public MemberBean[] findByName(String name) {
		//답은 멤버빈 타입의 배열이다
		int x = 0; //변수 선언을 먼저해야한다 하지만  임시값이므로 밑에 정확한 값을 구하는 로직을 짜야한다.
		for(int i=0;i<count;i++){
			if(name.equals(members[i].getName())){
				x++;
			}
		}
		MemberBean[] memberByName= new MemberBean[x]; // 배열선언은 마지막에 배열길이를 넣어주어야 한다.
		int j=0;
		for(int i=0;i<members.length;i++){
			if(name.equals(members[i].getName())){
				memberByName[j]=members[i];
				j++;
			}
			if(x==j){
				break;
			}
	}
		return members;
	}
	@Override
	public void updatePass(MemberBean member) {
		MemberBean tempMember=new MemberBean();
		tempMember=findById(member.getId());
		tempMember.setPw(member.getPw());
 }
 }
 
