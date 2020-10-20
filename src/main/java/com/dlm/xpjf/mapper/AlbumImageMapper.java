package com.dlm.xpjf.mapper;

import com.dlm.xpjf.pojo.AlbumImage;
import com.dlm.xpjf.pojo.AlbumImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumImageMapper {
    int countByExample(AlbumImageExample example);

    int deleteByExample(AlbumImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlbumImage record);

    int insertSelective(AlbumImage record);

    List<AlbumImage> selectByExample(AlbumImageExample example);

    AlbumImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlbumImage record, @Param("example") AlbumImageExample example);

    int updateByExample(@Param("record") AlbumImage record, @Param("example") AlbumImageExample example);

    int updateByPrimaryKeySelective(AlbumImage record);

    int updateByPrimaryKey(AlbumImage record);
}