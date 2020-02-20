package org.account.entity;

import javax.persistence.*;

@Entity
@Table(name = "sys_email_config", schema = "account", catalog = "")
public class SysEmailConfigEntity {
    private long id;
    private String fromUser;
    private String host;
    private String pass;
    private String port;
    private String user;
    private Integer storeId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "from_user", nullable = true, length = 255)
    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    @Basic
    @Column(name = "host", nullable = true, length = 255)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Basic
    @Column(name = "pass", nullable = true, length = 255)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "port", nullable = true, length = 255)
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Basic
    @Column(name = "user", nullable = true, length = 255)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "store_id", nullable = true)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysEmailConfigEntity that = (SysEmailConfigEntity) o;

        if (id != that.id) return false;
        if (fromUser != null ? !fromUser.equals(that.fromUser) : that.fromUser != null) return false;
        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (fromUser != null ? fromUser.hashCode() : 0);
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
