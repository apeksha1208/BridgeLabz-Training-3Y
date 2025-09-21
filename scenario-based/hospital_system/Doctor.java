public class Doctor {
    private String name;
    private String specialization;
    private String licenseNumber;
    private int experience;

    public Doctor(String name, String specialization, String licenseNumber) {
        this.name = name;
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
        this.experience = 0;
    }

    public Doctor(String name, String specialization, String licenseNumber, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void displayInfo() {
        System.out.println(
                "Doctor: " + name + ", Specialization: " + specialization + ", Experience: " + experience + " years");
    }
}
