/**
 * @package com.sg.core.web
 * @description TODO
 * @author lizhe
 * @modify 2016年6月18日 下午5:24:12 
 */
package com.sg.sgyfb.common.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * @（#) CustomDateEdtor
 * @description 全局日期转换器
 * @author lizhe
 * @version
 * @modify 2016年6月18日
 */
public class CustomDateEdtor implements WebBindingInitializer {

	/*
	 * @see
	 * org.springframework.web.bind.support.WebBindingInitializer#initBinder
	 * (org.springframework.web.bind.WebDataBinder,
	 * org.springframework.web.context.request.WebRequest)
	 */
	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}

}
