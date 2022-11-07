package Entity;

public class CustomerInformation {
    private String name;
    private String lastName;
    private String phoneNumber;
    private String date;
    private String hours;

    public CustomerInformation() {
    }

    public CustomerInformation(String name, String lastName, String phoneNumber, String date, String hours) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "CustomerInformation{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date='" + date + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }
}
