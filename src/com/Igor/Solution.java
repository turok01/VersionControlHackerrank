package com.Igor;
//https://javarush.ru/groups/posts/605-junit
import java.util.*;

class User{
    private int id;
    private String name;
    private int age;
    private Sex sex;
    enum Sex{
        MALE,
        FEMALE
    }
    private static Map<Integer,User> allUsers=new HashMap<>();
    private static int countId = 0;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Sex getSex() {
        return sex;
    }
    public int getAge() {
        return age;
    }
    public User(String name, int age, Sex sex){
        if(name!=null && !name.isEmpty() && age > 0 && sex!=null) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }
    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }
    public static List<User> getAllUsers(Sex sex){
        List<User> listAllUsers = new ArrayList<>();
        for(User user : allUsers.values()){
            if(user.sex==sex)
                listAllUsers.add(user);
        }
        return  listAllUsers;
    }
    public static int getHowManyUsers(){
        return allUsers.size();
    }
    public static int getHowManyUsers(Sex sex){
        return getAllUsers(sex).size();
    }
    public static int getAllAgeUsers(){
        int allAge=0;
        for (User user:getAllUsers()){
            allAge+=user.getAge();
        }
        return allAge;
    }
    public static int getAllAgeUsers(Sex sex){
        int allAge=0;
        for (User user:getAllUsers(sex)){
            allAge+=user.getAge();
        }
        return allAge;
    }
    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers()/getHowManyUsers();
    }
    public static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex)/getHowManyUsers(sex);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age, sex);
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && sex==user.sex;
    }
    private boolean hasUser(){
        for(User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode())
                return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name " + name +
                ", age " + age +
                ", sex " + sex +
                '}';
    }
}
/*class Sex{
    private String sex;

    public String getSex() {
        return sex;
    }
    public Sex(String sex){
        this.sex=sex;
    }
}*/
class Solution{
    public static void main(String[] args){
        /*Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }*/
        new User("Igor",35, User.Sex.MALE);
        new User("Kristina",34, User.Sex.FEMALE);
        new User("Serg", 30,User.Sex.MALE);

        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
    }
}

