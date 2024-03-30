package web.model;

public class Car {
    private int id;
    private String owner;
    private String model;
    private String insuranceNum;


    public Car(int id, String owner, String model, String insuranceNum) {
        this.id = id;
        this.owner = owner;
        this.model = model;
        this.insuranceNum = insuranceNum;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", model='" + model + '\'' +
                ", insuranceNum='" + insuranceNum + '\'' +
                '}';
    }
}
