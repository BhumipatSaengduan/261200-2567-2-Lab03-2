public class Patient {
    private long id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(long id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public int getAge(int currentYear) {
        int age = currentYear - birthYear;
        return age;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double getBMI(double height, double weight) {
        double heightMeter = height / 100;
        double bmi = weight / (heightMeter * heightMeter);
        if (height > 0 && weight > 0) {
            return bmi;
        } else {
            return 0;
        }
    }

    public void displayDetails(int currentYear) { 
        System.out.println("Patient Name: " + name);

        if (birthYear > 0) {
            System.out.println("Patient Age: " + getAge(currentYear)); 
        } else {
            System.out.println("Invalid Age");
        }

        if (height > 0) {
            System.out.println("Patient Height (cm): " + height); 
        } else {
            System.out.println("Invalid Height");
        } 

        if (weight > 0) {
            System.out.println("Patient Weight (kg): " + weight);
        } else {
            System.out.println("Invalid Weight");
        } 

        System.out.println("Patient Blood Group: " + getBloodGroup());
        System.out.println("Patient Phone Number: " + getPhoneNumber());
        
        if (getBMI(height, weight) > 0) {
            System.out.println("Patient BMI: " + getBMI(height, weight));
        } else {
            System.out.println("Invalid BMI");
        }
    }

    public static void main(String[] args) {
        int currentYear = 2024; 
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "O", "0888888888");
        patient.displayDetails(currentYear);
        System.out.println();
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0, "B", "0999999999");
        invalidPatient.displayDetails(currentYear); 
    }
}
