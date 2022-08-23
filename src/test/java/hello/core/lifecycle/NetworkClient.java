package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {

    private String url;

    public NetworkClient() {
        System.out.println("Create Call : " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Service Start Call
    public void connect() {
        System.out.println("Connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + " message : " + message);
    }

    // Service Finish call
    public void disconnect(){
        System.out.println("Close : " + url);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("Initiallize Connect Message");
    }

    @Override
    public void destroy() throws Exception {
        disconnect();
    }
}
