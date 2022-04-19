package com.liucy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liucy.server.pojo.Role;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询角色列表
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
