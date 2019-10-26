package com.zsf.xxx.mapper;

import com.zsf.xxx.model.GlobCode;
import com.zsf.xxx.model.GlobCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GlobCodeMapper {
    int countByExample(GlobCodeExample example);

    int deleteByExample(GlobCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GlobCode record);

    int insertSelective(GlobCode record);

    List<GlobCode> selectByExample(GlobCodeExample example);

    GlobCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GlobCode record, @Param("example") GlobCodeExample example);

    int updateByExample(@Param("record") GlobCode record, @Param("example") GlobCodeExample example);

    int updateByPrimaryKeySelective(GlobCode record);

    int updateByPrimaryKey(GlobCode record);
}