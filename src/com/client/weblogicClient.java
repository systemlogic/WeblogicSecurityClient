package com.client;

import com.systemlogic.WeblogicSecurity;
import com.systemlogic.WeblogicSecurityService;


public class weblogicClient {
	public static void main(String[] args) {
		System.setProperty("javax.net.ssl.trustStore", "/media/Harsh/webservice/wls/wlserver_10.3/server/lib/DemoTrust.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "DemoTrustKeyStorePassPhrase");
	
		WeblogicSecurityService wss = new WeblogicSecurityService();
		WeblogicSecurity ws = wss.getWeblogicSecurityPort();
		
		System.out.println(" sending ");
		System.out.println(ws.sayHai("pavan"));
	}
}
