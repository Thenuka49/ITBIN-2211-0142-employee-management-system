package Controller;

import Model.DBconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sheha
 */
public class DepBal {
    
    //create methodfor load,read data from employee table
    
    public List<DepBean> loadData(){
        List<DepBean> list = new ArrayList<DepBean>();
        try{
            //queryto select all data from employee table
            
            String query = "SELECT * FROM department";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("Id");
                String dName = rs.getString("DName");
                String dLocation = rs.getString("DLocation");
                
                

                DepBean bean = new DepBean(id, dName, dLocation);
                list.add(bean); 
                
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    //method for insert data
    public void insert(DepBean depBean){
        
        //inserting         
        try{
            //insert query
            String query = "INSERT INTO department VALUES (null, ?, ?)";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setString(1, depBean.getDepName());
            ps.setString(2, depBean.getDepLocation());
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted!!");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //method for get data on click in table
    
    public DepBean returnAllDataToTesxtFields(int id){
        DepBean bean = null;
        try {
            String query = "SELECT * FROM department WHERE Id = "+id;
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                int ids = rs.getInt("Id");
                String dName = rs.getString("DName");
                String dLocation = rs.getString("DLocation");
             
                bean = new DepBean(ids, dName, dLocation);
                
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
        
        //method for update
    public void updateDate(DepBean bean){
        try {
            String query = "UPDATE department SET DName = ?, DLocation = ?";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setString(1, bean.getDepName());
            ps.setString(2, bean.getDepLocation());
            
            ps.setInt(7, bean.getId());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been updated !!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //delete method
    public void deleteRecord(int id){
        try {
            String query = "DELETE FROM department WHERE Id = ?";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been deleted !!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    }

