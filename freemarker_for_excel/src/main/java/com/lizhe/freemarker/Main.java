package com.lizhe.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.Map;

/**
 * Created by lizhe on 2016/9/8.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.ouputFile("excel.html","excel.xls", null);
    }

    /**
     * ftl是freemarker的后缀名
     * @param ftlName:模板的名字（模子）已知
     * @param fileName:生成之后页面的名字（月饼）未知
     * @param map:数据（面）已知
     * @throws Exception
     */
    public void ouputFile(String ftlName, String fileName,  Map<String, Object> map) throws Exception{
        //创建fm的配置
        Configuration config = new Configuration(Configuration.VERSION_2_3_23);
        //指定默认编码格式
        config.setDefaultEncoding("UTF-8");
        //设置模板的包路径
        config.setDirectoryForTemplateLoading(new File("freemarker_for_excel/ftl/"));
        //不记录freemarker异常, 因为会抛出的到处都是
        config.setLogTemplateExceptions(false);
        //获得包的模板
        Template template = config.getTemplate(ftlName);
        //指定文件输出的路径
        String path = "freemarker_for_excel/file";
        //定义输出流，注意的必须指定编码
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path+"/"+fileName)),"UTF-8"));
        //生成模板
        template.process(map, writer);
    }
}
