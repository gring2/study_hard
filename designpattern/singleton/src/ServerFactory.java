
/**
 * Created by jinwoopark on 2017. 8. 7..
 */
public class ServerFactory implements ServerProvider{

    private static ServerProvider serverProvider = new ServerProvider() {
        @Override
        public Server getServer() {
            return new ServerProxy();
        }
    };

    public synchronized static ServerProvider getInstance () {
            return serverProvider;
    }

    public Server getServer(){
        return serverProvider.getServer();
    }

    public static void setServerProvider(ServerProvider sp){
        serverProvider = sp;
    }

}
