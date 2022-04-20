package com.liucy.server.controller;


import com.liucy.server.pojo.EmployeeEc;
import com.liucy.server.service.IEmployeeEcService;
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
@RequestMapping("/personnel/ec")
public class EmployeeEcController {

    @Autowired
    private IEmployeeEcService employeeEcService;

    @ApiOperation("获取所有员工奖惩")
    @GetMapping("/")
    public List<EmployeeEc> getAllEmployeeEc() {
        return employeeEcService.getAllEmployeeEc();
    }

}
