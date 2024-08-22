package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("AAAA","0123");
        userList.addUser("BBBB","1234");
        userList.addUser("CCCC","2345");

        // TODO: find one of them
        String actual = userList.findUserByUsername("AAAA").getUsername();
        // TODO: assert that UserList found User
        String expected = "AAAA";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("AAAA","0123");
        userList.addUser("BBBB","1234");
        userList.addUser("CCCC","2345");

        // TODO: change password of one user
        boolean actual = userList.changePassword("AAAA","0123","6789");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("AAAA","0123");
        userList.addUser("BBBB","1234");
        userList.addUser("CCCC","2345");
        // TODO: call login() with correct username and password
        String actual = userList.login("AAAA","0123").getUsername();
        // TODO: assert that User object is found
        String expected = "AAAA";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("AAAA","0123");
        userList.addUser("BBBB","1234");
        userList.addUser("CCCC","2345");
        // TODO: call login() with incorrect username or incorrect password
        String actual = userList.login("AAAA","0123").getUsername();
        // TODO: assert that the method return null
        String expected = "AAAA";
        assertNull(actual);
    }

}