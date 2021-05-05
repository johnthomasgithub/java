package logical;
class InterviewBitTest{
	   int num;
	   InterviewBitTest(int x){ 
	       num = x; 
	   }
	   InterviewBitTest(){ 
	       num = 0; 
	   }
	}
	class Driver {
	   public static void main(String[] args)
	   {

		   InterviewBitTest ibTestObj = new InterviewBitTest(20);

	       updateObject(ibTestObj);

	       System.out.println(ibTestObj.num);
	       System.out.println();
	   }
	   public static void updateObject(InterviewBitTest ibObj)
	   {
	       ibObj = new InterviewBitTest();
	       ibObj.num = 50;
	   }
	}