/**
 * @package com.sg.common.web.session
 * @description TODO
 * @author lizhe
 * @modify 2016年6月29日 下午4:52:04 
 */
package com.sg.sgyfb.common.web.session;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

/**
 * @（#) SessionProvider
 * @description 提供session
 * @author lizhe
 * @version
 * @modify 2016年6月29日
 */
public interface SessionProvider {
	/**
	 * 
	 * @description 往Session中设置值
	 * @param request
	 * @param name
	 * @param value
	 *            void
	 * @throws
	 * @author lizhe
	 */
	public void setAttribute(HttpServletRequest request, String name,
			Serializable value);

	/**
	 * 
	 * @description 从Session中取值
	 * @param request
	 * @param name
	 * @return Serializable
	 * @throws
	 * @author lizhe
	 */
	public Serializable getAttribute(HttpServletRequest request, String name);

	/**
	 * 
	 * @description 退出登录
	 * @param request
	 *            void
	 * @throws
	 * @author lizhe
	 */
	public void logout(HttpServletRequest request);

	/**
	 * 
	 * @description 获取SessionId
	 * @param request
	 * @return String
	 * @throws
	 * @author lizhe
	 */
	public String getSessionId(HttpServletRequest request);
}
