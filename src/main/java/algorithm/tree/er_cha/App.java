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
		
		boolean is =service.deleteNode(1354);
		System.out.println("boolean="+is);
		service.display(service.root.getRoot());
		
	}
}
