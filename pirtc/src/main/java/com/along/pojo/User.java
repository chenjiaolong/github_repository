package com.along.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/1 0:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  int userId;
    private String userPhone;
    private String userEmail;
    private String userPassword;
    private String userName;
    private String userSection;
    private Integer userJob;

    public User(String userPhone, String userEmail, String userPassword, String userName, String userSection, Integer userJob) {
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userSection = userSection;
        this.userJob = userJob;
    }
}