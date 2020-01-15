package com.Igor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {
    private User user1;
    private User user2;
    private User user3;

    private User userNotAdd;
    private User userNotAdd1;

    @Before
    public void setUp() throws Exception {
        //create test data
        user1 = new User("Igor", 35, User.Sex.MALE);
        user2 = new User("Kristina", 34, User.Sex.FEMALE);
        user3 = new User("Serg", 30, User.Sex.MALE);

        userNotAdd = new User("",0,null);
        userNotAdd1 = new User(null,0,null);
    }
    @Test
    public void newUser_EMTY_NAME(){
        for(User user : User.getAllUsers()){
            if (user.getName() != null && user.getName().isEmpty()){
                Assert.fail("Попытка создания пользователя с пустым именем");
            }
        }
    }
    @Test
    public void newUser_AGE_ZERO(){
        for(User user : User.getAllUsers()){
            if(user.getAge()<=0){
                Assert.fail("Поытка создания пользователя с недопустимым возрастом");
            }
        }
    }
    @Test
    public void newUser_SEX_NO_NULL(){
        for(User user : User.getAllUsers()){
            if(user.getSex()==null){
                Assert.fail("Попытка создания пользователя с указанием пола = null");
            }
        }
    }
    @Test
    public void getAllUsers() {
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
    public void GetAllUsers_MALE() {
        List<User> expected = User.getAllUsers(User.Sex.MALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user3);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void GetAllUsers_FEMALE() {
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
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();
        int actual = 3;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetHowManyUsers_MALE() {
        int expected = User.getHowManyUsers(User.Sex.MALE);
        int actual = 2;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetHowManyUsers_FEMALE() {
        int expected = User.getHowManyUsers(User.Sex.FEMALE);
        int actual = 1;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();
        int actual= 35 + 34 + 30;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllAgeUsers_MALE() {
        int expected = User.getAllAgeUsers(User.Sex.MALE);
        int actual= 35 + 30;

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAllAgeUsers_FEMALE() {
        int expected = User.getAllAgeUsers(User.Sex.FEMALE);
        int actual= 34;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAverageAgeOfAllUsers() {
    }


}