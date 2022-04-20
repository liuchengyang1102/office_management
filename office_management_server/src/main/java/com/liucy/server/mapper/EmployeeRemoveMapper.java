package com.liucy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liucy.server.pojo.EmployeeRemove;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface EmployeeRemoveMapper extends BaseMapper<EmployeeRemove> {

    /**
     * 获取所有员工调动信息
     *
     * @return
     */
    List<EmployeeRemove> getAllEmployeeRemove();
}
