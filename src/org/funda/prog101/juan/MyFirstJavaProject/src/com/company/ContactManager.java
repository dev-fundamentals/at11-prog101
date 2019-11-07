package com.company;

public class ContactManager {
    //Variables
    Contact [] myFriends;
    int friendCount;

    //Constructor
    ContactManager()
    {
        myFriends = new Contact[500];
        friendCount = 0;
    }

    //methods
    public void addContact(Contact contact)
    {
        myFriends[friendCount] = contact;
        friendCount++;
    }

    public Contact searchContact(String searchName)
    {
        for (int item = 0; item < friendCount; item++)
        {
            if (myFriends[item].name.equals(searchName))
            {
                return myFriends[item];
            }
        }
        return null;
    }
}
