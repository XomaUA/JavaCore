package com.company;

public class Main {
 static class Employee {
    String name;
    int departmentNumber;
    int salary;

   public Employee ( String name, int departmentNumber, int salary) {
       this.name = name;
       this.departmentNumber = departmentNumber;
       this.salary = salary;
   }
   public int getDepartmentNumber(){
       return departmentNumber;
   }
   public int getSalary(){
       return salary;
   }
   public String getName(){
       return name;
   }

}
    public static void main(String[] args) {
    Employee num1 = new Employee("Valera", 1, 2000);
    Employee num2 = new Employee("John", 3, 2500);
    Employee num3 = new Employee("Simon", 2, 3300);
    Employee num4 = new Employee("Harry", 1, 2100);
    Employee num5 = new Employee("Peter", 2, 1800);
    int[] emp = {num1.getSalary(), num2.getSalary(), num3.getSalary(), num4.getSalary(), num5.getSalary()};

    int tmp;
    for (int i = 0; i < emp.length - 1; i++){
  for( int j = i +1; j < emp.length; j++) {
      if (emp[i] < emp[j]){
          tmp = emp[i];
          emp[i] = emp[j];
          emp[j] = tmp;
        }
      }
  }
    for (int i=0; i < emp.length; i++){
    System.out.println(emp[i]);}

   
    }
}
