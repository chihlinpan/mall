package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author chihlinpan
 * @email chihlin_pan@outlook.com
 * @date 2020-12-16 20:24:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
