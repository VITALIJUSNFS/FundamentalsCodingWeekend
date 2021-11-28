package GettersSettersClass;

public class Car {

    int yearBuild;
    String brand;
    String model;
    String type;
    String failureType;
    boolean isDamaged;



    public Car (int yearBuild, String brand, String model, String type, String failureType, boolean isDamaged) {
        this.yearBuild = yearBuild;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.failureType = failureType;
        isDamaged = true;
    }
    @Override
        public String toString() {
            return "Car{" +
                    "yearBuild=" + yearBuild +
                    ", brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", type='" + type + '\'' +
                    ", failureType='" + failureType + '\'' +
                    ", isDamaged=" + isDamaged +
                    '}';

    }
}

