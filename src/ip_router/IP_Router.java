package ip_router;
import ip_router.Packet;
import ip_router.Router;

public class IP_Router {

    public static void main(String[] args) {
        Router router = new Router();
        router.addRoute(0xC0A80100, 0xffffff00, "Router1"); //this will add a rule to the routing table in the form of network, subnet, interface name
        router.addIpAddress(0xC0A80101); //this will add an ip to be routed to a stack
        router.addIpAddress(0xC0A90101);
        System.out.println(router.routeIP().getInterfaceName()); //routeIP() will return an object of class Packet that will include the
                                                                 //ip address to be routed and the network, subnet, and interface name of the selected route
        System.out.println(router.routeIP().getInterfaceName());
    }
    
}
