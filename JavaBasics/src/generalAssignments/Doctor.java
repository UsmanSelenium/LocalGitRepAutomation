package generalAssignments;

public class Doctor {
	
	String specilization;
	String hospitalName;
	long charges;
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public long getCharges() {
		return charges;
	}

	public void setCharges(long charges) {
		this.charges = charges;
	}

	public Doctor(String name,String specilization,	String hospitalName, long charges) {
		this.name = name;
		this.specilization = specilization;
		this.hospitalName = hospitalName;
		this.charges = charges;
	}
	


}
