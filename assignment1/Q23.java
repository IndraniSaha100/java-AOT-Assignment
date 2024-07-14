/**
 *  23. Write a Java Program to display the sequence ABA, BCB, CDC, DED,……..

 24. Write a Java Program to display the sequence AMM, COO, EQQ ,..........

 25. Write a Java Program to display the sequence A1, B2, C3, ...., …Y25,Z26, A1, B2,...............
 */
public class Q23 {
    public static void main(String[] args) {

        // #23
        System.out.println("\nSequence is");
        char terminal='A';
        char middle='B';
        while(middle<='Z'){
            
            System.out.print(""+terminal+middle+terminal+" ");//must start with empty string to say the compiler, treat it as string concatenation not arithmetic operation
            terminal+=1;
            middle+=1;
        }
        
        // #24
        System.out.println("\n\nSequence is");
        char first='A';
        char next='M';
        while(next<='Z'){//never write next!='Z' infinite loop
        System.out.print(""+first+next+next+" ");
        first+=2;
        next+=2;
    }
    
    
    //#25
    System.out.println("\n\nSequence is");
        char start='A';
        //how much time you wanna to loop the sequence, store in num
        int num=1;
        int x=2;
        while(x>0){
            while(start<='Z'){
                System.out.print(""+start+num+' ');
                num++;
                start+=1;
            }
            start='A';
            num=1;
            x--;
        }
    }
}
