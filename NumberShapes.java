
   class NumberClass{
       int number;

        public boolean isSquare(){
            double squareRoot=Math.sqrt(number);
            if(squareRoot==Math.floor(squareRoot)){
                return true;
            }
            else{return false;}
        }


        public boolean isTriangular(){
            int x=1;
            int triangularNumber=1;
            while (triangularNumber<number){
                x++;
                triangularNumber=triangularNumber+x;
            
            if(triangularNumber==number){
                return true;
            }
            else{return false;}
       }
            return false;
    }
    
   }


   public class NumberShapes {
   public static void main(String[] args){
    NumberClass myNumber=new NumberClass();
    myNumber.number=49; 
    System.out.println(myNumber.isSquare());   
}
}
