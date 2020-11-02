/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author salik
 */
public class Project2 {
    int bilanganAcak, angkaTebakan, score, percobaan;
    void bilanganAbstrak(){
       Random bilanganRandom = new Random();
       this.bilanganAcak = bilanganRandom.nextInt(101);
       Scanner input = new Scanner(System.in);
       score = 100;
       percobaan = 1;
       do{ 
           System.out.print("masukkkan Angka : ");
           this.angkaTebakan = input.nextInt();
           if (score == 0){
               System.out.println("Game Over");
               break;
           }
           if (angkaTebakan < bilanganAcak){
               System.out.println("oh bilanganmu terlalu kescil Boy, silahkan coba lagi...");
               score -= 2;
           } else if(angkaTebakan > bilanganAcak){
               System.out.println("waduh...bilanganmu terlalu besar Kawan, silahkan coba lagi!");
               score -= 2;
           } else{
               System.out.println("Mantapp...Tebakanmu tepat sekali Boy, Selamat");
               if(percobaan <= 5){
                   System.out.println("Yuhuuuu...selamat kamu mendapatkan bonus +50");
                   score += 50;
               }
               System.out.println("Skore : "+score);
               break;
           }
           percobaan += 1;
       }while(this.angkaTebakan != this.bilanganAcak);
    }
}
