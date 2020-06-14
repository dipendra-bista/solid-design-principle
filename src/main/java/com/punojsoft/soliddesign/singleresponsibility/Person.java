package com.punojsoft.soliddesign.singleresponsibility;

import java.util.List;

/**
 * we have two classes Person and Account. Both have single responsibility to store their specific information.
 * If we want to change state of Person then we do not need to modify the class Account and vice-versa.
 */
public class Person {

    private Long personId;
    private String firstName;
    private String lastName;
    private String age;
    private List<Account> accounts;
}
