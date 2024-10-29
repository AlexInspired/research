package com.practice.leetcode.warmup.streamstraining;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterUserGroupsTest {

    List<User> users = new ArrayList<>();

    @Before
    public void init() {
        Group gr1 = new Group("Xtrail1", "Desc1");
        Group gr2 = new Group("Xtrail2", "Desc2");
        Group gr3 = new Group("Trail", "Trail");
        List<Group> groups = List.of(gr1, gr2, gr3);
        User user1 = new User("User1", 20, groups);
        User user2 = new User("User2", 25, groups);
        User user3 = new User("User2", 25, new ArrayList<>());
        users = List.of(user1, user2, user3);
    }

    @Test
    public void testV1() {

        FilterUserGroups filterUserGroups = new FilterUserGroups();

        List<User> actual = filterUserGroups.consumeV1(users.stream());

        Assert.assertEquals(2, actual.size());
    }

    @Test
    public void testV2() {

        FilterUserGroups filterUserGroups = new FilterUserGroups();

        List<User> actual = filterUserGroups.consumeV2(users.stream());

        Assert.assertEquals(2, actual.size());
    }
}