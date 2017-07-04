package com.hanbit.oop.inheritance;

public class CellPhone extends Phone {
	private boolean portable;
	protected String move;
	public final static String KIND="휴대폰";//final= 상수를 만들어 주는것 static= 한 개만 만들겠다는 것
							//인스턴스 변수를 여러개를 선언해도 KIND라는 개체는 static으로 한개만 만들겠다고 했기 때문에 
							//KIND를 새로 만들지 않고 여러개의 인스턴스변수에서 공유를 한다.
	public void setMove(String move){
		this.move=move;
	}
	public String getMove(){
		return move;
	}
	public void setPortable(boolean portable){//불린형 타입이 되면 밑에처럼 코딩해야한다.
		if(portable){
			this.setMove("이동가능"); // 참값이면 무브에 이동가능 이라는 값을 저장한다.
			
		}else{
			this.setMove("이동 불가능");// 참값이 아니면 무브에 이동불가능 이라는 값을 저장한다.
		}
		this.portable=portable; //포터블값에 블린형 포터블 값이 저장되게 하는 구문
	}
	public boolean isPortable(){
		return portable;
	}
	@Override//부모와 똑같은 이름이 있으면 그 내용을 자식이 바꿔쓸때 쓴다. (부모의 기능을 죽이는 구문)
	public String toString(){
		return String.format("%s 이기때문에 %s 상태로 %s 에개  %s 번호로 를 사용해서 %s", 
				KIND,
				move,
				name, 
				phoneNo, 
				brand,  
				call);
	//super는 부모객체에 있는걸 갖다 쓰는것이기 때문에 생략을 못한다.
	//protected를 걸어줬을때는 super를 생략할 수 있다.
	//private일 떄는 super.get?? 이런식으로 코딩을 해주어야 한다.
	}
}




