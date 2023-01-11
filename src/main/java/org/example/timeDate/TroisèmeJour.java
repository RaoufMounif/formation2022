package org.example.timeDate;

import java.io.*;
import java.nio.channels.FileChannel;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class TroisèmeJour {

    public TroisèmeJour() {
        //Dates à l'ancien  JAVA (deprecated)
        java.util.Date date = new Date(2022, 11, 25 ); //25 DECEMBRE 2022 les mois commancent par 0
        //Dates à l'ancien  JAVA (deprecated)
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2022, Calendar.DECEMBER,25);
        java.util.Date date1 = cal.getTime();


        //Date avec JAVA > 8
        LocalDate.of(2022, 12,25);

        var d = LocalDate.of(2022,12,21);
        var t = LocalTime.of(12,00);
        var ldt  = LocalDateTime.of(d,t);
        OffsetDateTime odt = OffsetDateTime.of(ldt , ZoneOffset.ofHours(1));





    }
    public void readWriteAPI(String src, String dest) throws IOException {

        //l'API de Read Write

        /***
         * l'unité le plus petit c'est le stream
         * avec  inputStream/outputStream on peut lire/ecrire un Byte
         *
         */

        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dest);


        /**
         * Copy un fichier, cette méthode est très lente parce que l'accès sur le disque dur est couteaux et
         * à chaque accès, on ne lit qu'un seul Byte on peut améliorer cette implémentation en utilisant les buffers
         * */
        int readedByte;
        while ((readedByte=in.read()) != -1){
            out.write(readedByte);
        }
        /**
         * Copier un fichier avec l'amélioration
         */
        int length;
        byte[] myBuffer = new byte[1024*8]; //8 kiloByte buffer

        while ((length = in.read(myBuffer))!=-1){
            out.write(myBuffer,0,length); // on écrit 8 kb à la fois on difinit qu'on commence de 0 jusqu'à la fin buffer où il est rempli
        }


        //Pour la certife il faut bien manipuler les les streams et également le FileChannel







    }
    public static void main(String[] args) throws IOException {

        //////////////////////////Exceptions //////////////////
        //ATTENTION Throws n'est pas la même que Throw
        //Throws : on l'utilise pour signaler que ma méthode peut-être elle génère une exception
        //Throw c'est l'ordre donné pour lancer l'exception

        System.out.println(meth());
        System.out.println(meth1());


    }
    //ATTENTION LE BLOCK FINALLY il s'éxcuter TOUJOUR TOUJOUR TOUJOUR si par exemple il contient un return il va être executer avant le block de try
    //regarde l'exemple suivant le retour c'est HI et non pas HELLO
    public static String meth(){
        try{

            System.out.println((String) Objects.requireNonNull(null));
            return "HELLO";

        }finally {
            return "HI";
        }
    }
    //Les exception de type RunTime on est pas obligé de les catcher contrairement aux aurtes exceptions il faut les catcher et ça génère un erreur de compliation
    //l'ordre de block de catch est important, il faut mettre l'ordre de plus spécifique vers le plus général ex: OutOfBoundrey --> NullPointer --> IOException --> Exception, Attention si on fait l'ordre inversé il y arua que le premier block executé
    public static String meth1(){

        return "";
    }
}
