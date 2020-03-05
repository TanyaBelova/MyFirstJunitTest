package belova;


import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;

    private static Map<Integer, User>  AllUsers;
    public static int countId = 0;
    private User user;

    public User(String name, int age, Sex sex){
        if(AllUsers==null){
            AllUsers=new HashMap<>();
        }
        this.name=name;
        this.age=age;
        this.sex = sex;

        if(!hasUser())
        {
            countId++;
            this.id=countId;
            AllUsers.put(id, this);
        }
    }

    public boolean hasUser(){
        for (User user: AllUsers.values())
        {
            if(user.equals(this.user)&& user.hashCode()==this.hashCode())
                return true;
        }
        return false;
    }

    public static List<User> getAllUsers(){
        return new ArrayList<>(AllUsers.values());
    }

    public static List<User> getAllUsers(Sex sex){
        List<User> listAllUsers = new ArrayList<>();
        for(User user: AllUsers.values()){
            if(user.sex == sex)
                listAllUsers.add(user);
        }
        return listAllUsers;
    }

    public static int getHowManyUsers(){
        return AllUsers.size();
    }

    public static int getHowManyUsers(Sex sex){
        return getAllUsers(sex).size();
    }

    public static int getAllAgeUsers(){
        int countAge=0;
        for(User user: AllUsers.values()){
            countAge+=user.age;
        }
        return countAge;
    }

    public static int getAllAgeUsers(Sex sex){
        int countAge=0;
        for(User user: AllUsers.values()){
            if(user.sex==sex) {
                countAge+=user.age;
            }
        }
        return countAge;
    }

    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers()/getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex)/getHowManyUsers(sex);
    }

    @Override
    public String toString(){
        return "User{"+ "id="+id + ", name="+name+'\''+", age="+age+", sex="+sex+"}";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        User user = (User)o;
        return age==user.age && Objects.equals(name, user.name) && sex== user.sex;
    }

    //проверка наличия подобного объекта в списке
    @Override
    public int hashCode(){
        return Objects.hash(name, age, sex);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
