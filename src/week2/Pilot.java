package week2;

public class Pilot {
	private String name;
	private int age;
	private int experience;
	
	public Pilot( String name, int age, int experience){
		setName(name);
		setAge(age);
		setExperience(experience);
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Pilot [name=" + name + ", age=" + age + ", experience=" + experience + "]";
	}
	

}
