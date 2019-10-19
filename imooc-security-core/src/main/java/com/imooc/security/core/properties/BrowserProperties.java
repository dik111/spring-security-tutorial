package com.imooc.security.core.properties;

/**
 * Desription:
 *
 * @ClassName BrowserProperties
 * @Author Zhanyuwei
 * @Date 2019/10/19 14:49
 * @Version 1.0
 **/
public class BrowserProperties {

    private String loginPage = "/imooc-signIn.html";

    private LoginType loginType = LoginType.JSON;


    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {

        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
