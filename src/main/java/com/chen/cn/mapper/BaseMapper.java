package com.chen.cn.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Ll
 * @Date 2021/1/2 16:15
 */

/*ID Long int double*/
public interface BaseMapper<T,ID> {
    /*example parametertype*/
    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
