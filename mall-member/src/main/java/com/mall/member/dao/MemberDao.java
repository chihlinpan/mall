package com.mall.member.dao;

import com.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author chihlinpan
 * @email chihlin_pan@outlook.com
 * @date 2021-01-03 17:15:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
