 /* Create Arraylist, add elements from user input using for loop and print it */

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(4);
        for(int i=0;i<4;i++){
            list.add(sc.nextInt());
        }
        for(int j=0;j<4;j++){
            System.out.print(" "+list.get(j));
        }
        
    }
}