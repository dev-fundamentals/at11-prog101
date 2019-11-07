package com.company;

public class Bishop extends Piece {

    public Bishop()
    {}

    public Bishop(Position position)
    {
        super();
        this.position = position;
    }
    boolean isValidMove(Position newPosition)
    {
        if (Math.abs(newPosition.column - this.position.column) ==
        Math.abs(newPosition.row - this.position.row))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}