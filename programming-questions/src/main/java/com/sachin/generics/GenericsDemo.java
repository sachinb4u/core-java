package com.sachin.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by sbhosale on 1/6/14.
 */
public class GenericsDemo {


    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<Employee>();

        List<ContractEmployee> contractEmployees = new ArrayList<ContractEmployee>();

        List<? super ContractEmployee> empList ;
        empList = contractEmployees;
        empList = employeeList;

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
       List<? super Number> emptyList = new ArrayList<Number>() ;

      // Collections.copy(emptyList, nums);
        emptyList.add(3.14);

        Integer[] intArr = new Integer[]{2,35,5};

        Number[] numArr = intArr;
        numArr[0] = 3.13;

    }


    private static <Employee> void addEmployees(Collection<? extends Employee> employees){

    }

    private static <Integer> void addInts(List<java.lang.Integer> collections) {

        for(int  i = 0 ; i < 10; i++){
            collections.add(i);
        }
    }
    private static class Employee{
        int empId;
    }

    private static class ContractEmployee extends Employee{

        int contractId;
    }
    private static class PermanentEmployee extends Employee{
        int permanentId;
    }
}
