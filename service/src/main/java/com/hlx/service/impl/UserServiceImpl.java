package com.hlx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlx.mapper.UserMapper;
import com.hlx.po.User;
import com.hlx.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.service.impl
 * @Author: Hlx
 * @CreateTime: 2020/6/13
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
