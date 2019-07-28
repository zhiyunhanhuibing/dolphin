package com.zhiyun.modules.system.service.mapper;

import com.zhiyun.modules.system.domain.Permission;
import com.zhiyun.mapper.EntityMapper;
import com.zhiyun.modules.system.service.dto.PermissionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author
 * @date 2018-11-23
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {

}
