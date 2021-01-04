package com.chen.cn.service;

import com.chen.cn.vo.PageVo;

import java.util.List;

/**
 * @Author Ll
 * @Date 2021/1/2 16:38
 */


public interface BaseService<T, ID> {

    /**
     * 增加
     *
     * @param t
     * @return
     */
    int addOne(T t);

    /**
     * 批量添加
     * @param list
     * @return
     */
    int addBatch(List<T> list);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteOne(ID id);

    /**
     * 批量删除
     * @param list
     * @return
     */
    int deleteBatch(List<ID> ids);

    /**
     * 更改
     *
     * @param t
     * @return
     */
    int updateOne(T t);


    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    T findById(ID id);

    /**
     * 分页查询
     *
     * @return
     */
    PageVo<T> findPage();

    /**
     * 分页条件查询
     *
     * @param example
     * @return
     */
    PageVo<T> findPage(Object example);

    /**
     * 封装分页查询数据
     *
     * @param list
     * @return
     */
    PageVo<T> setPageVo(List<T> list);
}
