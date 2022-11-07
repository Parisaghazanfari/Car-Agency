package Entity;

public class CarInformation {
    private String name;
    private String licencePlate;
    private String rentalAmount;
    private int id;

    public CarInformation() {
    }

    public CarInformation(int id,String name, String licencePlate, String rentalAmount) {
        this.id = id;
        this.name = name;
        this.licencePlate = licencePlate;
        this.rentalAmount = rentalAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(String rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarInformation{" +
                "name='" + name + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", rentalAmount='" + rentalAmount + '\'' +
                ", id=" + id +
                '}';
    }
}
