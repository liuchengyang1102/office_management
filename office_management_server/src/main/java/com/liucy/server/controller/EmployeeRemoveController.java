package com.liucy.server.controller;


import com.liucy.server.pojo.Employee;
import com.liucy.server.pojo.EmployeeRemove;
import com.liucy.server.service.IEmployeeRemoveService;
import com.liucy.server.utils.RespBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
        return employeeRemoveService.getAllEmployeeRemove();
    }

    @ApiOperation("添加员工调动信息")
    @PostMapping("/")
    public RespBean addEmployeeRemove(@RequestBody Employee employee) {
        EmployeeRemove remove = new EmployeeRemove();
        remove.setEid(employee.getId());
        remove.setAfterDepId(employee.getDepartmentId());
        remove.setAfterJobId(employee.getPosId());
        remove.setRemoveDate(LocalDate.now());
        if (employeeRemoveService.save(remove)) {
            return RespBean.success("添加员工调动信息成功！");
        } else {
            return RespBean.error("添加员工调动信息失败！");
        }
    }
}
