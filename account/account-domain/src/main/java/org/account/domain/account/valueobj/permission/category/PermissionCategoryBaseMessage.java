package org.account.domain.account.valueobj.permission.category;

/**
 * @author "yangbiao"
 */
public class PermissionCategoryBaseMessage {
    private Long id;
    private String name;
    private Integer status;

    PermissionCategoryBaseMessage(Long id, String name, Integer status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Integer getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
