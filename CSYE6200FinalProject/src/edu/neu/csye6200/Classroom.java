package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private int id;
	private int minAge;
	private int maxAge;
	private int capacity;
//	private int size;
	private List<Teacher> group;
	
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(int id, int minAge, int maxAge, int capacity) {
		super();
		this.id = id;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.capacity = capacity;
		group = new ArrayList<Teacher>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return group.size();
	}

	public boolean isFull() {
		return group.size() == getCapacity();
	}
	public List<Teacher> getGroup() {
		return group;
	}

	public void setGroup(Teacher teacher) {
		if(isFull()) {
			System.out.println("This classroom is full.");
		} else {
			if(!group.contains(teacher) && teacher.getMinStuAge() == getMinAge() && teacher.getMaxStuAge() == getMaxAge()) {
				group.add(teacher);
			} else {
				System.out.println("Please find the classroom suit your age.");
			}
		}
	}
	
	public String getAllTeacher() {
		StringBuilder sb = new StringBuilder();
		for(Teacher t : getGroup()) {
			sb.append("ID: ").append(t.getId()).append(" Teacher Name: ").append(t.getName()).append("\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Classroom [Minimum Age: ").append(getMinAge());
		sb.append(", Maximum Age: ").append(getMaxAge());
		sb.append(", Capacity: ").append(getCapacity());
		sb.append(", Size: ").append(getSize()).append(" ");
		sb.append(getAllTeacher());
		
		return sb.toString();
	}
	
}
