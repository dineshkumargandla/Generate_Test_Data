package com.bdd.framework.generateTestData.constants;

import static com.bdd.framework.generateTestData.generateData.GenerateTestData.*;

public interface Parameters {

    String FIRST_NAME = getFirstName();

    String EMAIL = getEmail();

    String USER_NAME = getUserName();

    String DESCRIPTION = getDescription();

    String LAST_NAME = getLastName();

    String FULL_NAME = getFullName();

    String COMPANY_NAME = getCompanyName();

    String ADDRESS = getAddress();

    String FULL_ADDRESS = getFullAddress();

    String CITY = getCity();

    String STATE = getState();

    String ZIP_CODE = getZipCode();

    String PHONE_NUMBER = getPhoneNumber();

    String PRODUCT_NAME = getProduct();

    int RANDOM_NUMBER = getRandomNumber();

    String PASSWORD = getRandomPassword();

}
