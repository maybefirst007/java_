/*public class HalloWorld {*/
/*	public static void main(String[] args){*/
/*		System.out.println("Hello World");*/
/*	}*/
/*}*/
public class Puppy{
	int puppyAge;
	public Puppy(String name){
		//gouzaoqi : name
		System.out.println("dog : " + name);
	}

	public void setAge( int age ){
		puppyAge = age;
	}
	public int getAge(){
		System.out.println("dog : " + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args){
		/*object*/
		Puppy myPuppy = new Puppy("tommy");
		/*fangfa*/
		myPuppy.setAge( 2 );
		myPuppy.getAge( );
		System.out.pringtln("bianliangzhi : " + myPuppy.puppyAge );
	}
}
