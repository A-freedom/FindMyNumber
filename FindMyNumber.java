import java.util.Scanner;

class FindMyNumber {
    
    public static int findByIndex(int[] array, int number) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] == number) {
          return i;
        }
      }
      return -1;
   }  
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Items do you need : ");
        int len = input.nextInt();
        int[] myArray = new int[len];
        for(int i = 0 ; i<len ;i++){
            System.out.print("enter the item : ");
            myArray[i] = input.nextInt();
        }
        while(0==0){
            System.out.print("what do you want to find : ");
            int itemToFind = input.nextInt();
            int index = findByIndex(myArray,itemToFind);
            if (index == -1){
                System.out.println("item isn't exist!");
            }else{
                System.out.println("the items { "+itemToFind+" } is in the index number { "+ index +" }");
            }
        }
    }
}
