package com.github.lyd.sys.producer.mapper;

import com.github.lyd.common.mapper.CrudMapper;
import com.github.lyd.sys.client.entity.SystemRole;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author liuyadu
 */
@Repository
public interface SystemRoleMapper extends CrudMapper<SystemRole> {

    List<SystemRole> selectRoleList(Map params);
}