package models;

public class ClassroomFactory {
	public static Classroom getClassroom(int id, int minAge, int maxAge, int capacity) {
		return new Classroom(id, minAge, maxAge, capacity);
	}
}
