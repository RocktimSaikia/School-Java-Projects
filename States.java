package All_Sates;

import java.util.Arrays;
import java.util.Scanner;

public class States {
    public static int getInfo(String stateinfo[][],String state){
        int position=-1;
        Boolean flag=false;
        for(int i=0;i<stateinfo.length&&!flag;i++){
            if(stateinfo[i][0].equalsIgnoreCase(state))
                position=i;
        }
        return position;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\t\tName of India's all Sates :");
                System.out.println("\t\t---------------------------\n");

        String[][]StateInfo=new String[][]{
                {"Andra Pradesh", "Hyderabad"},
                {"Arunachal Pradesh", "Itangar"},
                {"Assam", "Dispur"},
                {"Bihar", "Patna"},
                {"Chhattisgarh", "Rajpur"},
                {"Goa", "Panaji"},
                {"Gujrat", "Gandhinagar"},
                {"Haryana", "Chandigarh"},
                {"Himachal Pradesh", "Shimla"},
                {"Jammu and Kashmir", "Srinagar and Jammu"},
                {"Jharkhand", "Ranchi"},
                {"Karnataka", "Banglore"},
                {"Kerala", "Thiruvananthapuram"},
                {"Madya Pradesh", "Bhupal"},
                {"Maharashtra","Mumbai"},
                {"Manipur","Imphal"},
                {"Meghalaya","Shillong"},
                {"Mizoram","Aizawi"},
                {"Nagaland","Kohima"},
                {"Orissa","Bhubaneshwar"},
                {"Punjab","Chandigarh"},
                {"Rajasthan","Jaipur"},
                {"Sikkim","Gangtok"},
                {"Tamil Nadu","Chennai"},
                {"Tripura","Agartala"},
                {"Uttaranchal","Dehradun"},
                {"Uttar Pradesh","Lucknow"},
                {"West Bengal","Kolkata"},
        };
         for(int i=0;i<StateInfo.length;i++){//prints all the states
          System.out.println("\t"+(i+1)+". "+StateInfo[i][0]);
         }
        while (true){
            System.out.println("\n* Type a state name to know about Capital or No to exit  ");
            System.out.print("  : ");
            String input=sc.nextLine();

            if(input.equalsIgnoreCase("NO")){
                System.exit(0);
            }else {
                int position=getInfo(StateInfo,input);
                if(position!=-1){
                    System.out.println("\n\tState    : "+StateInfo[position][0]);
                    System.out.println("\tCapital  : "+StateInfo[position][1]);
                }else {
                    System.out.print("\r[Invalid state entered]\r");
                }
            }
        }
    }
}