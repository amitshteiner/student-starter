package edu.starter;

import java.util.Scanner;
/** Student-owned game entry point; replace this message with your own implementation. */
public final class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public boolean fight(player p, enemy e){
            int turn = 1;
            System.out.println("your hp: " + p.hp + " ,enemy hp:" + e.hp + " ,rec points: " + p.rec);
            while (p.alive && e.alive){
                p.choose(e);
                System.out.println("your hp: " + p.hp + " ,enemy hp:" + e.hp + " ,rec points: " + p.rec);
                if (e.hp <= 0){
                    return true; 
                }
                e.defence = false;
                System.out.println("Couanter attack");
                e.counterattack(p, 10);
                System.out.println("your hp: " + p.hp + " ,enemy hp:" + e.hp + " ,rec points: " + p.rec);
                if (p.hp <= 0){
                    return false;
                }
                turn = turn + 1;
                p.defence  = false;
                 
            }
            return false;
        }
    public Main() {
        player p = new player();
        enemy e = new enemy();
        boolean result = fight(p, e);
        if (result){
            System.out.println("You win!");
        }else{
            System.out.println("You lose!");
        }
    }
    public static void main(String[] args) {
        new Main();
        

        
        }
    }


class player{
    int hp = 100;
    int rec = 5;
    boolean defence = false;
    boolean alive = true;
    public void attack(enemy e, int damage){
        if (e.defence){
                    e.defence = false;
                    e.hp = Math.max(e.hp - (damage / 2 ), 0);
    
                    
        }else{
                e.hp = Math.max(e.hp - damage, 0) ;            
        }if (e.hp == 0){
            e.alive = false;
        }
    }
    public void defend(){
        defence = true;
    }
    public void special(enemy e){
        if (rec >= 3){
            e.hp -= 15;
            if (e.hp < 0){
                e.hp = 0;}
            rec -= 3;
            }
        if (e.hp <= 0){
                e.alive = false;
        }
        
        }
            
        public void recover(){
            rec = Math.min(rec+3,10);
   

            

            
        }
            public String get_name(){
            Scanner r = new Scanner(System.in);
        
            System.out.println("Enter your name: ");
            String name = r.nextLine();
            return name;
        }
        public void choose(enemy e){
            System.out.println("Choose your action: ");
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Special");
            System.out.println("4. Recover");
            Scanner b = new Scanner(System.in);
            int choice = b.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Attack");
                    attack(e, 10);
                    break;
                case 2:
                    System.out.println("Defence");

                    defend();
                    break;
                    
                case 3:
                    if (rec >= 3){
                        System.out.println("Special");
                    special(e);
                    break;
                    }else{
                    System.out.println("not enough rec point choose something else");
                    choose(e);
                    break;
                    }
                    
                case 4:
                    System.out.println("Recover");
                    recover();
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    choose(e);
                    break;
            }
        }




    

}

class enemy{
    int hp = 100;
    boolean defence = false;
    boolean alive = true;
    public void counterattack(player p, int damage){
        if (p.defence){
                    p.defence = false;
                    p.hp = Math.max(p.hp - (damage / 2 ), 0);
    
                    
        }else{
                p.hp = Math.max(p.hp - damage, 0) ;            
        }if (p.hp == 0){
            p.alive = false;
        }
    }
    public void defend(){
        defence = true;
    }
}
