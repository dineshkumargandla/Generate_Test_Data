package com.bdd.framework.generateTestData.generateData;

import com.github.javafaker.Faker;

public class GenerateTestData {
    static Faker fake = new Faker();


    public static  String getEmail(){
        String email = fake.name().firstName().toLowerCase()+fake.number().digits(3) + "@gmail.com";
        return email;
    }

    public static  String getUserName(){
        String userName = fake.name().username().replace("-","");
        return userName;
    }

    public static  String getFirstName(){
        String firstName = fake.name().firstName();
        return firstName;
    }
    public static  String getDescription(){
        String description = fake.dragonBall().character();
        return description;
    }

    public static  String getLastName(){
        String lastName = fake.name().lastName();
        return lastName;
    }

    public static  String getFullName(){
        String fullName = fake.name().fullName();
        return fullName;
    }

    public static  String getCompanyName(){
        String companyName = fake.company().name();
        return companyName;
    }

    public static  String getAddress(){
        String Address = fake.address().buildingNumber()+ "," +fake.name().name() +" apartment";
        return Address;
    }

    public static  String getFullAddress(){
        String fullAddress = fake.address().streetAddress(false);
        return fullAddress;
    }

    public static  String getCity(){
        String city = fake.address().city();
        return city;
    }

    public static  String getState(){
        String state = fake.address().state();
        return state;
    }

    public static  String getZipCode(){
        String zipCode = fake.address().zipCode();
        return zipCode;
    }

    public static  String getPhoneNumber(){
        String cellPhoneNumber = fake.phoneNumber().phoneNumber();
        return cellPhoneNumber;
    }
    public static  String getProduct(){
        String productName = fake.commerce().productName();
        return productName;
    }

    public static  int getRandomNumber(){
        int productName = fake.number().randomDigitNotZero();
        return productName;
    }
    public static String getRandomPassword(){
        String productName = fake.name().firstName()+"#"+fake.number().digits(4);
        return productName;
    }
}
