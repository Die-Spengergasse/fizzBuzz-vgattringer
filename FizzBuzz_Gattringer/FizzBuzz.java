
/**
 * Beschreiben Sie hier die Klasse FizzBuzz.
 * 
 * @author (GAT) 
 * @version (05122024)
 */
public class FizzBuzz
{
    public void createFizzBuzz(){
        for(int i = 1; i <= 100; i++)
        {
            if(i%3==0){
                System.out.print("Fizz");
            }
            if(i%5==0){
                System.out.print("Buzz");
            }
            if(i%3!=0 && i%5!=0){
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}
