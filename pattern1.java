
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        int N=5;
        int i=1;
        int max=2*N-1;
       while(N>=i){
        for(int j=1;j<=(N-i); j++)
        {
            System.out.print(" "); 
        }
        for(int x=0;x<(2*i-1) ; x++)
        {System.out.print("*");}
        i=i+1;
        System.out.println();
       // N=N-1;
       }
      //  System.out.print(i); 
while(2*N-i>=0){
  //  System.out.print(i); 
    for(int j=(i-N); j>0 ; j--){
        System.out.print(" "); 
    }
    for(int x=(4*N - 2*i -1) ; x>0 ; x--){
        System.out.print("*");
    }
    i=i+1;
    System.out.println();
}}}
