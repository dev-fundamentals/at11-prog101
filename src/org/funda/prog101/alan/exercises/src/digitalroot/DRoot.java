package digitalroot;

public class DRoot {

	public int digitalRoot(int send) {
		// TODO Auto-generated method stub
		int sumRoot = 0;
		while (send >= 10) {
			sumRoot = sumRoot + (send %10);
			send = send/10;
			
		}
		sumRoot = sumRoot +send;
		return sumRoot;
	}

}
