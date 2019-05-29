
//This class will be implementing the interface
class Add_sub1 implements Add_Sub
 {
     //This is over riding the methods
     @Override
     //Giving the interface methods a definition
     public void add(int x, int y) {

         int ans = x+y;
         System.out.printf("The answer is : %d \n",ans);

     }
     //This is over riding the methods
     @Override
     //Giving the interface methods a definition
     public void subtract(int x, int y) {

         int ans = x-y;
         System.out.printf("The answer is : %d \n",ans);
     }
 }
