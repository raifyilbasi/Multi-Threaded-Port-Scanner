import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

public class Logic implements Callable<data>{
    Logic(String ipAdresse, int targetport, int interval_in_ms){
        this.interval_in_ms=interval_in_ms;
        this.ipAdresse=ipAdresse;
        this.targetport=targetport;
    }

    String ipAdresse;
    int targetport;
    int interval_in_ms;




    @Override
    public data call() throws Exception {
        try (Socket socket=new Socket();) {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(ipAdresse, targetport);
            socket.connect(inetSocketAddress, interval_in_ms);
            return new data(ipAdresse,targetport,false);
        }catch (IOException e){
            return new data(ipAdresse,targetport,true);
        }

    }
}
