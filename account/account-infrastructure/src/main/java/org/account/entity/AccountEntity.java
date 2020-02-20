package org.account.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Data
@Entity
@Table(name = "account", schema = "account", catalog = "")
public class AccountEntity {
    @Column(name = "id")
    private Long id;
    private Long userId;
    private Long roleId;
    private Long permissionId;
    private Long user_role_id;
    private Long user_permission_id;
    private Long role_permission_id;
}
