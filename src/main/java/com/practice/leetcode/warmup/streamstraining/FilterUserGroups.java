package com.practice.leetcode.warmup.streamstraining;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

@AllArgsConstructor
@Data
class User {
    private String username;
    private Integer age;
    private List<Group> groups;
}

@AllArgsConstructor
@Data
class Group {
    private String name;
    private String description;
}

public class FilterUserGroups {
    // получить список пользователей, которые состоят в группе, начинающейся на "X"
    public List<User> consumeV1(Stream<User> usersStream) {
        return usersStream.filter(user -> !user.getGroups()
                .stream().map(Group::getName)
                .filter(groupName -> groupName.startsWith("X"))
                .toList().isEmpty()
        ).toList();
    }

    public List<User> consumeV2(Stream<User> usersStream) {
        return usersStream.filter(user -> user.getGroups()
                .stream()
                .map(Group::getName)
                .anyMatch(groupName -> groupName.startsWith("X"))
        ).toList();
    }
}
