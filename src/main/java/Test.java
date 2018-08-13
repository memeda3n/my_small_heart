import java.util.concurrent.ConcurrentHashMap;

public class Test  {

	private  ConcurrentHashMap<String, Integer> con=new ConcurrentHashMap<>();
	
	public void add(String key){
		Integer value=con.get(key);
		if (value!=null) {
			con.put(key, value+1);
		}else {
			con.put(key, value);
		}
	}
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				Test test=new Test();
			}
		});
	}
}



class T2 implements Runnable{

	@Override
	public void run() {
		
	}
	
}
