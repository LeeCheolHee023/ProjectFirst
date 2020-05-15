package com.yedam.classes.abstract_class;
//추상클래스()
public abstract class Animal {
		String kind;
		public Animal(String kind) {
			this.kind =kind;
		}
		public void breathe() {
			System.out.println("숨을 쉰다.");
		}
		public abstract void sound();// 추상메소드 / 상속시에 자식클래스에 무조건 정의
}
