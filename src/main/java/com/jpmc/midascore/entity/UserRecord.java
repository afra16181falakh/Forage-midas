package com.jpmc.midascore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class UserRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(nullable = false)
    private float balance;

    protected UserRecord() {
    }

    public UserRecord(String name, float balance) {
        this.username = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d, username='%s', balance='%f'", id, username, balance);
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
