package com.hexcraft.service.impl;

import com.hexcraft.entity.Blog;
import com.hexcraft.mapper.BlogMapper;
import com.hexcraft.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
