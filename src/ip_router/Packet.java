/**
 * This is just a container to move packet information around easier
 */
package ip_router;

public class Packet {
    private long ipaddress;
    private long network;
    private long subnet;
    private String interfaceName;

    public Packet(long ipaddress, long network, long subnet, String interfaceName) {
        this.ipaddress = ipaddress;
        this.network = network;
        this.subnet = subnet;
        this.interfaceName = interfaceName;
    }

    @Override
    public String toString() {
        return "Packet Sent:{" + "ipaddress=" + ipaddress + ", network=" + network + ", subnet=" + subnet + ", interfaceName=" + interfaceName + '}';
    }

    public long getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(long ipaddress) {
        this.ipaddress = ipaddress;
    }

    public long getNetwork() {
        return network;
    }

    public void setNetwork(long network) {
        this.network = network;
    }

    public long getSubnet() {
        return subnet;
    }

    public void setSubnet(long subnet) {
        this.subnet = subnet;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }
    
    
    
}
