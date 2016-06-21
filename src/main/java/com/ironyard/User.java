package com.ironyard;

import javax.persistence.*;

/**
 * Created by illladell on 6/21/16.
 */

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }
}
