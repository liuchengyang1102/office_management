package com.liucy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liucy.server.pojo.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 刘呈洋
 * @since 2022-03-18
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    /**
     * 更新操作员角色
     *
     * @param adminId
     * @param rids
     */
    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
