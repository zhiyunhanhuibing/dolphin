package com.zhiyun.modules.system.service.mapper;

import com.zhiyun.mapper.EntityMapper;
import com.zhiyun.modules.system.domain.Role;
import com.zhiyun.modules.system.service.dto.RoleDTO;
import com.zhiyun.modules.system.service.dto.RoleSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author Zheng Jie
 * @date 2019-5-23
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleSmallMapper extends EntityMapper<RoleSmallDTO, Role> {

}
