package com.github.hollykunge.security.rest;

import com.github.hollykunge.security.biz.UserCommitBiz;
import com.github.hollykunge.security.common.rest.BaseController;
import com.github.hollykunge.security.entity.UserCommitEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhhongyu
 * @description: 用户提交,发布，合并业务接口
 * @since: Create in 10:11 2019/11/6
 */
@RestController
@RequestMapping("userCommit")
public class UserCommitController extends BaseController<UserCommitBiz, UserCommitEntity> {
}
