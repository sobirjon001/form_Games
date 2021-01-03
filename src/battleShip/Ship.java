package battleShip;

import java.util.ArrayList;

class Ship {
  String name, team, direction = "n";
  int length, speed;
  ArrayList<Integer> damageIndex = new ArrayList<>();
  ArrayList<Integer> position;
  boolean isDead = false;

  Ship(
          String name, String team, int length, int speed, ArrayList<Integer> position
  ) {
    this.name = name;
    this.team = team;
    this.length = length;
    this.speed = speed;
    this.position = position;
  }
}
