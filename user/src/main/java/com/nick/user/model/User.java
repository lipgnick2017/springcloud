package com.nick.user.model;

public class User {
	private String name;
	private int age;
	private City city;
	private int score;
	
	public static User  c(String port){
		User u=new User();
		u.setName("Nick -"+port);
		u.setAge(25);
		u.setScore(90);
		City c=new City();
		c.setProvince("Jiang su");
		c.setCity("nan jing");
		u.setCity(c);
		return u;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
