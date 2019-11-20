package com.company;

public interface SpaceShip {
    public Boolean launch();
    public Boolean land();
    public Boolean canCarry(Item item);
    public void carry(Item item);
}
