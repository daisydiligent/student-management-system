package com.studentmanagement.student_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int roleid;
   private String rolename;

   @Column(name = "role_id")
    public int getRoleId(){
        return roleid;
    }

    public void setRoleId(int roleid){
        this.roleid = roleid;
    }
    @Column(name = "role_name", nullable=false, unique = true)
    public String getRoleName(){
        return rolename;
    }

    public void setRoleName(String rolename){
        this.rolename = rolename;
    }
}
