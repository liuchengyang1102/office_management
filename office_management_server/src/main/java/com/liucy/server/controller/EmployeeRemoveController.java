package com.liucy.server.controller;


import com.liucy.server.pojo.EmployeeRemove;
import com.liucy.server.service.IEmployeeRemoveService;
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
@RequestMapping("/personnel/remove")
public class EmployeeRemoveController {

    @Autowired
    private IEmployeeRemoveService employeeRemoveService;

    @ApiOperation("获取所有员工调动信息")
    @GetMapping("/")
    public List<EmployeeRemove> getAllEmployeeRemove() {
        return employeeRemoveService.list();
    }
}
