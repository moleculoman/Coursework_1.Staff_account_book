import org.apache.commons.lang3.StringUtils;

public class Employee {
    private final int id;
    private int department;
    private String firstName;
    private String surName;
    private String fullName;
    protected int salary;
    private static int counter;

    //constructor
    public Employee(String firstName,String surName, int department, int salary){
        if (inputValidation(firstName,surName)){
            throw new IllegalArgumentException("400 Bad Request");
        }
        this.id = ++counter;
        this.firstName = StringUtils.capitalize(firstName.toLowerCase());
        this.surName = StringUtils.capitalize(surName.toLowerCase());
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFullName (){
        return this.fullName;
    }
    public int getSalary(){
        return salary;
    }

    //Здесь расположены Set'еры
    public void setFullName(String fullName){
        this.fullName = firstName+surName;
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

    private boolean inputValidation(String firstName,String surName){
        return StringUtils.isAlpha(firstName) && StringUtils.isAlpha(surName);
    }

}
