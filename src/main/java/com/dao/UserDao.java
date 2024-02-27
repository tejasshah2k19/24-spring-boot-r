package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate stmt;

	public void addUser(UserBean user) {
		stmt.update("insert into users (firstName,email,password) values (?,?,?)", user.getFirstName(), user.getEmail(),
				user.getPassword());
	}

	public List<UserBean> getAllUsers() {
		return stmt.query("select * from users", new BeanPropertyRowMapper<UserBean>(UserBean.class));
	}

	public UserBean getUserById(Integer userId) {
		return stmt.queryForObject("select * from users where userId = ? ", new BeanPropertyRowMapper<UserBean>(UserBean.class),new Object[] {userId});
	}

	public void deleteUserById(Integer userId) {
		stmt.update("delete from users where userId = ? ",userId);
	}

	public void updateUser(UserBean user) {
		stmt.update("update users set firstName = ? where userId = ? ",user.getFirstName(),user.getUserId());
		
	}
}
