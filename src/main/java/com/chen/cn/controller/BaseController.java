package com.chen.cn.controller;

import com.chen.cn.dto.AxiosResult;
import com.chen.cn.service.BaseService;
import com.chen.cn.utils.ReflectionUtils;
import com.chen.cn.vo.PageVo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Ll
 * @Date 2021/1/2 17:44
 */

public class BaseController<T, ID> {

    @Autowired
    private BaseService<T, ID> baseService;

    @GetMapping()
    public AxiosResult<PageVo<T>> findPage(@RequestParam(defaultValue = "1") int currentPage,
                                           @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<T> pageVo = baseService.findPage();
        return AxiosResult.success(pageVo);
    }

    @GetMapping("{id}")
    public AxiosResult<T> findById(@PathVariable ID id) {
        return AxiosResult.success(baseService.findById(id));
    }

    @PostMapping()
    public AxiosResult<Void> addOne(@RequestBody T t) {
        return intAxios(baseService.addOne(t));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteOrders(@PathVariable List<ID> ids) {
        return intAxios(baseService.deleteBatch(ids));
    }

    @PutMapping()
    public AxiosResult<Void> updateOne(@RequestBody T t) {
        return intAxios(baseService.updateOne(t));
    }

    public AxiosResult<Void> intAxios(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.fail();
    }

}
