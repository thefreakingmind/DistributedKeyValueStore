package com.distributedkvstore.manager.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@Setter
public class ServiceManagerNodes implements Node {

    private String ip;
    private String port;
    private String md5h;
    private boolean orchastraor;

    public ServiceManagerNodes(String ip, String port, String md5h, boolean orchastraor) {
        this.ip = ip;
        this.port = port;
        this.md5h = md5h;
        this.orchastraor = orchastraor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ServiceManagerNodes that = (ServiceManagerNodes) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(orchastraor, that.orchastraor)
                .append(ip, that.ip)
                .append(port, that.port)
                .append(md5h, that.md5h)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(ip)
                .append(port)
                .append(md5h)
                .append(orchastraor)
                .toHashCode();
    }

    @Override
    public String getKey() {
        return md5h;
    }
}
