package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class ParentEx {
	public static void main(String[] args) {
		Parent parent = new Parent("","","");
		parent.getLastName();
		parent.getFirstName();
		parent.getTelNumber();
	}
	public class Child  extends Parent {
		Child(String lastName, String firstName, String telNumber){
			super(lastName,firstName, telNumber);
		}
	}
}
