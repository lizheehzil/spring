/**
 * @package com.sg.common.junit
 * @description TODO
 * @author lizhe
 * @modify 2016年6月18日 上午10:18:13 
 */
package com.sg.sgyfb.common.junit;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *@（#) SpringJunitTest
 *@description Junit单元测试类 公共类
 *@author lizhe
 *@version
 *@modify 2016年6月18日 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class SpringJunitTest {

}
