package Sanjeevani.dao;

import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.User;
import Sanjeevani.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao 
{
     public static String validateUser(User user) throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1, user.getLoginId());
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getUserType());
         ResultSet rs=ps.executeQuery();
         String name=null;
         if(rs.next()){
             name=rs.getString("user_name");
         }
         return name;
   }
     public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
     public static boolean addUser(UserPojo user)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into users values(?,?,?,?)");
     ps.setString(1, user.getLoginID());
     ps.setString(2, user.getUsername());
     ps.setString(3, user.getUserpassword());
     ps.setString(4, user.getUsertype());
     
     return ps.executeUpdate()==1;
}
     public static void deleteUserByName(String name)throws SQLException{
        Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     ps.executeUpdate();
}
      public static boolean updateUser(UserPojo user , String prevName)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE USERS SET USER_NAME = ? , LOGIN_ID = ? , PASSWORD = ? WHERE USER_NAME = ?");
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getLoginID());
        ps.setString(3, user.getUserpassword());
        ps.setString(4, prevName);
        return ps.executeUpdate() == 1;
    }
    
    public static UserPojo getUserDetailsByName(String name)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT LOGIN_ID, USER_NAME, PASSWORD FROM USERS WHERE USER_NAME= ?");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        UserPojo user = new UserPojo();
        if(rs.next()){
            user.setLoginID(rs.getString(1));
            user.setUsername(rs.getString(2));
            user.setUserpassword(rs.getString(3)); 
        }
        return user;
    }
}