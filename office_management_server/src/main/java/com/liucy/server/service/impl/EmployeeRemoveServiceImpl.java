package com.liucy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liucy.server.mapper.EmployeeRemoveMapper;
import com.liucy.server.pojo.EmployeeRemove;
import com.liucy.server.service.IEmployeeRemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
@Service
public class EmployeeRemoveServiceImpl extends ServiceImpl<EmployeeRemoveMapper, EmployeeRemove> implements IEmployeeRemoveService {

    @Autowired
    private EmployeeRemoveMapper employeeRemoveMapper;

    /**
     * 获取所有员工调动信息
     *
     * @return
     */
    @Override
    public List<EmployeeRemove> getAllEmployeeRemove() {
        return employeeRemoveMapper.getAllEmployeeRemove();
    }
}
