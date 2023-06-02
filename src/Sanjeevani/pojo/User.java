/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevani.pojo;

/**
 *
 * @author acer
 */
public class User {

    public User(String loginId, String password, String userType) {
        this.loginId = loginId;
        this.password = password;
        this.userType = userType;
    }
    public User(){
        
    }
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
 private String loginId;
 private String password;
 private String userType;
}