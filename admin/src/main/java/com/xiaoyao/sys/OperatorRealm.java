package com.xiaoyao.sys;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.xiaoyao.hy.User;

@Component
public class OperatorRealm extends AbstractUserRealm {

	@Override
	public UserRolesAndPermissions doGetGroupAuthorizationInfo(Operator operator) {
		Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //TODO 获取当前用户下拥有的所有角色列表,及权限
        return new UserRolesAndPermissions(userRoles, userPermissions);
	}

	@Override
	public UserRolesAndPermissions doGetRoleAuthorizationInfo(Operator operator) {
		Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //TODO 获取当前用户下拥有的所有角色列表,及权限
        return new UserRolesAndPermissions(userRoles, userPermissions);
	}

}