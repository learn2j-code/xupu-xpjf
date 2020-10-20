package com.dlm.xpjf.mapper;

import com.dlm.xpjf.pojo.HouseholdInfo;
import com.dlm.xpjf.pojo.HouseholdInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholdInfoMapper {
    int countByExample(HouseholdInfoExample example);

    int deleteByExample(HouseholdInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdInfo record);

    int insertSelective(HouseholdInfo record);

    List<HouseholdInfo> selectByExample(HouseholdInfoExample example);

    HouseholdInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseholdInfo record, @Param("example") HouseholdInfoExample example);

    int updateByExample(@Param("record") HouseholdInfo record, @Param("example") HouseholdInfoExample example);

    int updateByPrimaryKeySelective(HouseholdInfo record);

    int updateByPrimaryKey(HouseholdInfo record);
}