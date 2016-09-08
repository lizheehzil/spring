/**
 * @package com.sg.common.web.session
 * @description TODO
 * @author lizhe
 * @modify 2016年6月29日 下午4:52:25 
 */
package com.sg.sgyfb.common.web.session;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @（#) HttpSessionProvider
 * @description 本地session
 * @author lizhe
 * @version
 * @modify 2016年6月29日
 */
public class HttpSessionProvider implements SessionProvider {

	/*
	 * @see
	 * com.sg.common.web.session.SessionProvider#setAttribute(javax.servlet.
	 * http.HttpServletRequest, java.lang.String, java.io.Serializable)
	 */
	@Override
	public void setAttribute(HttpServletRequest request, String name,
			Serializable value) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.setAttribute(name, value);
	}

	/*
	 * @see
	 * com.sg.common.web.session.SessionProvider#getAttribute(javax.servlet.
	 * http.HttpServletRequest, java.lang.String)
	 */
	@Override
	public Serializable getAttribute(HttpServletRequest request, String name) {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession(false);
		if (session != null) {
			return (Serializable) session.getAttribute(name);
		}
		return null;
	}

	/*
	 * @see com.sg.common.web.session.SessionProvider#logout(javax.servlet.http.
	 * HttpServletRequest)
	 */
	@Override
	public void logout(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
	}

	/*
	 * @see
	 * com.sg.common.web.session.SessionProvider#getSessionId(javax.servlet.
	 * http.HttpServletRequest)
	 */
	@Override
	public String getSessionId(HttpServletRequest request) {
		// TODO Auto-generated method stub

		return request.getSession().getId();
		
	}

}
