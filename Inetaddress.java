package java.net;

import java.net.InetAddress;

public class Inetaddress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    InetAddress in=InetAddress.getLocalHost();
    System.out.println("IP Address:"+in.getHostAddress());
	}

}
