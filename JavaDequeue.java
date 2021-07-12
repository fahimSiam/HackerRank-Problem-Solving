import java.util.*;
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int result=-1;
        //int f=0;
        Set<Integer> set = new HashSet<Integer>();
        Deque<Integer> deque = new ArrayDeque<Integer>(n);
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
           deque.addLast(num);
           set.add(num);
           if(deque.size()==m){
               if(set.size()>result){
                   result=set.size();
               }
               int head=deque.pop();
               if(!deque.contains(head)){
                   set.remove(head);
               }
              // deque.pop();

           }
        }
        System.out.println(result);
    }
}
