package com.zhiyun.service.dto;

import lombok.Data;
import com.zhiyun.annotation.Query;

/**
 * 日志查询类
 * @author
 * @date 2019-6-4 09:23:07
 */
@Data
public class LogQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String username;

    @Query
    private String logType;

    @Query(type = Query.Type.INNER_LIKE)
    private String description;
}
