package com.liucy.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucy.server.pojo.EmployeeEc;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface IEmployeeEcService extends IService<EmployeeEc> {

    /**
     * 获取所有员工奖惩
     *
     * @return
     */
    List<EmployeeEc> getAllEmployeeEc();
}
