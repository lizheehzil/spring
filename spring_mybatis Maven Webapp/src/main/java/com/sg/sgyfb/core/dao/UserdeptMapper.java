package com.sg.sgyfb.core.dao;

import com.sg.sgyfb.core.bean.Userdept;
import com.sg.sgyfb.core.bean.UserdeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserdeptMapper {
    int countByExample(UserdeptExample example);

    int deleteByExample(UserdeptExample example);

    int deleteByPrimaryKey(String keyid);

    int insert(Userdept record);

    int insertSelective(Userdept record);

    List<Userdept> selectByExample(UserdeptExample example);

    Userdept selectByPrimaryKey(String keyid);

    int updateByExampleSelective(@Param("record") Userdept record, @Param("example") UserdeptExample example);

    int updateByExample(@Param("record") Userdept record, @Param("example") UserdeptExample example);

    int updateByPrimaryKeySelective(Userdept record);

    int updateByPrimaryKey(Userdept record);
}