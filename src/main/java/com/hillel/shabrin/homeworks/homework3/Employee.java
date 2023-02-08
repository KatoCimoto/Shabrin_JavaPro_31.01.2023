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
                "Phone number: " + phoneNumber + '\n' +
                "Email: " + email + '\n';
    }

    public String getFlName() {
        return flName;
    }

    public void setFlName(String flName) {
        this.flName = flName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
