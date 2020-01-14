package com.Igor;
//https://javarush.ru/groups/posts/605-junit
import java.util.*;

class User{
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private static Map<Integer,User> allUsers;
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

    public User(int age, String name,Sex sex){
        if(allUsers==null){
            allUsers = new HashMap<>();
        }
        this.name = name;
        this.age = age;
        this.sex = sex;
        if(!hasUser()){
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }
    public static List<User> getAllUser(){
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
                ", name" + name + '\'' +
                ", age" + age +
                ", sex" + sex +
                '}';
    }
}
class Sex{
    private String sex;

    public String getSex() {
        return sex;
    }
    public Sex(String sex){
        this.sex=sex;
    }
}
class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

