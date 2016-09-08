/**
 * @package com.sg.sgyfb.core.controller
 * @description TODO
 * @author lizhe
 * @modify 2016年7月1日 下午2:15:09 
 */
package com.sg.sgyfb.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sg.sgyfb.common.web.session.SessionProvider;
import com.sg.sgyfb.core.bean.User;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@（#) TestController
 *@description TODO
 *@author lizhe
 *@version
 *@modify 2016年7月1日 
 */
@Controller
public class TestController {

	 static final Logger log = LogManager.getLogger(TestController.class.getName());
	@Autowired
	 private SessionProvider sessionProvider;
	
	
	
	@RequestMapping(value="shiro-login.shtml")
	public String login(String username,String pwd,HttpServletRequest request){
		
		
		
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(username, pwd);
		
		try {
			subject.login(token);
			
			User user = new User();
			user.setPassword(pwd);
			user.setUsername(username);
			sessionProvider.setAttribute(request, "user", user);
			/**/
        } catch (AuthenticationException ae) {
        	System.out.println(ae.getMessage());
          return "erro";
        } 
		
		return "success";
		
	}
	@RequestMapping(value="/success.shtml")
	public String success(){
		return "success";
	}
	
	@RequestMapping("/testisture.shtml")
	public String sssssss(Boolean ture){
		System.out.println(ture);
		System.out.print("lizhe");
		System.out.print("");
		return "";
	}

	@RequestMapping("/erro.shtml")
	@ResponseBody
	public String erro(){

		return "lizhe";
	}
}
