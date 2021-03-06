package com.xiaoyao.hy;

import java.util.List;

import com.xiaoyao.hy.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
	@Select("SELECT * FROM hy_user")
	List<User> findAll();
	
	@Select("SELECT * FROM hy_user WHERE susername=#{susername}")
	User findByUserName(String susername);
}
