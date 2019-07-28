package com.zhiyun.modules.system.service.mapper;

import com.zhiyun.mapper.EntityMapper;
import com.zhiyun.modules.system.domain.Dict;
import com.zhiyun.modules.system.service.dto.DictDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author
* @date 2019-04-10
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictMapper extends EntityMapper<DictDTO, Dict> {

}