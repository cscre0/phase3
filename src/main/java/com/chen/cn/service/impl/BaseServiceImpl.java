package com.chen.cn.service.impl;

import com.chen.cn.mapper.BaseMapper;
import com.chen.cn.service.BaseService;
import com.chen.cn.utils.ReflectionUtils;
import com.chen.cn.vo.PageVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Ll
 * @Date 2021/1/2 16:55
 */

@Service
@Transactional
public class BaseServiceImpl<T,ID> implements BaseService<T,ID> {

    @Autowired
    private BaseMapper<T,ID> baseMapper;

    @Override
    public int addOne(T t) {
        ReflectionUtils.invokeMethod(t,"setDate",null, null);
        System.out.println("add: "+t.toString());
        return baseMapper.insert(t);
    }

    @Override
    public int addBatch(List<T> list) {
        list.forEach(i->{
            baseMapper.insert(i);
            ReflectionUtils.invokeMethod(i,"setDate",null, null);
        });
        return 1;
    }

    @Override
    public int deleteOne(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteBatch(List<ID> ids) {
        ids.forEach(i->{
            baseMapper.deleteByPrimaryKey(i);
        });
        return 1;
    }

    @Override
    public int updateOne(T t) {
        ReflectionUtils.invokeMethod(t,"setDate",null, null);
        System.out.println("update: "+t.toString());
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageVo<T> findPage() {
        return setPageVo(baseMapper.selectByExample(null));
    }

    @Override
    public PageVo<T> setPageVo(List<T> list) {
        PageInfo pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setTotal(total);
        pageVo.setData(list);
        return pageVo;
    }
}
