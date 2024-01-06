package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerRepository1 customerRepository1;

    @Test
    public void printCourses() {
        List<Customer> customer =
                customerRepository.findAll();

        System.out.println("Customer = " + customer);
    }

    @Test
    public void saveCustomerWithTeacher() {
//        Address add = Address.builder()
//                .name("ram mandir")
////                .firstName("Lizze")
////                .lastName("Morgan")
//                .build();
//        Address add2 = Address.builder()
//                .name("ram mandir2")
////                .firstName("Lizze")
////                .lastName("Morgan")
//                .build();
//        ArrayList e=new ArrayList<>();
//        e.add(add);
//        e.add(add2);
//        Customer course = Customer
//                .builder()
//                .email("atulrathodc@gmail.com")
//                .name("atul")
//                .subject("website")
//                .message("need website")
////                .address(add)
//                .build();
//
//        customerRepository.save(course);
    }

    @Test
    public void saveCustomerWithTeacher1() {

        Address add = Address.builder()
                .name("ram mandir")
//                .firstName("Lizze")
//                .lastName("Morgan")
                .build();
        Address add2 = Address.builder()
                .name("ram mandir2")
//                .firstName("Lizze")
//                .lastName("Morgan")
                .build();
        ArrayList e=new ArrayList<>();
        e.add(add);
        e.add(add2);

        Customer1 course = Customer1
                .builder()
                .email("atulrathodc@gmail.com")
                .name("atul")
                .subject("website")
                .message("need website")
                .address(e)
                .build();
        add2.setCustomer(course);
        add.setCustomer(course);

        customerRepository1.save(course);
    }

//    @Test
//    public void findAllPagination(){
//        Pageable firstPagewithThreeRecords =
//                PageRequest.of(0, 3);
//        Pageable secondPageWithTwoRecords =
//                PageRequest.of(1,2);
//
//        List<Course> courses =
//                courseRepository.findAll(secondPageWithTwoRecords)
//                        .getContent();
//
//        long totalElements =
//                courseRepository.findAll(secondPageWithTwoRecords)
//                        .getTotalElements();
//
//        long totalPages =
//                courseRepository.findAll(secondPageWithTwoRecords)
//                        .getTotalPages();
//
//        System.out.println("totalPages = " + totalPages);
//
//        System.out.println("totalElements = " + totalElements);
//
//        System.out.println("courses = " + courses);
//    }
//
//    @Test
//    public void findAllSorting() {
//        Pageable sortByTitle =
//                PageRequest.of(
//                        0,
//                        2,
//                        Sort.by("title")
//                );
//        Pageable sortByCreditDesc =
//                PageRequest.of(
//                        0,
//                        2,
//                        Sort.by("credit").descending()
//                );
//
//        Pageable sortByTitleAndCreditDesc =
//                PageRequest.of(
//                        0,
//                        2,
//                        Sort.by("title")
//                                .descending()
//                                .and(Sort.by("credit"))
//                );
//
//        List<Course> courses
//                = courseRepository.findAll(sortByTitle).getContent();
//
//        System.out.println("courses = " + courses);
//    }
//
//    @Test
//    public void printfindByTitleContaining() {
//        Pageable firstPageTenRecords =
//                PageRequest.of(0,10);
//
//        List<Course> courses =
//                courseRepository.findByTitleContaining(
//                        "D",
//                        firstPageTenRecords).getContent();
//
//        System.out.println("courses = " + courses);
//    }
//
//    @Test
//    public void saveCourseWithStudentAndTeacher() {
//
//        Teacher teacher = Teacher.builder()
//                .firstName("Lizze")
//                .lastName("Morgan")
//                .build();
//
//        Student student = Student.builder()
//                .firstName("Abhishek")
//                .lastName("Singh")
//                .emailId("abhishek@gmail.com")
//                .build();
//
//        Course course = Course
//                .builder()
//                .title("AI")
//                .credit(12)
//                .teacher(teacher)
//                .build();
//
//        course.addStudents(student);
//
//        courseRepository.save(course);
//    }
}
