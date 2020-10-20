package com.dlm.xpjf.mapper;

import com.dlm.xpjf.pojo.SurnameInfo;
import com.dlm.xpjf.pojo.SurnameInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurnameInfoMapper {
    int countByExample(SurnameInfoExample example);

    int deleteByExample(SurnameInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SurnameInfo record);

    int insertSelective(SurnameInfo record);

    List<SurnameInfo> selectByExample(SurnameInfoExample example);

    SurnameInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SurnameInfo record, @Param("example") SurnameInfoExample example);

    int updateByExample(@Param("record") SurnameInfo record, @Param("example") SurnameInfoExample example);

    int updateByPrimaryKeySelective(SurnameInfo record);

    int updateByPrimaryKey(SurnameInfo record);
}