class Employee{
    private int id;
    private String name;
    private int age;
    private float salary;
    private Number mobile;
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Number getMobile() {
        return mobile;
    }

    public void setMobile(Number mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}



public class EncapsulationExample {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(901);
        e.setName("Nerih");
        e.setAge(23);
        e.setSalary(35000);
        e.setMobile(987654321);
        e.setEmail("abcd123@xyz.com");

        System.out.println("Employee id: "+e.getId()+" Name: "+e.getName()+" Age: "+e.getAge()+" Salary: "+e.getSalary()+" Mobile: "+e.getMobile()+" Email: "+e.getEmail());
        
    }
}
