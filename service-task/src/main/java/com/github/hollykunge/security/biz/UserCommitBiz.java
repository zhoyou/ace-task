package com.github.hollykunge.security.biz;

import com.github.hollykunge.security.common.biz.BaseBiz;
import com.github.hollykunge.security.entity.UserCommitEntity;
import com.github.hollykunge.security.mapper.UserCommitMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: zhhongyu
 * @description:
 * @since: Create in 10:39 2019/11/6
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class UserCommitBiz extends BaseBiz<UserCommitMapper, UserCommitEntity> {
    @Override
    protected String getPageName() {
        return "UserCommitBiz";
    }
}
