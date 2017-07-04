package com.hanbit.oop.inheritance;

public class Phone {
	//private String name, phoneNo, brand, kind, call; // 상속할때 접근제한을 풀려면 private을 protected로 바꾼다.
	protected String name, phoneNo, brand, kind, call;
	public final static String KIND="집전화";
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return  name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo(){
		return  phoneNo;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return  brand;
	}
	
	public void setCall(String call){
		this.call=call;
	}
	public String getCall(){
		return  call;
	}
	public String toString(){
		return String.format("%s에게 %s번호로 %s %s 를 사용해서 %s이라고 통화했다", name, phoneNo, brand, KIND, call);
				//"길동이에게 02-123-4567 번호로" + "삼성집전화기를 사용해서 안녕이라고 통화했다.";
	}
}

	
	
	
	