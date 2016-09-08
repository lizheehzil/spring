import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sg.sgyfb.common.junit.SpringJunitTest;

/**
 * @package 
 * @description TODO
 * @author SGYFB
 * @modify 2016年7月10日 下午10:40:01 
 */

/**
 *@（#) Sdfdf
 *@description TODO
 *@author SGYFB
 *@version
 *@modify 2016年7月10日 
 */
public class Sdfdf extends SpringJunitTest {

	@Autowired
	DataSource dataSource;
	@Test
	public void test() throws Exception {
		System.out.println(dataSource.getConnection());
	}

}
