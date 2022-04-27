package models;

public class VaccineFactory {
	public static Vaccine getVaccine(int id, String name, int minAge, int maxAge, int dose) {
		return new Vaccine(id, name, minAge, maxAge, dose);
	}
}
