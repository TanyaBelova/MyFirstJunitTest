package belova;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getAllUsers() {
        User user1 = new User("Гаврилова Таня", 24, Sex.FEMALE);
        User user2 = new User("Гаврилов Ваня", 24, Sex.MALE);
        User user3 = new User("Гаврилов Шуф", 85, Sex.MALE);

        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        /*actual.add(new User("User1", 55, Sex.MALE));
        actual.add(new User("User2", 15, Sex.FEMALE));
        actual.add(new User("User3", 5, Sex.FEMALE));*/

        assertEquals(expected, actual, "Пользователи равны");
    }

    @Test
    void testGetAllUsers() {
    }

    @Test
    void getHowManyUsers() {
    }

    @Test
    void testGetHowManyUsers() {
    }

    @Test
    void getAllAgeUsers() {
    }

    @Test
    void testGetAllAgeUsers() {
    }

    @Test
    void getAverageAgeOfAllUsers() {
    }

    @Test
    void testGetAverageAgeOfAllUsers() {
    }
}