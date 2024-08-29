import java.util.Random;
import java.util.Scanner;
public class codewar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String name[] = new String[10];
        int gu = 0;         //variable random
        int m = 1500;       //boss fight of loop
        int dmg = 0;        //variable damage
        int dice = 0;       //variable dice 
        int hp = 20;        //hp player
        int p = 0;          //Point player
        int ball = 0;       //dice kee kee
        int Kee_Kee = 20;   //Kee Kee hp
        int Kee_Kee_poit = 0;//Kee Kee point
        int skill_enemy = 0;//variable random skill of enemy 
        int boss_hp =100;   //boss hp 
        int boss_poit = 0;  //boss point
        int r = 500;        //Kee kee fight of loop
        // input name player.
        System.out.print("Enter your name : ");
        name[0] = input.next();
   
        //rule game
        System.out.println("~~~~~~~~~~Welcome To Code War~~~~~~~~~~");
        System.out.println("rule\n" +
            "1. Roll the dice to collect .p\n" +
            "2. Use skill\n" +
            "3. Make either party have HP <=0\n" +
            "4. Start Hp = 20 ,Start point =0");

        //Loop kee kee
        for (int i = 1; i <= r ; i++) {
            System.out.println("\n\n\n\n\n");
            System.out.println("       Player Turn");
            System.out.println("       Status\n"+name[0]+" Hp = "+hp+"\nPoint = "+p );
            System.out.println(" ");
            //Roll the dice
            System.out.print("Roll the dice or not?\nType y or n: ");
            String choic = input.next();
            
            //choic y or n
            if(choic.equals("y") || choic.equals("n")){
                switch(choic)
                {
                case "y":// random 1 to 6
                    dice = random.nextInt(6)+1;
                    p += dice;
                    System.out.println(name[0]+" "+dice+" points");
                    break;
                case "n":// Table of Skills
                    System.out.println("\n\n\n\n\n");
                    System.out.println("          Skills\n"
                            + "1.Normal attack   2 dmg  => ues 1 point\n"
                            + "2.Critical attack 5 dmg  => ues 3 point\n"
                            + "3.Heal            3 hp   => ues 5 point");
                    //choic Skills
                    System.out.print("Select skills\n"
                            + "Type 1, 2, 3: ");
                    int sk = input.nextInt();
                    
                    switch(sk)
                    {
                        //Normal attack
                        case 1 :
                            if (p>0) {
                                Kee_Kee -= 2 ;
                                p -= 1;
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        //Critical attack
                        case 2 :
                            if (p>=3) {
                                Kee_Kee -= 5;
                                p -= 3;
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        //Heal    
                        case 3 :
                            if (p>=5) {
                                hp += 3; 
                                p -= 5;
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        default :
                            System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                    }
                break;
                }
            }else System.out.println("Please type only yes or no.");
            
            //Enemy Turn
            System.out.println("\n\n\n\n\n");
            System.out.println("          Enemy Turn");
            //random no yes by Enemy
            if (Kee_Kee_poit > 15 ) {
                gu = random.nextInt(1) + 1;
            }else gu = random.nextInt(10) + 1;
            if (gu >3 ) {
                ball = random.nextInt(6) + 1;
                Kee_Kee_poit += ball;
                System.out.println("Enemy Roll " + ball + " points");
                System.out.println("       Status\n*Kee Kee*\n" +"Hp = "+Kee_Kee+"\nPoint = "+Kee_Kee_poit);
            }else{
                skill_enemy = random.nextInt(3)+1;
                //Skills Enemy
            switch(skill_enemy)
                    {   //Normal attack Enemy
                        case 1 :
                            if (Kee_Kee_poit>0) {
                                hp -= 2 ;
                                Kee_Kee_poit -= 1;
                                System.out.println("Normal attack   2 dmg");
                            }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                            System.out.println("       Status\n*Kee Kee*\n" +"Hp = "+Kee_Kee+"\nPoint = "+Kee_Kee_poit);
                            break;
                            //Critical attack Enemy
                        case 2 :
                            if (Kee_Kee_poit>=3) {
                                hp -= 5;
                                Kee_Kee_poit -= 3;
                                System.out.println("Critical attack 5 dmg");
                            }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                             System.out.println("       Status\n*Kee Kee*\n" +"Hp = "+Kee_Kee+"\nPoint = "+Kee_Kee_poit);
                            break;
                            //Heal Enemy
                        case 3 :
                            if (Kee_Kee_poit>=5) {
                                Kee_Kee += 3; 
                                Kee_Kee_poit -= 5;
                                System.out.println("Heal            3 hp ");
                            }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                            System.out.println("       Status\n*Kee Kee*\n" +"Hp = "+Kee_Kee+"\nPoint = "+Kee_Kee_poit);
                            break;
                    }
            }
                //Check to see if it's dead or not.
                if (hp < 1 ){
                    i += r;
                    System.out.println("You so noob!!!!!!!");
                }else if(Kee_Kee < 1 ){
                    System.out.println("!!!!!!!!!! You WIN !!!!!!!!!!");
                    i += r;
                }
       
        } 
        

        // boss fight
        System.out.println("Do you want to fight a boss?\nType y or n: ");
        String con = input.next();
        hp += Math.round(hp/2); 
        if(con.equals("y")){
            for (int j = 1; j <= m ; j++) {
            System.out.println("\n\n\n\n\n");
            System.out.println("       Player Turn");
            System.out.println("       Status\n"+name[0]+" Hp = "+hp+"\nPoint = "+p );
            System.out.println(" ");
            //Roll the dice
            System.out.print("Roll the dice or not?\nType y or n: ");
            String choic = input.next();
            
            //choic y or n
            if(choic.equals("y") || choic.equals("n")){
                switch(choic)
                {
                case "y":// random 1 to 6
                    dice = random.nextInt(6)+1;
                    p += dice;
                    System.out.println(name[0]+" "+dice+" points");
                    break;
                case "n":// Table of Skills
                    System.out.println("\n\n\n\n\n");
                    System.out.println("          Skills\n"
                            + "1.Normal attack   2 dmg  => ues 1 point\n"
                            + "2.Critical attack 5 dmg  => ues 3 point\n"
                            + "3.Heal            3 hp   => ues 5 point\n"
                            + "4.T Post  6 dmg Heal 5%  => ues 7 point\n"
                            + "5.MR.BIG The where20%dmg => ues 10 point");
                    //choic Skills
                    System.out.print("Select skills\n"
                            + "Type 1, 2, 3, 4, 5: ");
                    int sk = input.nextInt();
                    
                    switch(sk)
                    {
                        //Normal attack
                        case 1 :
                            if (p>0) {
                                boss_hp -= 2 ;
                                p -= 1;
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        //Critical attack
                        case 2 :
                            if (p>=3) {
                                boss_hp -= 5;
                                p -= 3;
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        //Heal    
                        case 3 :
                            if (p>=5) {
                                hp += 3; 
                                p -= 5;
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        case 4 :
                            if (p>=7) {
                                hp += Math.round((5.0/100)*hp);
                                boss_hp -= 6;
                                p -= 7;
                                System.out.println("T Post  6 dmg Heal 5%");
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        case 5 :
                            if (p>=10) {
                                int asd = random.nextInt(10)+1;
                                p -= 10;
                                if (asd < 6) {
                                    boss_hp -= (20.0/100)*boss_hp ;
                                    System.out.println("MR.BIG The where 20% dmg");  
                                }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");

                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            break;
                        default :
                            System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                    }
                break;
                }
            }else System.out.println("Please type only yes or no.");
            
            //Enemy Turn
            System.out.println("\n\n\n\n\n");
            System.out.println("          Enemy Turn");
            //random no yes by Enemy
            if (boss_poit > 15 ) {
                gu = random.nextInt(1) + 1;
            }else gu = random.nextInt(10) + 1;
            if (gu >3 ) {
                ball = random.nextInt(6) + 1;
                boss_poit += ball;
                System.out.println("Enemy Roll " + ball + " points");
                System.out.println("       Status\n*Boss*\n" +"Hp = "+boss_hp+"\nPoint = "+boss_poit);
            }else{
                skill_enemy = random.nextInt(5)+1;
                //Skills Enemy
            switch(skill_enemy)
                    {   //Normal attack Enemy
                        case 1 :
                            if (boss_poit>0) {
                                hp -= 2 ;
                                boss_poit -= 1;
                                System.out.println("Normal attack   2 dmg");
                            }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                            System.out.println("       Status\n*Boss*\n" +"Hp = "+boss_hp+"\nPoint = "+boss_poit);
                            break;
                            //Critical attack Enemy
                        case 2 :
                            if (boss_poit>=3) {
                                hp -= 5;
                                boss_poit -= 3;
                                System.out.println("Critical attack 5 dmg");
                            }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                             System.out.println("       Status\n*Boss*\n" +"Hp = "+boss_hp+"\nPoint = "+boss_poit);
                            break;
                            //Heal Enemy
                        case 3 :
                            if (boss_poit>=5) {
                                boss_hp += 3; 
                                boss_poit -= 5;
                                System.out.println("Heal            3 hp ");
                            }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                            System.out.println("       Status\n*Boss*\n" +"Hp = "+boss_hp+"\nPoint = "+boss_poit);
                            break;
                        case 4 :
                            if (boss_poit>=7) {
                                boss_hp += Math.round((5.0/100)*boss_hp);
                                hp -= 6;
                                boss_poit -= 7;
                                System.out.println("T Post  6 dmg Heal 5%"); 
                            }else System.out.println(">>>>>>>>>>Your poit not enough<<<<<<<<<<");
                            System.out.println("       Status\n*Boss*\n" +"Hp = "+boss_hp+"\nPoint = "+boss_poit);
                            break;
                        case 5 :
                            if (boss_poit>=10) {
                                int asd = random.nextInt(10)+1;
                                boss_poit -= 10;
                                if (asd < 6) {
                                    hp -= (20.0/100)*hp ;
                                System.out.println("MR.BIG The where 20% dmg");    
                                }else System.out.println(">>>>>>>>>>miss<<<<<<<<<<");
                            System.out.println("       Status\n*Boss*\n" +"Hp = "+boss_hp+"\nPoint = "+boss_poit);
                            break;
                           
                    }
                break;
                }
                //Check to see if it's dead or not.
                if (hp < 1 ){
                    j += m;
                    System.out.println("You so noob!!!!!!!");
                }else if(boss_hp < 1 ){
                    System.out.println("!!!!!!!!!! You WIN !!!!!!!!!!");
                    j += m;
                }
       
                }
            
            }

        }else System.out.println("              End game");
    }
}

