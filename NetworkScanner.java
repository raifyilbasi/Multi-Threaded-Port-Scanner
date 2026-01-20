import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NetworkScanner {

    NetworkScanner(int threadCount){
        this.executorService= Executors.newFixedThreadPool(threadCount);
    }
    ExecutorService executorService;
    int timeout=300;


    List<Future<data>> scan(String ip,int startport,int endport){
        List<Future<data>> list=new ArrayList<>();
        for (int i=startport;i<=endport;i++){
            list.add(this.executorService.submit(new Logic(ip,i,timeout)));
        }
        this.executorService.shutdown();
        return list;
    }
}
