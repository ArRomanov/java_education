package models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//@Data
public class User {
    @Getter
    private UUID userId;

    @Getter
    @Setter
    private String email;
}

/*
https://plugins.gradle.org/plugin/io.freefair.lombok  - грэдл плагин
https://habr.com/ru/post/438870/
https://habr.com/ru/post/345520/
*/
