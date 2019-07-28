package com.zhiyun.service.dto;

import lombok.Data;
import com.zhiyun.annotation.Query;

/**
 * @author
 * @date 2019-6-4 09:54:37
 */
@Data
public class QiniuQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String key;
}
