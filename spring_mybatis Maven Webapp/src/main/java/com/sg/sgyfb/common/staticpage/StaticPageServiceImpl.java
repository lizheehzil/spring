/**
 * @package com.sg.core.service.staticpage
 * @description TODO
 * @author lizhe
 * @modify 2016年6月28日 下午9:00:11 
 */
package com.sg.sgyfb.common.staticpage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * @（#) StaticPageServiceImpl
 * @description 生成静态页实现类
 * @author lizhe
 * @version
 * @modify 2016年6月28日
 */
public class StaticPageServiceImpl implements StaticPageService,
		ServletContextAware {

	private Configuration conf;

	public void setFreeMarkerConfigurer(
			FreeMarkerConfigurer freeMarkerConfigurer) {
		this.conf = freeMarkerConfigurer.getConfiguration();
	}

	/*
	 * @see com.sg.core.service.staticpage.StaticPageService#productIndex()
	 */
	@Override
	public void productIndex(Map<String, Object> root,Integer id) {
		// 输出流
		Writer out = null;
		try {
			// 获取html路径
			String path = getPath("/html/product/"+id+".html");

			File f = new File(path);
			File parentFile = f.getParentFile();
			if (!parentFile.exists()) {
				parentFile.mkdirs();
			}
			// 输出流
			out = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
			// 读进来 UTF-8
			Template template = conf.getTemplate("productDetail.html");

			// 处理模板
			template.process(root, out);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// 获取路径
	public String getPath(String name) {
		return servletContext.getRealPath(name);
	}

	private ServletContext servletContext;

	/*
	 * @see
	 * org.springframework.web.context.ServletContextAware#setServletContext
	 * (javax.servlet.ServletContext)
	 */
	@Override
	public void setServletContext(ServletContext servletContext) {
		// TODO Auto-generated method stub
		this.servletContext = servletContext;
	}

}
