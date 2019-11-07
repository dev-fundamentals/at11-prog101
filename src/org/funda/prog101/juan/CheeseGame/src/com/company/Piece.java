package com.company;

public class Piece {
    //Fields
    Position position;

    //Constructor
    Piece()
    {}

    Piece(int row, int column)
    {
        this.position.row = row;
        this.position.column = column;
    }

    //Methods
    boolean isValidMove(Position newPosition)
    {
        if (newPosition.row > 0 && newPosition.column > 0
            && newPosition.row < 8 && newPosition.column < 8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
