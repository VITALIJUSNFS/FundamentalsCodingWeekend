package GettersSettersClass;

public class Mechanic {
    String mechanicIdentification;
    String mechanicName;
    String mechanicSurname;
    String mechanicResponsibleArea;



    public Mechanic (String mechanicIdentification, String mechanicName, String mechanicSurname,
                     String mechanicResponsibleArea) {
        this.mechanicIdentification = mechanicIdentification;
        this.mechanicName = mechanicName;
        this.mechanicSurname = mechanicSurname;
        this.mechanicResponsibleArea = mechanicResponsibleArea;
    }

        @Override
        public String toString() {
            return "Mechanic{" +
                    "mechanicIdentification='" + mechanicIdentification + '\'' +
                    ", mechanicName='" + mechanicName + '\'' +
                    ", mechanicSurname='" + mechanicSurname + '\'' +
                    ", mechanicResponsibleArea='" + mechanicResponsibleArea + '\'' +
                    '}';
    }
}
