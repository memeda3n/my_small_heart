package algorithm.tree.er_cha;

import algorithm.tree.er_cha.service.TreeService;

public class App {

	public static void main(String[] args) {
		TreeService service=new TreeService();
		
		service.insert(1223);
		service.insert(986);
		service.insert(1243);
		service.insert(1546);
		service.insert(1241);
		service.insert(1000);
		service.insert(365);
		service.insert(1354);
		
		int num=service.delete(1223);
		System.out.println("num="+num);
		service.display(service.root.getRoot());
		
	}
}
