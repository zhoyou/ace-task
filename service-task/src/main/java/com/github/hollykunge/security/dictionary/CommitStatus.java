package com.github.hollykunge.security.dictionary;

/**
 * @author: zhhongyu
 * @description: 提交，发布版本状态字典
 * @since: Create in 10:13 2019/11/6
 */
public enum CommitStatus {
    COMMIT_STATUS("提交","1"),
    SEND_STATUS("发布","2")
    ;
    private String name;
    private String value;
    CommitStatus(String name,String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
