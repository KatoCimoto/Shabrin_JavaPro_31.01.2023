package com.hillel.shabrin.homeworks.homework3;

public class Employee {

    String flName;
    String post;
    String email;
    String phoneNumber;
    int age;

    public Employee(String flName, String post, String email, String phoneNumber, int age) {
        this.flName = flName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Name: " + flName + '\n' +
                "Post: " + post + '\n' +
                "Age: " + age + '\n' +
                "Phone nubmer: " + phoneNumber + '\n' +
                "Email: " + email + '\n';
    }
}
