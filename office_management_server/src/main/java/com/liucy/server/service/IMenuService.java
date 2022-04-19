package com.liucy.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucy.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 通过用户Id查询菜单列表
     *
     * @return
     */
    List<Menu> getMenusByAdminId();

    /**
     * 根据角色获取菜单列表
     *
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     *
     * @return
     */
    List<Menu> getAllMenus();
}
