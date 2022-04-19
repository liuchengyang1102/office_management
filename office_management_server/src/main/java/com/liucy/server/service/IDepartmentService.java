package com.liucy.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucy.server.pojo.Department;
import com.liucy.server.utils.RespBean;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     *
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     *
     * @param department
     * @return
     */
    RespBean addDepartment(Department department);

    /**
     * 删除部门
     *
     * @param id
     * @return
     */
    RespBean deleteDepartment(Integer id);
}
