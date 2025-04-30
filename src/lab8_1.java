class TotalAngleException extends Exception{} //The sum of the interior angles is not 180 degrees
class NegativeException extends Exception{} //Side length, angle <=0
class LengthException extends Exception{} //The sum of the two small sides must be greater than the third side

class Triangle
{
	public int length1, length2, length3, angle1, angle2, angle3;
	
	public Triangle(int length1,int length2,int length3,int angle1,int angle2,int angle3) throws TotalAngleException,NegativeException,LengthException{
		int angleSum = angle1 + angle2 + angle3;
		if (angleSum != 180) throw new TotalAngleException();
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) throw new NegativeException();
		if (length1 <= 0 || length2 <= 0 || length3 <= 0) throw new NegativeException();
		int longest = Math.max(Math.max(length1, length2), length3);
		int lengthSum = length1 + length2 + length3;
		if (lengthSum - longest < longest) throw new LengthException();
		
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
		this.angle1 = angle1;
		this.angle2 = angle2;
		this.angle3 = angle3;
	}
}

public class Main{
	   public static void main(String args[]){
	       try{
	           Triangle tri1 = new Triangle(-3, 4, 5, 37, 53, 90);
	                   System.out.println(""+tri1.length1+tri1.length2+tri1.length3+tri1.angle1+tri1.angle2+tri1.angle3);
	       }
	       catch(Exception e) {
	           System.out.println(e);
	       }
	   }
	}
/*註解請勿移除
public class Main{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	   try{
		   Triangle tri1 = new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		   System.out.println(""+tri1.length1+tri1.length2+tri1.length3+tri1.angle1+tri1.angle2+tri1.angle3);
	   }
	   catch(Exception e) {
		   System.out.println(e);
	   }
   }
}
*/
