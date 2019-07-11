package com.zhiyun.modules.system.service.mapper;

import com.zhiyun.mapper.EntityMapper;
import com.zhiyun.modules.system.domain.Job;
import com.zhiyun.modules.system.service.dto.JobSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2019-03-29
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobSmallMapper extends EntityMapper<JobSmallDTO, Job> {

}