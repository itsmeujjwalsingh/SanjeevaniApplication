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
public class UserPojo {

    public UserPojo(String loginID, String username, String userpassword, String usertype) {
        this.loginID = loginID;
        this.username = username;
        this.userpassword = userpassword;
        this.usertype = usertype;
    }
    public UserPojo(){
        
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    private String loginID;
    private String username;
    private String userpassword;
    private String usertype;
    
}
