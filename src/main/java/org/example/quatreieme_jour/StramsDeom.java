package org.example.quatreieme_jour;

import java.util.List;

public class StramsDeom {
     public static void main(String[] args) {
        var lst = List.of(new  Person("john" , "kennedy",12) , new Person("paul" , "goha", 21));
        // la méthode Filter renvoie un Stream alors on peut encore manipuler les elements, et cette méthode est d'une type non-terminale fonctionne
         //il y a également les fonctoinnes terminal, ces fonctionnes permet de terminier le stream
         //ATTENTION la stream est détruit après l'appel d'une méthode Terminal
        var stream = lst.stream().filter(p -> p.getAge() >= 10);


        //la fontionne filter, il renvoie des éléments filtrés de type identique au type d'entrée. alors qur le la méthode Map il permet de renvoyer une autre type de donnée.
         var res = lst.stream()
                 .filter(p -> p.getAge() >= 10)
                 .flatMap(person -> person.getCarTypes().stream())
                 .map(car -> car.charAt(0))
                 .count();
    }
}
