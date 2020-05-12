package com.yedam.classes.inherit;

public class DmbExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("DMB폰", "흰색", 10);
		System.out.println(dcp.model + ", " + dcp.color); //  부모 클래스의 필드
		System.out.println(dcp.channel); // 자기클래스의 필드
		// 부모 메소드
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoices("안녕하세요");
		dcp.receiveVoices("반갑습니다");
		
		// 자기 메소드
		dcp.turnOnDmb();
		dcp.changeChannel(12);
		dcp.turnOffDmb();
		dcp.powerOff();
	}

}
