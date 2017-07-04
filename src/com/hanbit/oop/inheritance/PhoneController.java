package com.hanbit.oop.inheritance;

import javax.swing.JOptionPane;
import com.hanbit.oop.inheritance.Phone;
import com.hanbit.oop.inheritance.CellPhone;
public class PhoneController {
	
	public static void main(String[] args){
		Phone ph = new Phone();
		CellPhone nokia = new CellPhone();
		IPhone iphone= new IPhone();
		AndroidPhone android= new AndroidPhone();
		while(true)
						
			switch(JOptionPane.showInputDialog("0.전화 종료 1.집전화 2.휴대전화 3.아이폰 4.안드로이드폰")){
				
			case"0" : 
				JOptionPane.showMessageDialog(null, "전화종료");
				return ;
			case"1" : 
				ph.setName(JOptionPane.showInputDialog("Name"));
				ph.setPhoneNo(JOptionPane.showInputDialog("PhoneNo"));
				ph.setBrand(JOptionPane.showInputDialog("Brand"));
				ph.setCall(JOptionPane.showInputDialog("Call"));
				JOptionPane.showMessageDialog(null,ph.toString());
				break;
			
			case "2" : 
				nokia.setName(JOptionPane.showInputDialog("Name"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("nokiaoneNo"));
				nokia.setBrand(JOptionPane.showInputDialog("Brand"));
				nokia.setCall(JOptionPane.showInputDialog("Call"));
				nokia.setPortable(true);//cellPhone에 블린형 타입을 주었기 때문에 참값을 주어야 한다.
				JOptionPane.showMessageDialog(null,nokia.toString());
				
				break;
				
			case "3" : 
				iphone.setName(JOptionPane.showInputDialog("Name"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("phone Number"));
				iphone.setData(JOptionPane.showInputDialog("Call message"));
				JOptionPane.showMessageDialog(null,iphone.toString());
				break;
			
			case "4" :
				android.setName(JOptionPane.showInputDialog("Name"));
				android.setPhoneNo(JOptionPane.showInputDialog("phone Number"));
				android.setSize(JOptionPane.showInputDialog("size"));
				android.setData(JOptionPane.showInputDialog("Call message"));
				android.setAppl(JOptionPane.showInputDialog("appl"));	
				JOptionPane.showMessageDialog(null,android.toString());
				break;
			
			}
	}
}