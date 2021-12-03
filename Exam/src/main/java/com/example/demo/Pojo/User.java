package com.example.demo.Pojo;

public class User {
	private int id;
	private static int idCounter = 0;
	private String name, price, description;

	public User(String name, String price, String description) {
		super();
		User.idCounter = User.idCounter + 1;
		this.id = User.idCounter;
		this.name = name;
		this.price = price;
		this.description = description;
		System.out.println("Constructor-1-"+this.id);
	}
	
	public User() {
		super();
	}
	
	public User(int id,String name, String price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		System.out.println("Constructor-2");
	}

	
	

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		User.idCounter = idCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
	

	
	
	
}