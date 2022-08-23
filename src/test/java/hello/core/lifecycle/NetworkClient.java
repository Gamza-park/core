package hello.core.lifecycle;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("Create Call : " + url);
        connect();
        call("Initiallize Connect Message");
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
}
