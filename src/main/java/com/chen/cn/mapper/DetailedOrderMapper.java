package com.chen.cn.mapper;

import com.chen.cn.entity.DetailedOrder;
import com.chen.cn.entity.DetailedOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailedOrderMapper {
    int countByExample(DetailedOrderExample example);

    int deleteByExample(DetailedOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DetailedOrder record);

    int insertSelective(DetailedOrder record);

    List<DetailedOrder> selectByExample(DetailedOrderExample example);

    DetailedOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DetailedOrder record, @Param("example") DetailedOrderExample example);

    int updateByExample(@Param("record") DetailedOrder record, @Param("example") DetailedOrderExample example);

    int updateByPrimaryKeySelective(DetailedOrder record);

    int updateByPrimaryKey(DetailedOrder record);
}