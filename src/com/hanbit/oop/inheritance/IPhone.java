package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone{
	
	public final static String KIND="스마트폰";
	protected String data;
	// KIND 는 스마트폰이라고 오버라이딩 ..
	public void setData(String data){
		this.data=data; //이 데이터 값으로 무브와 데이터 두가지의 값을 toString 결과값에 출력한다.
		setPortable(true); // Cell폰에서 저장된 블린형 값을 아이폰에서 참값으로 선언한 구문
		//CellPhone의 Portable을 protected로 바꿔주고 Iphone의 setPortable을 portable=true로 바꾸어 주어도 된다.
	}
	public String getData(){
		return data;
	}
	
	public final static String BRAND = "아이폰";
	
	@Override
	public String toString(){
	//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010번호로 
	//아이폰을 사용해서 안녕이라고 문자를 전송했다.
	return String.format("%s 이기때문에 %s 상태로 %s 에개  %s 번호로 %s를 사용해서 %s 문자를 전송했다",
				KIND,
				move,
				name, 
				phoneNo,
				BRAND,
				data);
	
	}
}
