/**
 * @package com.sg.core.service.staticpage
 * @description TODO
 * @author lizhe
 * @modify 2016年6月28日 下午9:01:06 
 */
package com.sg.sgyfb.common.staticpage;

import java.util.Map;

/**
 * @（#) StaticPageService
 * @description TODO
 * @author lizhe
 * @version
 * @modify 2016年6月28日
 */
public interface StaticPageService {


	/**
	 * @description 静态化方法
	 * @param root
	 * void
	 * @throws 
	 * @author lizhe
	 */
	void productIndex(Map<String, Object> root, Integer id);
}
