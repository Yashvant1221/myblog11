package com.myblog.com.myblog11;


import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.internal.util.collections.ArrayHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {

        // Predicate Functional Interface Example 1
//        Predicate<Integer> val = x->x%2==0;
//        boolean result = val.test(10);
//        System.out.println(result);

        // Example 2
//        Predicate <String> val = str->str.equals("mike");
//        boolean result = val.test("mikes");
//        System.out.println(result);

        // Example 3
//        List<Integer> numbers = Arrays.asList(10, 20, 1, 5, 16, 19, 20);
//        List <Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(evenNumbers);

        // Example 4
//        List<Integer> numbers = Arrays.asList(10, 20, 1, 5, 19, 20);
//        List <Integer> oddNumbers = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
//        System.out.println(oddNumbers);

        // Example 5
//        List<String> names1 = Arrays.asList("mike", "adam,", "stallin", "yashvant","mohan");
//        List <String> data1 = names1.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
//        System.out.println(data1);
//
        // Example 6
//        List<String> names2 = Arrays.asList("mike", "adam", "stallin", "yashvant", "mike");
//        List <String> data2 = names2.stream().filter(s->s.equals("mike")).collect(Collectors.toList());
//        System.out.println(data2);
//
        // Example 7
//        List<String> names3 = Arrays.asList("mike", "adam", "stallin", "yashvant", "mike");
//        List <String> data3 = names3.stream().filter(n->n.endsWith("n")).collect(Collectors.toList());
//        System.out.println(data3);

        // Function Functional Interface Example 1
//        Function <String, Integer> result = str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);

        // Example 2
//        Function <Integer, Integer> results = i->i+10;
//        Integer val = results.apply(30);
//        System.out.println(val);

        // Example 3
//         List<Integer> data = Arrays.asList(10, 20, 30, 60, 98, 65);
//         List<Integer> evenNumbers = data.stream().map(i->i+10).collect(Collectors.toList());
//         System.out.println(evenNumbers);

        // Example 4
//        List<String> data = Arrays.asList("mike", "stallin", "adam");
//        List<String> result = data.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(result);

        // Example 5
//        List<String> data = Arrays.asList("mike", "stallin", "adam");
//        List<String> result = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(result);

        // Example 6
//        List<Integer> data = Arrays.asList(15, 3, 60, 100, 1);
//        List<Integer> result = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(result);

        // Example 7
//        List<Integer> data = Arrays.asList(15, 3, 60, 100, 1, 15, 100, 60);
//        List<Integer> result = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(result);

        // Example 8
//        List<Integer> data = Arrays.asList(15, 3, 60, 100, 1, 15, 100, 60);
//        List<Integer> result = data.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(result);

        //Consumer Functional Interface Example 1
//        Consumer <Integer> result = number-> System.out.println(number);
//        result.accept(100);

        // Example 2
//        List<String> names = Arrays.asList("mike", "adam", "sam");
//        Consumer<String> val = name-> System.out.println(name);
//        names.forEach(val);

        // Supplier Functional Interface Example 1
//        Supplier <Integer> x = ()->new Random().nextInt(200) ;
//        Integer y = x.get();
//        System.out.println(y);

//        List<Login> logins = Arrays.asList(
//                new Login("mike", "testing"),
//                new Login("stallin", "testing"),
//                new Login("adam", "testing"));
//        System.out.println(logins);
//
//        List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
//        System.out.println(dtos);
//    }
//
//    static LoginDto mapToDto(Login login) {
//        LoginDto dto = new LoginDto();
//        dto.setUserName(login.getUserName());
//        dto.setPassword(login.getPassword());
//        return dto;
//    }

//        List<Employee> employees = Arrays.asList(
//                new Employee("mike", 30, "chennai"),
//                new Employee("adam", 25, "chennai"),
//                new Employee("stallin", 31, "banglore"),
//                new Employee("narendra", 34, "pune")
//        );
//        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
//        for(Employee e: emps){
//            System.out.println(e.getName());
//            System.out.println(e.getAge());
//            System.out.println(e.getCity());
//        }

//        List<String> names = Arrays.asList("adam", "aasish", "ram", "shyam");
//        List<String> data = names.stream().filter(n -> n.startsWith("a")).collect(Collectors.toList());
//        System.out.println(data);


//        List<Integer> numbers = List.of(3, 4, 5, 6, 7, 8, 9, 16, 31, 12, 11);
//        List<Integer> data = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
////        Integer data = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
//        System.out.println(data);


        //Group By Example
//        List<Employee> employees = Arrays.asList(
//                new Employee("mike",30,"chennai"),
//                new Employee("adam",34,"chennai"),
//                new Employee("stallin",34,"banglore"),
//                new Employee("sam",25,"pune")
//        );
//
//        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(n -> n.getAge()));
//
//        // This loop is used for getting key and values
//        for(Map.Entry<Integer, List<Employee>> entry : collect.entrySet()) {
//            Integer age = entry.getKey();
//            List<Employee> empWithAge = entry.getValue();
//
//
//            // This loop is used to printing the output inside object
//            System.out.println("age: " + age);
//            for (Employee emp : empWithAge) {
//                System.out.println(emp.getName());
//                System.out.println(emp.getCity());
//            }
//        }


        //Question -Given a list of strings, filter out the strings that have a length greater than 5 using the filter() method.
        // Then, use the map() method to convert the remaining strings to uppercase. Provide the code for this operation.

//        List<String> names = Arrays.asList("stallin", "ram", "shyam", "sheela", "shula");
//        List<String> collect = names.stream().filter(n -> n.length() > 5).map(n->n.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collect);

        //Question- Consider a list of integers. Use the map() method to square each integer and then use the filter() method to keep
        // only the  squared values that are greater than 100. Provide the code for this transformation and filtering process.

//        List<Integer> numbers = Arrays.asList(22, 13, 5, 7, 10, 12, 14, 6, 17);
//        List<Integer> result = numbers.stream().map(n -> n * n).filter(n -> n >= 100).collect(Collectors.toList());
//        System.out.println(result);

        //Question- Given a list of integers, filter out the odd numbers using the filter() method. Then, use the map() method to double
        // each even number. Provide the code for this combined filtering and mapping process.

        List<Integer> numbers = Arrays.asList(22, 13, 5, 7, 10, 12, 14, 6, 17);
        List<Integer> result = numbers.stream().filter(n -> n % 2 != 0).map(m -> m * m).collect(Collectors.toList());
        System.out.println(result);

    }
}

