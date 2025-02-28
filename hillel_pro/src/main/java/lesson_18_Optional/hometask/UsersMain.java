package lesson_18_Optional.hometask;

import java.util.ArrayList;

public class UsersMain {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        // Case 1: Find and get user by present ID:
        repo.getUserById(5);

        // Case 2: Find and get user by non-existing ID:
        repo.getUserById(50);

        // Case 3: Find and get user by existing email:
        repo.getUserByEmail("k@gmail.com");

        // Case 4: Find and get user by non-existing email:
        repo.getUserByEmail("banjee@jumping.eu");

        // Case 5: Find and get users number for non-empty list:
        System.out.println("There are [" + repo.getPresentListUsersQuantity(repo.getUsers())
                + "] users in this repository.");

        // Case 6: Find and get users number for empty list:
        System.out.println("There are ["
                + repo.getPresentListUsersQuantity(new ArrayList<>())
                + "] users in this repository.");
    }
}

/* CONSOLE OUTPUT:

User{id=5, name='Marc', email='m@gmail.com'}
User with id=[50] doesn't exist.
User{id=7, name='Kate', email='k@gmail.com'}
User with email=[banjee@jumping.eu] doesn't exist.
There are [7] users in this repository.
There are [0] users in this repository.

 */
