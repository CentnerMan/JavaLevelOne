package ru.lebedev.se;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SetTest {

    private class User {
        public String login;

        public User(String login) {
            this.login = login;
        }
        @Override
        public String toString(){
            return login;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(login, user.login);
        }

        @Override
        public int hashCode() {
            return Objects.hash(login);
        }
    }

    @Test
    public void test() {

        Set<User> users = new LinkedHashSet<>();
        users.add(new User("admin"));
        users.add(new User("test"));
        users.add(new User("test"));
        System.out.println(users.size());

//        List<Integer> indexes = new ArrayList<>();
//        Collection<Integer> indexes = new LinkedHashSet<>();
//        indexes.add(1);
//        indexes.add(1);
//        indexes.add(2);
//        indexes.add(3);
//        indexes.add(3);
//        indexes.add(5);
//        indexes.add(5);
//
//        Assert.assertEquals(4, indexes.size());
//        System.out.println(indexes.size());

    }
}
