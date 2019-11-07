package com.company;

public class Queen extends Piece {

    public Queen()
    {}

    public Queen(Position newPosition)
    {
        super();
        this.position = newPosition;
    }
    boolean isValidMove(Position newPosition)
    {
        boolean flag = false;
            if (newPosition.column == this.position.column || newPosition.row == this.position.row)
            {
                if (Math.abs(newPosition.column - this.position.column) ==
                    Math.abs(newPosition.row - this.position.row))
                {
                    flag = true;
                }
                else flag = false;
            }
            else flag = false;
        return flag;
    }
}
