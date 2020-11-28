package role;

import command.DataProcessing;

public class User {
	private String id;			//用户名
	private String name;		//姓名
	private String password;	//密码
	private String tel;			//电话
	private float balance;		//余额
	
	//构造函数
	public User(String id,String name,String password,String tel,float balance){
		this.id=id;
		this.name=name;
		this.password=password;
		this.tel=tel;
		this.balance=balance;
	}
	
	//用户修改密码
	public boolean changeSelfPwd(String password){
		if(DataProcessing.updateUserPwd(id,password)) {
			this.password=password;
			//
			System.out.println("密码修改成功！");
			return true;
		}else{
			return false;
		}
	}
	
	//用户
	public boolean recharge(float balance){
		if(DataProcessing.updateUserBla(id,balance)) {
			this.balance=balance;
			//
			System.out.println("充值成功！");
			return true;
		}else{
			return false;
		}
	}
	
	//用户下单
	public boolean placeOrder() {
		return false;
	}
	
	
	public static User getuser(String id,String name,String password,String tel,float balance){
		return new User(id,name,password,tel,balance);
	}
	
	
	//基本功能
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id=id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String gettel() {
		return tel;
	}
	
	public void settel(String tel) {
		this.tel=tel;
	}
	
	public String getpwd() {
		return password;
	}
	
	public void setpwd(String password) {
		this.password=password;
	}
	
	public float getbalance() {
		return balance;
	}
	
	public void setid(float balance) {
		this.balance=balance;
	}
}
