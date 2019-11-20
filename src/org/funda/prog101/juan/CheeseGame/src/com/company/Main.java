package com.company;

import java.sql.SQLSyntaxErrorException;

public class Main {

    public static void main(String[] args) {

        Position testPosition = new Position(1,4);
        Position position = new Position(3,4);
        Queen queen = new Queen(testPosition);
        if (queen.isValidMove(position))
        {
            System.out.println("Yes I can move there");
        }
        else
        {
            System.out.println("Nope, Can't do");
        }

        Position rockPosition = new Position(1,7);
        Position newPosition = new Position(3,7);
        Rock rock = new Rock(rockPosition);
        if (rock.isValidMove(newPosition))
        {
            System.out.println("Yes I can move there");
        }
        else
        {
            System.out.println("Nope, Can't do");
        }

        Position bishopPosition = new Position(1,3);
        Position newBishopPosition = new Position(3,1);
        Bishop bishop = new Bishop(bishopPosition);
        if (bishop.isValidMove(newBishopPosition))
        {
            System.out.println("Yes I can move there");
        }
        else
        {
            System.out.println("Nope, Can't do");
        }
    }
}
