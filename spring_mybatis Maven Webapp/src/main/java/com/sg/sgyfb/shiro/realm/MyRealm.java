/**
 * @package com.sg.sgyfb.shiro.realm
 * @description TODO
 * @author lizhe
 * @modify 2016年7月2日 下午5:01:16 
 */
package com.sg.sgyfb.shiro.realm;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sg.sgyfb.core.bean.Authority;
import com.sg.sgyfb.core.bean.User;
import com.sg.sgyfb.core.bean.UserExample;
import com.sg.sgyfb.core.bean.UserExample.Criteria;
import com.sg.sgyfb.core.service.AuthorityService;
import com.sg.sgyfb.core.service.UserService;

/**
 * @（#) MyRealm
 * @description 配置授权和认证
 * @author lizhe
 * @version
 * @modify 2016年7月2日
 */
@Component
public class MyRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;
	@Autowired
	private AuthorityService authorityService;

	/**
	 * 授权方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
		// TODO Auto-generated method stub
		String username = (String) pc.fromRealm(getName()).iterator().next();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		if (StringUtils.isNotBlank(username)) {
			UserExample userExample = new UserExample();
			Criteria userCriteria = userExample.createCriteria();
			userCriteria.andUsernameEqualTo(username);

			List<User> users = userService.selectByExample(userExample);
			Authority authority = authorityService.selectByPrimaryKey(users
					.get(0).getAuthorityId());

			info.addRole(authority.getName());
			return info;
		}
		return info;
	}

	/**
	 * 认证方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken upt = (UsernamePasswordToken) token;

		String username = upt.getUsername();
		UserExample userExample = new UserExample();
		Criteria userCriteria = userExample.createCriteria();
		userCriteria.andUsernameEqualTo(username);
		List<User> users = userService.selectByExample(userExample);

		// 登录的主要信息:可以是一个实体类的对象,但该实体类的对象一定是根据 token 的username 查询的到的
		Object principal = token.getPrincipal();
		String credentials = users.get(0).getPassword();
		String realmName = getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal,
				credentials, realmName);
		return info;
	}

}
