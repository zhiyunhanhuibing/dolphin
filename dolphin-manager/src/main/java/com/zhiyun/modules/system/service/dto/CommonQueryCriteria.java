package com.zhiyun.modules.system.service.dto;

import lombok.Data;
import com.zhiyun.annotation.Query;

/**
 * 公共查询类
 */
@Data
public class CommonQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String name;
}
