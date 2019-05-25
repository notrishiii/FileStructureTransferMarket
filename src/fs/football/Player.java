package fs.football;

import java.io.Serializable;

public class Player implements Serializable {

    static int count=0;
    int id;
    String name;
    int age;
    String position;
    int value;
    String team;

    public Player(String name, int age, String position, int value, String team) {
        this.id=count++;
        this.name = name;
        this.age = age;
        this.position = position;
        this.value = value;
        this.team = team;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Player.count = count;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", age=" + age + ", position=" + position + ", value=" + value + ", team=" + team + '}';
    }
    
    
}