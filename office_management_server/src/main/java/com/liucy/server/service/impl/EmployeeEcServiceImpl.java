package com.liucy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liucy.server.mapper.EmployeeEcMapper;
import com.liucy.server.pojo.EmployeeEc;
import com.liucy.server.service.IEmployeeEcService;
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
public class EmployeeEcServiceImpl extends ServiceImpl<EmployeeEcMapper, EmployeeEc> implements IEmployeeEcService {

    @Autowired
    private EmployeeEcMapper employeeEcMapper;

    /**
     * 获取所有员工奖惩
     *
     * @return
     */
    @Override
    public List<EmployeeEc> getAllEmployeeEc() {
        return employeeEcMapper.getAllEmployeeEc();
    }
}
