package edu.neu.csye6200;

public class VaccineFactory {
	public Vaccine getVaccine(int id, String name, int minAge, int maxAge, int dose) {
		return new Vaccine(id, name, minAge, maxAge, dose);
	}
}
