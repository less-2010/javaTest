package dome01;//包名

//哲学 思想.编程
//物质 属性 成员变量
//运动 行为 成员方法

public class Person {
	String name;
	String gender;
	int age;
	String Addnmress;
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}
	public void lean() {
		System.out.println("学习");
	};

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		System.out.println(0);
		p1.name="张三";
		System.out.println(p1.name);

	}

}
