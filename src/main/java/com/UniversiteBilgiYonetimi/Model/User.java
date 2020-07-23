package com.UniversiteBilgiYonetimi.Model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "EMAIL")
    private String email;


    @Column(name = "PASSWORD")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "USER_ROLES",
            joinColumns = { @JoinColumn(name = "USER_ID") },
            inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") }
    )
    private Set<Role> Roles= new HashSet<>();


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return Roles;
    }

    public void setRoles(Set<Role> roles) {
        Roles = roles;
    }
}
