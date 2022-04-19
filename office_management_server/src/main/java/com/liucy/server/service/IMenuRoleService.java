package com.liucy.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liucy.server.pojo.MenuRole;
import com.liucy.server.utils.RespBean;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     *
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
