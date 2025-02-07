package Builder;

public class Employee {

    private String name;
    private String company;
    private boolean hasCar;//optional
    private boolean hasBike;//optional

    private Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.company = employeeBuilder.company;
        this.hasCar = employeeBuilder.hasCar;
        this.hasBike = employeeBuilder.hasBike;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hasCar=" + hasCar +
                ", hasBike=" + hasBike +
                '}';
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar;//optional
        private boolean hasBike;//optional

        //constructor for required fields
        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        //setter methods for optional fields
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        //Build the Employee object
        public Employee build() {
            return new Employee(this);
        }
    }
}

class TestBuilder {
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
       // Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
        Employee.EmployeeBuilder employeeBuilder=new Employee.EmployeeBuilder("pratik","abc");
        employeeBuilder.setHasBike(true);
        employeeBuilder.setHasCar(false);
        Employee employee=employeeBuilder.build();
        System.out.println(employee);
    }
}
