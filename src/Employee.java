public class Employee {
    private final int id;
    private int department;
    private String fullName;
    protected int salary;
    private static int counter;

    //constructor
    public Employee(String fullName, int department, int salary){
        this.id = ++counter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    //Здесь расположены Get'еры
    public int getId(){
        return this.id;
    }
    public int getDepartment (){
        return this.department;
    }
    public String getFullName (){
        return this.fullName;
    }
    public int getSalary(){
        return salary;
    }

    //Здесь расположены Set'еры
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setDepartment (int department){
        this.department = department;
    }
    public void setSalary (int salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Id: " + id +", " + " Ф.И.О.: " + fullName +", " +" Отдел " + department +", " +" Заработная плата: " + salary;
    }


}
