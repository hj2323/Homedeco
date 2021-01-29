package com.teamproject.teamproject01.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "tp_user")
public class User {
    @Id
    private String userId;
    private String userPassword;
    private String userTel;
    private String userEmail;
    private String userName;
    private String userZipcode;
    private String userAddress1;
    private String userAddress2;
    private Date userRegdate;
    private String userClass;
    private String userAuth;
    private int userBuyPoint;
}
