package PO;

public class Test {
	public static void main(String[] args){
		UserPO vo=new UserPO();
		vo.setID("admin");
		vo.setPassword("admin");
		vo.setRole("管理员");
		UserPO po=new UserPO("admin","admin","管理员");
		System.out.println(po.equals(vo));
	}
}
