package Ex_03;

import java.util.Scanner;

public class MyArrayList {
	private int size;
	private String addElement;
	
	public String getAddElement() {
		return addElement;
	}

	public void setAddElement(String addElement) {
		this.addElement = addElement;
	}

	public MyArrayList(String addElement) {
		super();
		this.addElement = addElement;
	}

	public MyArrayList(int size) {
		super();
		this.size = size;
	}

	public String [] database = new String [size];

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	Scanner sc = new Scanner(System.in);
	public void addListElement() {
		for (int i = 0; i < size ; i++) {
			
			getAddElement();
			
		}
	}
	
	public String[] getDatabase() {
		return database;
	}

	public void setDatabase(String[] database) {
		this.database = database;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void removeListElement() {
		
	}
	
	

}
