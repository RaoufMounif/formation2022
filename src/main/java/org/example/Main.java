package org.example;

import java.lang.ref.Cleaner;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MoyenDeTransport obj = new Voiture();
        /**
         *  /!\ ATTENTION l'appel des méthodes en Java se fait au niveau plus bas puis ça remonte au père si jamais l'enfant n'a pas implémenté la fonctionne Start()
         */

        obj.start();
        /**
         * /!\ l'attribuit de class père sera modifié
         * */
        obj.maxSpeed = 100;




        /////////////////////////////

        int a; // 32 bit entier signé
        float b; // 32 bites flottant signé
        boolean c ; // true false
        long d; // 64 entier signé
        short e ; // 16 bites eniter signé
        double f; // 64 flottant signé
        byte g ; // 8 bit eniter signé entre -127 et +128 n'oubliez pas la bit de sign
        char h; // 16 bit eniter non signé (unicode non seulement les ascii )

        /**
         *          //0   64   32  16   8  4  2  1
         *         //0    0    0   0   0  1  0  1   ça fait 5
         *         //1    1    1    1    1   1  0  1   ça fait -3 (il faut inversé les 1 en 0 puis ajouter 1 pour obtenir la valeur final
         * */


        /**
         * Attestion l'affectation de nombre
         *
         * int x = 55; x = 55
         * int x = 055; ça commance par 0 cela veut dire que c'est une représentation octal-decimal (base 8) x= 45 en décimal
         * int x = 08; Compiler Error (hors plage de chiffre autorisé le chiffre 8 n'existe pas sur la représentation octal-decimal
         *char ne prends rien automatiquement a part un charactère ex :int x = 10, char c = x //ça ne compile pas
         * 0 octa
         * 0X héxa
         * 0b Binaire
         * */

        //if the first one is true the compiler dosen't call the seconde one
        if(check1() || check2() ){
            System.out.println("Hey it's time to eat");
        }
        //the compiler check the both of the conditions
        if(check1() | check2()){
            System.out.println("Hey it's time to eat");

        }
        //if the first one is true the compiler dosen't call the seconde one
        if (check1() && check2()){
            System.out.println("Hey it's time to eat");

        }
        //the compiler check the both of the conditions
        if(check1() & check2()){
            System.out.println("Hey it's time to eat");

        }




        // ~ operator il inverse les 0 par des 1 et les 1 par les 0  ça ne marche que sue les entier
        int telda = ~2; // telda = -3 (il inverse la sign => on rajoute 1

        // & |
        int i = 5 ; //101
        int j = 6 ; //110

        int k = (i&j); // 1 0 0 = 4 operation AND
        int q = (i|j); // 1 1 1 = 7 operation OR
        int w = (i^j); // 1 0 0 = 4 operation XOR

        int res = j << 3 ; // res = 40 décalage trois bits à gauche 110 --> 110000
        int res1 = j << 1 ; //

        int res2 = j>>2 ; // il decale en gardant la sign de la chiffre principale en rajoutant soit 1 soit 0 selon la sign de chiffre
        int res4 = j >>> 2; // il déclate en ajoutant que les 0


        /**
         * boucle infinie et ça COMPILE
         * for (;;){
         *
         *         }
         *
         *
         * for( XXXX ; YYYY; ZZZZ){
         * }
         *
         * XXXX : appelé au permier et pour une seul fois on peut écrire tout ce qu'on veut
         * YYYY: appelé au premier ligne ici on est OBLIGE de mettre une valeur boolean
         * ZZZZ: appelé au dernière
         *
         *
         * for (system.out.preintln("hi") ; true ; system){
         * }
         *
         *
         *
         * */

        /**
         * switch
         *
         *  les types primitive qui ne marche pas  long float double boolean
         *  les type qui marche avec int , short, char , String , enum
         *
         *
         * */


        /**
         * label : ça marche seulement avant les boucles sinon ça marche pas
         * raw :
         * while(true){
         * .....
         * for(int i = 0 ; i < 10 ; i++){
         *  if(hasSomethig () )  continue raw; // ça fait revenir sur la ligne row
         *  if(hasNothing() ) break raw;
         * }
         *
         * }
         *
         *
         * */

        int F = 5;
        int S = 10;
        if( (F=S)<50){

        }
        boolean bool =false;
        boolean bool2 = true;
        if(bool != bool2){

        }
/*
        // la variable y est final il changera jamais cela veut dire que la condition de while sera toujour true ce qui rend le bloque de code qui suis le while Dead
        final int y = 6 ;
        while (y< 20){
            System.out.println();
        } // par contre si on fait final int y ; puis y = 6 ça marchera parceque le compilateur ne peut pas détécter la valeur de y sans execution
*/
        int Y = 5 ;
        while(Y < 10){
            System.out.println(Y);
        }

        // ça marche en autocast pour les types proimitife mais pas avec les références
        int t = 4 ;
        long r = t;
        // ça ne marche pas avec les talble parceque la table est un objet => c'est un référence sauf si le type est le meme
        //int[] tt = {4};
        //long[] rr = tt;


        //La première dimenssion est obligatoir pour les tableau mais pas les autre
        int[][][][] arratest = new int[5][][][];



    }
    static boolean check1(){
        System.out.println("Would you drink water?");
    return true;
    }
    static  boolean check2(){
        System.out.println("Hey you called the first one or not");
        return false;
    }
}


