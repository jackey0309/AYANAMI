package com.whoiszxl.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.whoiszxl.common.ServerResponse;
import com.whoiszxl.entity.User;
import com.whoiszxl.vo.UserVo;

/**
 * 用户操作服务
 * @author whoiszxl
 *
 */
public interface UserService {
	
	
	ServerResponse<User> login(String username,String password);
	
	ServerResponse<String> jwt_login(String username,String password);
	
	ServerResponse<String> register(User user);
	
	ServerResponse<String> checkVaild(String str,String type);
	
	ServerResponse<String> selectQuestion(String username);
	
	ServerResponse<String> checkAnswer(String username,String question,String answer);
	
	ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);
	
	ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);
	
	ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);

    ServerResponse checkAdminRole(User user);

	ServerResponse<PageInfo> getUserList(int pageNum, int pageSize);

	int selectUserCount();

	ServerResponse<UserVo> app_login(String username, String password, String pushId);

	ServerResponse<String> app_register(String username, String password, String verifyCode);

	ServerResponse<String> forgetPwd(String phone, String verifyCode);

	ServerResponse<String> resetPwd(String phone, String password, String verifyCode);
	
}
