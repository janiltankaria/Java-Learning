package interfaceInJava;

public class Person implements Student , YouTuber , VideoEditor{

	public static void main(String[] args) {
		
Person obj = new Person();
obj.study();
obj.makeVideo();

	YouTuber obj2 = obj;
	obj2.editVideo();
	obj2.makeVideo();
	}


@Override
public void study() {
	System.out.println(" person is studying");
}


@Override
public void makeVideo() {

	System.out.println(" person is making a video");
}


@Override
public void editVideo() {
	System.out.println(" he is good ");
	
}
}