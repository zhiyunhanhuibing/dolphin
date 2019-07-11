package com.zhiyun.modules.system.service.mapper;

import com.zhiyun.mapper.EntityMapper;
import com.zhiyun.modules.system.domain.Dept;
import com.zhiyun.modules.system.service.dto.DeptSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends EntityMapper<DeptSmallDTO, Dept> {

}