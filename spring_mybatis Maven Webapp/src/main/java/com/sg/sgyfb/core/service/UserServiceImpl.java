/**
 * @package com.sg.sgyfb.core.service
 * @description TODO
 * @author lizhe
 * @modify 2016年7月2日 下午9:06:02 
 */
package com.sg.sgyfb.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sg.sgyfb.core.bean.User;
import com.sg.sgyfb.core.bean.UserExample;
import com.sg.sgyfb.core.dao.UserMapper;

/**
 *@（#) UserServiceImpl
 *@description TODO
 *@author lizhe
 *@version
 *@modify 2016年7月2日 
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	/* 
	 * @see com.sg.sgyfb.core.service.UserService#countByExample(com.sg.sgyfb.core.bean.UserExample)
	 */
	@Override
	public int countByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.countByExample(example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#deleteByExample(com.sg.sgyfb.core.bean.UserExample)
	 */
	@Override
	public int deleteByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.deleteByExample(example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#insert(com.sg.sgyfb.core.bean.User)
	 */
	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#insertSelective(com.sg.sgyfb.core.bean.User)
	 */
	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#selectByExample(com.sg.sgyfb.core.bean.UserExample)
	 */
	@Override
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#updateByExampleSelective(com.sg.sgyfb.core.bean.User, com.sg.sgyfb.core.bean.UserExample)
	 */
	@Override
	public int updateByExampleSelective(User record, UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.updateByExampleSelective(record, example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#updateByExample(com.sg.sgyfb.core.bean.User, com.sg.sgyfb.core.bean.UserExample)
	 */
	@Override
	public int updateByExample(User record, UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.updateByExample(record, example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#updateByPrimaryKeySelective(com.sg.sgyfb.core.bean.User)
	 */
	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.UserService#updateByPrimaryKey(com.sg.sgyfb.core.bean.User)
	 */
	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

}
