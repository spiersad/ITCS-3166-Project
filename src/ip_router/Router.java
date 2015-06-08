package ip_router;

import java.util.ArrayList;
import java.util.Stack;
import ip_router.Packet;

public class Router {
    
    private Stack<Long> ipAddresses = new Stack<>();
    private ArrayList<Long> netIP = new ArrayList<>();
    private ArrayList<Long> netSub = new ArrayList<>();
    private ArrayList<String> netNames = new ArrayList<>();
    
    public void addRoute(long network, long subnet, String name){
        this.netIP.add(network);
        this.netSub.add(subnet);
        this.netNames.add(name);
    }
    
    public void addIpAddress(long address){
        this.ipAddresses.push(address);
    }
    
    public Packet routeIP(){
        Packet packet = new Packet(0x0,0x0,0x0,null);
        if (this.ipAddresses.isEmpty() || this.netIP.isEmpty()){
            packet = null;
        }
        else {
            for (int i = 0; i < this.netIP.size(); i++){
                if (this.netIP.get(i) == (this.ipAddresses.peek() & this.netSub.get(i))){
                    packet = new Packet(this.ipAddresses.pop(), this.netIP.get(i), this.netSub.get(i), this.netNames.get(i));
                    i = this.netIP.size();
                }
                else{
                    packet = new Packet(this.ipAddresses.pop(), 0xffffffff, 0xffffffff, "Default");
                }
            }
        }
        return packet;
    }

}
