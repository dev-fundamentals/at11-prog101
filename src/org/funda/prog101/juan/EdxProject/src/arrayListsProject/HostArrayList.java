package arrayListsProject;

import java.util.ArrayList;

public class HostArrayList {
	
	/**
	 * THIS IS THE DOCUMENTATION
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> hosts = new ArrayList<String>();
		hosts.add("www.google.com");
		hosts.add("www.upenn.edu");
		hosts.add("www.microsoft.com");
		hosts.add("www.amazon.com");
		for (String host : hosts) {
			if (host.endsWith("edu")) {
				System.out.println(host);
			}
			else {
				if (host.equals("www.amazon.com")) {
					hosts.remove(host);
					hosts.add("PLACEHOLDER");
				}
			}
		}
	}

}
