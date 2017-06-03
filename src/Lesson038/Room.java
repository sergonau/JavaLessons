package Lesson038;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    int numberOfWalls;
    List<Wall> listOfWalls = new ArrayList<>();

    public Room() {
    }

    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    void setWall() {
        if (numberOfWalls > 0) {
            for (int i = 0; i < numberOfWalls; i++) {
                listOfWalls.add(new Wall());
            }
        } else {
            System.out.println("Must nave > 0 walls");
        }
    }

}

class Furniture {

}

class Wall {
}

class House {
    int numberOfRooms;
    Map<Room, Integer> rooms = new HashMap<>();

    {
        rooms.put(new Room(), 3);
        rooms.put(new Room(), 4);
        rooms.put(new Room(), 4);
    }


    public House() {
    }

    public void setRooms() {
        if (numberOfRooms > 0) {
            for (Room r : rooms.keySet()) {
                Room room = r;
                room.setNumberOfWalls(rooms.get(r));
                room.setWall();
            }
        }
    }

    void buildHouse() {

    }

}

class NewHouse {
    House house;
}

class Builder {
    public static void main(String[] args) {
        House house = new House();
    }
}