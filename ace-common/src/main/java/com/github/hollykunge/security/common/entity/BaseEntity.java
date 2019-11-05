package com.github.hollykunge.security.common.entity;
import com.github.hollykunge.security.common.util.UUIdGenId;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import tk.mybatis.mapper.annotation.KeySql;


import javax.persistence.*;
import java.util.Date;

/**
 * @description: 实体基类
 * @author: dd
 * @since: 2019-05-16
 */
@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @KeySql(genId = UUIdGenId.class)
    @Column(name = "Id",length = 32)
    private String id;

    @Column(name = "CRT_TIME")
    private Date crtTime;

    @Column(name = "CRT_USER")
    private String crtUser;

    @Column(name = "CRT_NAME")
    private String crtName;

    @Column(name = "CRT_HOST")
    private String crtHost;

    @Column(name = "UPD_TIME")
    private Date updTime;

    @Column(name = "UPD_USER")
    private String updUser;

    @Column(name = "UPD_NAME")
    private String updName;

    @Column(name = "UPD_HOST")
    private String updHost;

    @Column(name = "ATTR1")
    private String attr1;

    @Column(name = "ATTR2")
    private String attr2;

    @Column(name = "ATTR3")
    private String attr3;

    @Column(name = "ATTR4")
    private String attr4;
}
