package com.zhiyun.repository;

import com.zhiyun.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author
 * @date 2018-12-26
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
