public class data {
    data(String ipAdresse, int port, boolean isFree){
        this.ipAdresse=ipAdresse;
        this.port=port;
        this.free=isFree;
    }

    String ipAdresse;
    int port;
    boolean free;

    public int getPort() {
        return port;
    }
    boolean isFree(){
        return free;
    }

    public String getIpAdresse() {
        return ipAdresse;
    }

    public String asString(){
        return ipAdresse+" | "+port+" | "+(free?"free":"in use");
    }
}
