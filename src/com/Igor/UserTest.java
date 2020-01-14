package com.Igor;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getAllUsers() {
        //create test data
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);

        //create list "expected" and full him data of our method
        List<User> expected = User.getAllUsers();

        //create list actual with data for comparing
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);

        //run test, if lists expected and actual will not equal
        //then test is fault
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllUsers_NO_NULL(){
        //add check for not null
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }
    @Test
    public void testGetAllUsers_MALE() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);

        List<User> expected = User.getAllUsers(User.Sex.MALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user3);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetAllUsers_FEMALE() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);

        List<User> expected = User.getAllUsers(User.Sex.FEMALE);
        List<User> actual = new ArrayList<>();
        actual.add(user2);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllUsers_MALE_NO_NULL(){
        //add check for not null
        List<User> expected = User.getAllUsers(User.Sex.MALE);
        Assert.assertNotNull(expected);
    }
    @Test
    public void getAllUsers_FEMALE_NO_NULL(){
        //add check for not null
        List<User> expected = User.getAllUsers(User.Sex.FEMALE);
        Assert.assertNotNull(expected);
    }
    @Test
    public void testGetAllUsers() {
    }

    @Test
    public void getHowManyUsers() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);

        int expected = User.getHowManyUsers();
        int actual = 3;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetHowManyUsers_MALE() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);
        int expected = User.getHowManyUsers(User.Sex.MALE);
        int actual = 2;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetHowManyUsers_FEMALE() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);
        int expected = User.getHowManyUsers(User.Sex.FEMALE);
        int actual = 1;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllAgeUsers() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);
        int expected = User.getAllAgeUsers();
        int actual= 35 + 34 + 30;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllAgeUsers_MALE() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);
        int expected = User.getAllAgeUsers(User.Sex.MALE);
        int actual= 35 + 30;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllAgeUsers_FEMALE() {
        User user1 = new User("Igor",35, User.Sex.MALE);
        User user2 = new User("Kristina",34, User.Sex.FEMALE);
        User user3 = new User("Serg", 30,User.Sex.MALE);
        int expected = User.getAllAgeUsers(User.Sex.FEMALE);
        int actual= 34;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetAllAgeUsers() {
    }

    @Test
    public void getAverageAgeOfAllUsers() {
    }

    @Test
    public void testGetAverageAgeOfAllUsers() {
    }
}