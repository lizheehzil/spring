/**
 * @package com.sg.common.web
 * @description TODO
 * @author lizhe
 * @modify 2016年6月20日 下午8:54:40 
 */
package com.sg.sgyfb.common.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

/**
 * @（#) ResponseUtils
 * @description 异步返回各种格式
 * @author lizhe
 * @version
 * @modify 2016年6月20日
 */
public class ResponseUtils {
	// 发送内容
	public static void render(HttpServletResponse response, String contentType,
			String text) {

		response.setContentType(contentType);

		try {
			response.getWriter().write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//发送的是JSON
	public static void renderJson(HttpServletResponse response,String text){
		render(response, "application/json;charset-utf-8", text);
	}
	//发送的是xml
	public static void renderXml(HttpServletResponse response,String text){
		render(response, "text/xml;charset-utf-8", text);
	}
	//发送的是text
	public static void renderText(HttpServletResponse response,String text){
		render(response, "text/plain;charset-utf-8", text);
	}
}
