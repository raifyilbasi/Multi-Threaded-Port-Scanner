import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        NetworkScanner networkScanner=new NetworkScanner(1000);

        List<Future<data>> list= networkScanner.scan(InetAddress.getLocalHost().getHostAddress(), 1    ,1024);


        for (Future<data> liste:list){
            try{
                data result=liste.get();
                System.out.println(result.asString());
            }catch (InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }

    }
}