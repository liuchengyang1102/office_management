package com.liucy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liucy.server.pojo.EmployeeEc;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface EmployeeEcMapper extends BaseMapper<EmployeeEc> {

    /**
     * 获取所有员工奖惩
     *
     * @return
     */
    List<EmployeeEc> getAllEmployeeEc();
}
