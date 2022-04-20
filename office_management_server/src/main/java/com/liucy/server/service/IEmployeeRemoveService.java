package com.liucy.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucy.server.pojo.EmployeeRemove;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface IEmployeeRemoveService extends IService<EmployeeRemove> {

    /**
     * 获取所有员工调动信息
     *
     * @return
     */
    List<EmployeeRemove> getAllEmployeeRemove();
}
