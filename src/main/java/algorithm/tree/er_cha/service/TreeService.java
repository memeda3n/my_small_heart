package algorithm.tree.er_cha.service;

import algorithm.tree.er_cha.entity.Node;
import algorithm.tree.er_cha.entity.Root;

public class TreeService {

	public Root root=new Root();

	public void insert(int d){
		Node node=new Node(d);

		Node parent=root.getRoot();Node current=root.getRoot();
		if (parent==null) {
			root.setRoot(node);
		}else {
			while(true){
				if (current.getData()>node.getData()) {
					parent=current;
					current=current.getLeftNode();
					if (parent.getLeftNode()==null) {
						parent.setLeftNode(node);
						break;
					}
				}else {
					parent=current;
					current=current.getRightNode();
					if (parent.getRightNode()==null) {
						parent.setRightNode(node);
						break;
					}
				}
			}
		}
	}
	/**
	 * 中序遍历
	 */
	public void display(Node node){
		if (node.getLeftNode()!=null) {
			display(node.getLeftNode());
		}
		System.out.println(node.getData());
		if (node.getRightNode()!=null) {
			display(node.getRightNode());
		}
	}


	public int delete(int d){
		if (root.getRoot()==null) {
			return -1;
		}

		Node node=new Node(d);

		Node parent=root.getRoot();
		Node current=root.getRoot();
		Node subNodeL=null;
		Node subNodeR=null;
		Node sucess=null;
		boolean isLeft=false;
		boolean isRight=false;

		//找结点
		while(current!=null){
			if (node.getData()==current.getData()) {
				subNodeL=current.getLeftNode();
				subNodeR=current.getRightNode();
				sucess=current;
				if (parent.getLeftNode().getData()==node.getData()) {
					isLeft=true;
				}else {
					isLeft=true;
				}
				break;
			} else if(node.getData()<current.getData()){
				parent=current;
				current=current.getLeftNode();
			}else {
				parent=current;
				current=current.getRightNode();
			}
		}
		if (sucess==null) {
			System.out.println("没找到此数据");
			return -1;
		}

		//只有一个根节点
		if (root.getRoot().getData()==node.getData()
				&&root.getRoot().getLeftNode()==null 
				&& root.getRoot().getRightNode()==null) {
			root.setRoot(null);
			return d;
		}

		//没有子节点
		if (sucess.getLeftNode()==null&&sucess.getRightNode()==null) {
			if (isLeft) {
				parent.setLeftNode(null);
			}else if (isRight) {
				parent.setRightNode(null);
			}
		}else if (sucess.getLeftNode()!=null&&sucess.getRightNode()!=null) {
			//有两子节点
			//找后继结点
			/*Node t=sucess.getRightNode();//右结点
			Node p=null;
			Node tLeft=t.getLeftNode();//右结点的左结点
			Node h=null;//后继结点
			 */			Node sucessParent=node;
			 Node sucessor=node;
			 Node cu=node.getRightNode();
			 while(cu!=null){
				 sucessParent=sucessor;
				 sucessor=current;
				 cu=cu.getLeftNode();
			 }
			 if (sucessor.getRightNode()!=sucess.getRightNode()) {
				 sucessParent.setLeftNode(sucessor.getRightNode());

			 }
			 if (current==root.getRoot()) {
				root.setRoot(sucessor);
			 } else if (isLeft) {
				 parent.setLeftNode(sucessor);
			 }else if (isRight) {
				 parent.setRightNode(sucessor);
			 }
			 sucessor.setLeftNode(subNodeL);
			 sucessor.setRightNode(subNodeR);

		} else {
			//有一个子节点
			if (isLeft) {
				parent.setLeftNode(subNodeL);
			}else if (isRight) {
				parent.setRightNode(subNodeR);
			}
		}
		return sucess.getData();
	}


}
