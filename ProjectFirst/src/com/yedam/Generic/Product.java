package com.yedam.Generic;

public class Product<T,M> {
	T kind;
	M model;
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public T getKine() {
		return this.kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
	public M getModel() {
		return this.model;
	}

}
