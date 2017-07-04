package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone{
	public final static String BRAND="갤럭시노트";
	
	// BRAND 갤럭시노트
	// data 를 오버라이딩 해서 카톡메세지라고 출력시킴
	private String size, appl;
	public void setSize(String size){
		this.size = size;
		setPortable(true);
	}
	public String getSize(){
		return size;
	} 
	public void setAppl(String appl){
		this.appl=appl;
	}
	public String getAppl(){
		return appl;
	}	
	
	@Override
	public String toString(){
	//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010번호로 
	//갤럭시노트 6인치를 사용해서 안녕이라고 카톡메세지를 전송했다.
	return String.format("%s 이기때문에 %s 상태로 %s 에개  %s 번호로 %s %s를 사용해서 %s이라는 %s 메세지를 전송했다",
				KIND,
				move,
				name, 
				phoneNo,
				BRAND,
				size,
				data,
				appl);
	
	}
	
	}


