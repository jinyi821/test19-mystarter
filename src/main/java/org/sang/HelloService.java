package org.sang;

/**
 * Created by TMP246 on 2018/1/30.
 */
public class HelloService {
    private String msg;

    public String sayHello() {
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
