import java.io.File;

public class Run {
	public static void main(String[] args) {
		File f = new File("F:/JAVA-CODES/AUTOMATIC CREATE 5 FILES/Demo");
		boolean flag = f.mkdir();
		if(flag){
			for(int i=0;i<5;i++){
				try{
					String loc = "F:/JAVA-CODES/AUTOMATIC CREATE 5 FILES/Demo/new" + i + ".txt";
					File f2 = new File(loc);
					f2.createNewFile();
					
				}
				catch(Exception e){
				}
			}
		}
	}
}