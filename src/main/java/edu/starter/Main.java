package edu.starter;

import java.util.Scanner;
/** Student-owned game entry point; replace this message with your own implementation. */
public final class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public Main() {
        player p = new player(100, 5,10);
        enemy e1 = new enemy(30,10);
        battle b = new battle(p,e1);
        System.out.println("Encounter 1");
        boolean result = b.fight();
        p.setDefence(false);
        if (result){
            System.out.println("You win! 1/2");
            enemy e2 = new enemy(45,10);
            battle c = new battle(p, e2);
            System.out.println("Encounter 2");
            boolean res = c.fight();
            if (res){
                System.out.println("you have won 2!, victory");
            }else{
            System.out.println("you have lost 2!");
            }
        }else{
            System.out.println("You lose! 1/2");
        }
    }
    public static void main(String[] args) {
        new Main();
        

        
        }
    }


class player {
    private int damage = 10;
    private int hp = 100;
    private int rec = 5;
    private boolean defence = false;
    private boolean alive = true;
    public player(int hp, int rec, int damage){
        this.hp = hp;
        this.rec = rec;
        this.damage = damage;
    }

    // --- Getters & Setters ---
    public int getdamage() {return damage; }
    public void setdamage(int damage) {this.damage = damage;}
    public int getHp() { return hp; }
    public int getRec() { return rec; }
    public boolean isDefence() { return defence; }
    public void setDefence(boolean defence) { this.defence = defence; }
    public boolean isAlive() { return alive; }
    public void setAlive(boolean alive) { this.alive = alive; }

    public int get_rec(){ return rec; }
    public int get_hp(){ return hp; }

    public void takedamage(int i){
        if ( defence ){
            i = Math.max(i -5,0);
            defence = false;
        }
        hp = Math.max(0, getHp() - i);
        if (getHp() == 0){
            setAlive(false);
        }
    }
    
    public void alive(){ }
    
    public void attack(enemy e){
        e.takedamage(damage);
    }
    public void defend(){
        setDefence(true);
    }
    
    public void special(enemy e){
        if (getRec() >= 3){
            rec = getRec() - 3;
            e.takedamage(15);
            }
    }
    public void recover(){
        rec = Math.min(getRec() + 3, 10);
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
                attack(e);
                break;
            case 2:
                System.out.println("Defence");
                defend();
                break;
            case 3:
                if (getRec() >= 3){
                    System.out.println("Special");
                    special(e);
                    break;
                } else {
                    System.out.println("not enough rec point choose something else");
                    choose(e);
                    break;
                }
            case 4:
                if (rec != 10){
                System.out.println("Recover");
                recover();
                break;
                }else{
                    System.out.println("can't add more res points");
                    choose(e);
                    break;
                }
            default:
                System.out.println("Invalid choice, try again.");
                choose(e);
                break;

        }
    }
}

class enemy {
    private int damage = 10;
    private int hp = 100;
    private boolean defence = false;
    private boolean alive = true;
    public enemy(int hp, int damage){
        this.hp = hp;
        this.damage = damage;
    }

    // --- Getters & Setters ---
    public int getdamage() {return damage;}
    public void setdamage(int damage) {this.damage = damage;}
    public int getHp() { return hp; }
    public boolean isDefence() { return defence; }
    public void setDefence(boolean defence) { this.defence = defence; }
    public boolean isAlive() { return alive; }
    public void setAlive(boolean alive) { this.alive = alive; }


    public void takedamage(int i){
        if (defence) {
            i = Math.max(0,i-5);
            defence = false;
        }
        hp = Math.max(0, getHp() - i);
        if (getHp() == 0){
            setAlive(false);
        }
    }
    public void counterattack(player p){
    p.takedamage(damage);
    }
    
    public void defend(){
        setDefence(true);
    }
}

class battle {
    private player p;
    private enemy e;

    public battle(player p, enemy e){
        this.p = p;
        this.e = e;
    }

    public boolean fight(){
        int turn = 1;
        System.out.println("your hp: " + p.getHp() + " ,enemy hp:" + e.getHp() + " ,res points: " + p.getRec() + " ,defence: " + p.isDefence());
        
        while (p.isAlive() && e.isAlive()){
            p.choose(e);
            System.out.println("your hp: " + p.getHp() + " ,enemy hp:" + e.getHp() + " ,res points: " + p.getRec() + " ,defence: " + p.isDefence());
            
            if (e.getHp() <= 0){
                p.setDefence(false);
                e.setDefence(false);
                return true; 
            }
            

            System.out.println("Counter attack");
            e.counterattack(p);
            System.out.println("your hp: " + p.getHp() + " ,enemy hp:" + e.getHp() + " ,rec points: " + p.getRec() + " ,defence: "  + p.isDefence());
            
            if (p.getHp() <= 0){
                p.setDefence(false);
                e.setDefence(false);
                return false;
            }
            
            turn = turn + 1;

        }
        p.setDefence(false);
        e.setDefence(false);

        return false;
    }
}
    
