
public class MethodExercise02 {

	// ��дһ��main����
	public static void main(String[] args) {

		Person3 p = new Person3();
		p.name = "milan";
		p.age = 100;
		// ����tools
		MyTools1 tools = new MyTools1();
		Person3 p2 = tools.copyPerson(p);

		// ���� p �� p2��Person���󣬵��������������Ķ���������ͬ
		System.out.println("p������ age=" + p.age + " ����=" + p.name);
		System.out.println("p2������ age=" + p2.age + " ����=" + p2.name);
		// ������ʦ��ʾ�� ����ͬ ����ȽϿ����Ƿ�Ϊͬһ������
		System.out.println(p == p2);// false

	}
}

class Person3 {
	String name;
	int age;
}

class MyTools1 {
	// ��дһ������copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ��󡣿�¡����
	// ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
	//
	// ��д������˼·
	// 1. �����ķ������� Person
	// 2. ���������� copyPerson
	// 3. �������β� (Person p)
	// 4. ������, ����һ���¶��󣬲��������ԣ����ؼ���

	public Person3 copyPerson(Person3 p) {
		// ����һ���µĶ���
		Person3 p2 = new Person3();
		p2.name = p.name; // ��ԭ����������ָ���p2.name
		p2.age = p.age; // ��ԭ����������丳��p2.age
		return p2;
	}
}