package com.zhiyun.repository;

import com.zhiyun.domain.AlipayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author
 * @date 2018-12-31
 */
public interface AlipayRepository extends JpaRepository<AlipayConfig,Long> {
}
