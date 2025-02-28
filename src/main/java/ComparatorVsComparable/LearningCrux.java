package ComparatorVsComparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class LearningCrux {

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Employee implements Comparable<Employee>{
        int id;
        String name;
        Double salary;

        // need to implement functionality  to sort
        public int compareTo(Employee emp){
            int compareSalary = (int)(this.salary-emp.salary);

            if(compareSalary == 0){
                // means again sort on basis of name in ascending
                int compareName = this.name.compareTo(emp.name);
                if(compareName == 0){

                    // then need to compare by id (ascending)
                    return this.id - emp.id;
                }
                return compareName;
            }
            return compareSalary;
        }

    }

    public static  class CustomComparator implements Comparator<Employee>{
        // overrid compare method
        public  int compare(Employee emp1, Employee emp2){
            int compareSalary = Double.compare(emp1.salary, emp2.salary);

            // also can do like below line
//            int compareSalary = (int)(emp2.salary-emp1.salary);

            if(compareSalary == 0){
                // means again sort on basis of name in ascending
                int compareName = emp1.name.compareTo(emp2.name);
                if(compareName == 0){

                    // then need to compare by id (ascending)
                    return Integer.compare(emp1.id, emp2.id);
                }
                return compareName;
            }
            return compareSalary;
        }
    }



    public static  void main(String[] args){
        // prepare list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Shraddha", 75000.00));
        employees.add(new Employee(102, "Rahul", 85000.00));
        employees.add(new Employee(103, "Shraddha", 75000.00));
        employees.add(new Employee(104, "Aarav", 75000.00));
        employees.add(new Employee(105, "Neha", 90000.00));

        // now need to sort based on salary --- using comparable
        Collections.sort(employees);

        // sort -- by using comparator
        Collections.sort(employees, new CustomComparator());
        for(Employee employee: employees){
            System.out.println(employee.getId()+ " "+ employee.getName()+" "+ employee.getSalary());
        }

    }
}

//Problem Statement:
//You are given a list of Employee objects, where each employee has:
//
//id (Integer)
//name (String)
//salary (Double)
//You need to sort this list based on multiple conditions:
//
//Primary Sort: Sort by salary in descending order.
//Secondary Sort: If two employees have the same salary, sort by name in ascending order.
//Tertiary Sort: If salary and name are the same, sort by id in ascending order.
//You need to solve this in two ways:
//
//Using Comparable
//Using Comparator