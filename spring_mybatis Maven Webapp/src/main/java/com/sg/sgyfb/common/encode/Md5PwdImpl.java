/**
 * @package com.sg.common.encode
 * @description TODO
 * @author lizhe
 * @modify 2016年6月30日 下午8:22:42 
 */
package com.sg.sgyfb.common.encode;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Component;

/**
 * @（#) Md5PwdImpl
 * @description 使用Md5对密码进行加密
 * @author lizhe
 * @version
 * @modify 2016年6月30日
 */
@Component
public class Md5PwdImpl implements Md5Pwd {
	
	/**
	 * 对密码进行加密
	 */
	public String encode(String password) {
		String algorithm = "MD5";
		MessageDigest instance=null;

		try {
			 instance = MessageDigest.getInstance(algorithm);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 加密
		byte[] digest = instance.digest(password.getBytes());
		// 十六进制加密
		char[] encodeHex = Hex.encodeHex(digest);

		return new String(encodeHex);
		
		

	}
}
