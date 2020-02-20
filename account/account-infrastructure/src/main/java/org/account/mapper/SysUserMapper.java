package org.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.account.entity.SysUserEntity;
import org.account.entity.SysUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author "yangbiao"
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {
    SysUserVo selectByUserName(String userName);

}
