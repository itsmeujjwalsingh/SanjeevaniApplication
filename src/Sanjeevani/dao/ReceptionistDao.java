/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sanjeevani.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.ReceptionistsPojo;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author acer
 */
public class ReceptionistDao {
     public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=? where receptionist_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
  public static void deleteReceptionist(String name)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Delete From RECEPTIONISTS where RECEPTIONISTS_NAME =?");
        ps.setString(1, name);
        ps.executeUpdate();
    }
  public static String getNewRecId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(receptionist_id) from receptionists");
   rs.next();
   int recId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       recId=Integer.parseInt(num)+1;
    }
   return "REC"+recId;
} 
  public static boolean addReceptionist(ReceptionistsPojo rec)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into receptionists values(?,?,?)");
     ps.setString(1,rec.getReceptionistId());
     ps.setString(2,rec.getReceptionistName());
     ps.setString(3,rec.getGender());
     
     return ps.executeUpdate()==1;
}
  public static List<ReceptionistsPojo> getAllReceptionistDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from receptionists order by receptionist_id");
    List<ReceptionistsPojo>recList=new ArrayList<>();
    while(rs.next()){
    ReceptionistsPojo recep=new ReceptionistsPojo();
    recep.setReceptionistId(rs.getString(1));
    recep.setReceptionistName(rs.getString(2));
    recep.setGender(rs.getString(3));
    recList.add(recep);
    
    }
    return recList;
} 
    public static boolean updateReceptionist(ReceptionistsPojo recp)throws SQLException{
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE RECEPTIONISTS SET RECEPTIONIST_NAME = ?, GENDER = ? WHERE RECEPTIONIST_ID = ?");
            ps.setString(1 , recp.getReceptionistName());           
            ps.setString(2 , recp.getGender());           
            ps.setString(3 , recp.getReceptionistId());           
            return ps.executeUpdate() == 1;
        }
        public static List<String> getAllReceptionistIds() throws SQLException{
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select RECEPTIONIST_ID From RECEPTIONISTS");
            List<String>list = new ArrayList();
            while(rs.next()){
                list.add(rs.getString(1));
            }
            return list;
        }
  
    public static boolean deleteReceptionistById(String recpId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select RECEPTIONIST_NAME from  receptionists where receptionist_id=?");
     ps.setString(1, recpId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String recpName=rs.getString(1);
     UserDao.deleteUserByName(recpName);
     ps=conn.prepareStatement("Delete from receptionists where receptionist_id=?");
     ps.setString(1, recpId);
     return ps.executeUpdate()==1;
}    
    public static ReceptionistsPojo getReceptionistDetails(String ReceptionistId)throws SQLException
    {
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from receptionists where receptionist_id=?");
    ps.setString(1,ReceptionistId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    ReceptionistsPojo recp=new ReceptionistsPojo();
    recp.setReceptionistId(rs.getString(1));
    recp.setReceptionistName(rs.getString(2));
    recp.setGender(rs.getString(3));
    
    return recp;
    
   } 
  
}
