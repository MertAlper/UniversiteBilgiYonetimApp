package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;

    @Column(name = "ROLE_NAME")
    private String roleName;


    @ManyToMany(mappedBy = "Roles")
    private Set<User> Users =new HashSet<>();

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUsers() {
        return Users;
    }

    public void setUsers(Set<User> users) {
        Users = users;
    }
}
