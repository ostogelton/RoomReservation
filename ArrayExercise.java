package arrayexercise;

import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int Room[] = new int[5];
        int opt;
        int n = 0;
        
        while(true){
            System.out.println("[1]Add\n[2]Remove\n[3]List\n[4]Update\n[5]Exit");
            opt = scann.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Enter Room Number: ");
                    int room = scann.nextInt();
                    
                    Room[n] = room;
                    n++;
                    break;
                case 2:
                    System.out.println("Enter ID you want to Delete");
                    int index = scann.nextInt();
                    
                    int newRoom[] = new int[Room.length - 1];
                    for(int i = 0, j = 0; i < Room.length; i++){
                        if(i != index){
                            newRoom[j++] = Room[i];
                        }
                    }
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    for(int i = 0; i < Room.length; i++){
                        System.out.println("Room: " + Room[i]);
                    }
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    System.out.print("Enter the index you want to Edit: ");
                    int Eindex = scann.nextInt();
                    
                    System.out.print("Enter the Number: ");
                    int num = scann.nextInt();
                    
                    Room[Eindex] = num;
                    System.out.println("-----------------------------");
                    break;
                case 5:
                    System.out.print("Do you realy want to Exit y/N: ");
                    char choice = scann.next().charAt(0);
                    
                    if(choice == 'y' || choice == 'Y'){
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        
        
        }
        
        
    }
    
}
