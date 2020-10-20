package com.dlm.xpjf.mapper;

import com.dlm.xpjf.pojo.HouseholdAlbum;
import com.dlm.xpjf.pojo.HouseholdAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholdAlbumMapper {
    int countByExample(HouseholdAlbumExample example);

    int deleteByExample(HouseholdAlbumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdAlbum record);

    int insertSelective(HouseholdAlbum record);

    List<HouseholdAlbum> selectByExample(HouseholdAlbumExample example);

    HouseholdAlbum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HouseholdAlbum record, @Param("example") HouseholdAlbumExample example);

    int updateByExample(@Param("record") HouseholdAlbum record, @Param("example") HouseholdAlbumExample example);

    int updateByPrimaryKeySelective(HouseholdAlbum record);

    int updateByPrimaryKey(HouseholdAlbum record);
}