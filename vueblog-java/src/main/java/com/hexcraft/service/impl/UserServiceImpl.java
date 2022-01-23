package com.hexcraft.service.impl;

import com.hexcraft.entity.User;
import com.hexcraft.mapper.UserMapper;
import com.hexcraft.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  Service Implementation Class
 * </p>
 *
 * @author Peter Chen
 * @since 2022-01-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
