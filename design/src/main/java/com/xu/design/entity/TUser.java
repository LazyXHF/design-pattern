package com.xu.design.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.naming.ldap.PagedResultsControl;

/***
 *@Title
 *@Author 许小桀
 *@Date 2020/4/10 14:41
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TUser {
    private String username;
    private String password;

}
