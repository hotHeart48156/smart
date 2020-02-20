package org.account.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author "yangbiao"
 */
@Data
public class SysUserVo extends SysUserEntity {
    @TableField("store_id")
    private Long storeId;
}
