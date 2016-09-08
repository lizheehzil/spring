/**
 * @package com.sg.sgyfb.core.service
 * @description TODO
 * @author lizhe
 * @modify 2016年7月2日 下午9:05:26 
 */
package com.sg.sgyfb.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sg.sgyfb.core.bean.Authority;
import com.sg.sgyfb.core.bean.AuthorityExample;
import com.sg.sgyfb.core.dao.AuthorityMapper;

/**
 *@（#) AuthorityServiceImpl
 *@description TODO
 *@author lizhe
 *@version
 *@modify 2016年7月2日 
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Resource
	private AuthorityMapper AuthorityMapper;
	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#countByExample(com.sg.sgyfb.core.bean.AuthorityExample)
	 */
	@Override
	public int countByExample(AuthorityExample example) {
		// TODO Auto-generated method stub
		return AuthorityMapper.countByExample(example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#deleteByExample(com.sg.sgyfb.core.bean.AuthorityExample)
	 */
	@Override
	public int deleteByExample(AuthorityExample example) {
		// TODO Auto-generated method stub
		return AuthorityMapper.deleteByExample(example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return AuthorityMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#insert(com.sg.sgyfb.core.bean.Authority)
	 */
	@Override
	public int insert(Authority record) {
		// TODO Auto-generated method stub
		return AuthorityMapper.insert(record);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#insertSelective(com.sg.sgyfb.core.bean.Authority)
	 */
	@Override
	public int insertSelective(Authority record) {
		// TODO Auto-generated method stub
		return AuthorityMapper.insertSelective(record);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#selectByExample(com.sg.sgyfb.core.bean.AuthorityExample)
	 */
	@Override
	public List<Authority> selectByExample(AuthorityExample example) {
		// TODO Auto-generated method stub
		return AuthorityMapper.selectByExample(example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Authority selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return AuthorityMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#updateByExampleSelective(com.sg.sgyfb.core.bean.Authority, com.sg.sgyfb.core.bean.AuthorityExample)
	 */
	@Override
	public int updateByExampleSelective(Authority record, AuthorityExample example) {
		// TODO Auto-generated method stub
		return AuthorityMapper.updateByExampleSelective(record, example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#updateByExample(com.sg.sgyfb.core.bean.Authority, com.sg.sgyfb.core.bean.AuthorityExample)
	 */
	@Override
	public int updateByExample(Authority record, AuthorityExample example) {
		// TODO Auto-generated method stub
		return AuthorityMapper.updateByExample(record, example);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#updateByPrimaryKeySelective(com.sg.sgyfb.core.bean.Authority)
	 */
	@Override
	public int updateByPrimaryKeySelective(Authority record) {
		// TODO Auto-generated method stub
		return AuthorityMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see com.sg.sgyfb.core.service.AuthorityService#updateByPrimaryKey(com.sg.sgyfb.core.bean.Authority)
	 */
	@Override
	public int updateByPrimaryKey(Authority record) {
		// TODO Auto-generated method stub
		return AuthorityMapper.updateByPrimaryKey(record);
	}

}

