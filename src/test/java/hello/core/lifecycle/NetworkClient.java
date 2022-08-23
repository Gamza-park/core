package hello.core.lifecycle;

public class NetworkClient {

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

    public void init() throws Exception {
        System.out.println("NetworkClient.init");
        connect();
        call("Initiallize Connect Message");
    }

    public void close() throws Exception {
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
