package it.marco.camel.domain;

import java.io.Serializable;

public class Item implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int value;
	
	public Item() {
		super();
	}
	
	public Item(int value) {
		this();
		setValue(value);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

}
