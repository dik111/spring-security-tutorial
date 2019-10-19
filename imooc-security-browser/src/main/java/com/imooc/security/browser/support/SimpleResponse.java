package com.imooc.security.browser.support;

/**
 * Desription:
 *
 * @ClassName SimpleResponse
 * @Author Zhanyuwei
 * @Date 2019/10/19 14:26
 * @Version 1.0
 **/

public class SimpleResponse {

    public SimpleResponse(Object content){
        this.content = content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
