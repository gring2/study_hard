/**
 * Created by jinwoopark on 2017. 8. 7..
 */
public class UseServer implements Server{
    private Server server;

    public Server getServer(){
        return server;
    }
    @Override
    public void doSomeThing() {
        ServerProvider factory = ServerFactory.getInstance();
        server = factory.getServer();
        server.doSomeThing();
    }
}
