package edu.byuh.AvalieSeuProfessor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import edu.byuh.AvalieSeuProfessor.model.User;

public class RateDaoImp implements RateDao{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<User> getListUsers(){
		List<User> users = new ArrayList<User>();
		String sql = "select * from user_table";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setF_name(rs.getString("f_name"));
				user.setL_name(rs.getString("l_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				users.add(user);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(conn != null){
					conn.close();
				}if(ps != null){
					ps.close();
				}if(rs != null){
					rs.close();
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return users;
	}
}
