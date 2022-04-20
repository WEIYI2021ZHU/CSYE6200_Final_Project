package edu.neu.csye6200;

public class Vaccine {
	private int id;
	private String name;
	private int maxAge;
	private int minAge;
	private int dose;
	
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccine(int id, String name, int minAge, int maxAge, int dose) {
		super();
		this.id = id;
		this.name = name;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.dose = dose;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vaccine [id: ").append(getId());
		sb.append(", Vaccine Name: ").append(getName());
		sb.append(", Minimum Required Age: ").append(getMinAge());
		sb.append(", Maximum Required Age: ").append(getMaxAge());
		sb.append(", Required dose: ").append(getDose()).append("]");
		return sb.toString();
	}
	
	

}
