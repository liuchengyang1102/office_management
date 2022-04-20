package com.liucy.server.controller;


import com.liucy.server.pojo.EmployeeTrain;
import com.liucy.server.service.IEmployeeTrainService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
@RestController
@RequestMapping("/personnel/train")
public class EmployeeTrainController {

    @Autowired
    private IEmployeeTrainService employeeTrainService;

    @ApiOperation("获取所有员工培训")
    @GetMapping("/")
    public List<EmployeeTrain> getAllEmployeeTrain() {
        return employeeTrainService.list();
    }
}
