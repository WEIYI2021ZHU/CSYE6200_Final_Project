package edu.neu.csye6200;

public class ClassroomFactory {
	public Classroom getClassroom(int id, int minAge, int maxAge, int capacity) {
		return new Classroom(id, minAge, maxAge, capacity);
	}
}
