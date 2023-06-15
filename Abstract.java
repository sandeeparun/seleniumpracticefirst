
abstract class Members {
	private String name;
	abstract void welcome();
	public String getName(String string)
	{return name;}
}
class Member extends Members
{
	void welcome() {
	System.out.println("The Student");
	}
}
class Teacher extends Member
{
	void welcome() {
		System.out.println("The Teacher");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Members[] ab= new Members[3];
		ab[0]= new Member();
		ab[1]= new Teacher();
		ab[0].welcome();
		ab[1].welcome();

		// TODO Auto-generated method stub

	}

}
