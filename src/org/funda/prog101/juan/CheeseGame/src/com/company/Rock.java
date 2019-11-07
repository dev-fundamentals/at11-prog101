package com.company;

public class Rock extends Piece {
    String name;

    public Rock()
    {
        super();
        this.name = "rock";
    }

    public Rock(Position position)
    {
        super();
        this.position = position;
    }

    boolean isValidMove(Position newPosition)
    {
        if (!super.isValidMove(newPosition))
        {
            return false;
        }
        if (newPosition.column == this.position.column || newPosition.row == this.position.row)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
