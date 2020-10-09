package act8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Deck {
    public static void main(String[] args) {
        
        
        Card[] cartasTrebol = CartasDeTrebol();
        Card[] cartasCorazon = CartasDeCorazon();
        Card[] cartasDiamante = CartasDeDiamante();
        Card[] cartasEspada = CartasDeEspada();
        
           List <Card> listaDeTreboles = Arrays.asList(cartasTrebol);
           List <Card> listaDeCorazones = Arrays.asList(cartasCorazon);
           List <Card> listaDeDiamantes = Arrays.asList(cartasDiamante);
           List <Card> listaDeEspadas = Arrays.asList(cartasEspada);
           
           Stack <Card> pilaDeTreboles = new Stack<> ();
           int ct = cartasTrebol.length;
           int cont1 = 0;
           while(cont1 < ct){
               pilaDeTreboles.push(cartasTrebol[cont1]);
               cont1 ++;
           }
           
           Stack <Card> pilaDeCorazones = new Stack<> ();
           int cc = cartasCorazon.length;
           int cont2 = 0;
           while(cont2< cc){
               pilaDeCorazones.push(cartasCorazon[cont2]);
               cont2 ++;
           }
           
           Stack <Card> pilaDeDiamantes = new Stack<> ();
           int cd = cartasDiamante.length;
           int cont3 = 0;
           while(cont3< cd){
               pilaDeDiamantes.push(cartasDiamante[cont3]);
               cont3 ++;
           }
           
           Stack <Card> pilaDeEspadas = new Stack<> ();
           int ce = cartasEspada.length;
           int cont4 = 0;
           while(cont4< ce){
               pilaDeEspadas.push(cartasEspada[cont4]);
               cont4 ++;
           }
        char e;
        
       
        int cantidad = 52;
        
        System.out.println("Inicializando baraja...");
        
        Scanner input = new Scanner(System.in);
        
        
        while(cantidad <53){ 
           System.out.println("Ahora que desea hacer?");
           System.out.println(" A) shuffle ");
           System.out.println(" B) head (mostrar la carta de arriba)");
           System.out.println(" C) pick (escoger una carta al azar)");
           System.out.println(" D) hand (escoger cinco cartas)");
           
           
           
           e = input.nextLine().charAt(0);
           
           Card carta_e;
           if (e == 'A' || e == 'a') {
               
               System.out.println("Cartas reborujadas");
               Collections.shuffle(pilaDeEspadas);
               Collections.shuffle(pilaDeDiamantes);
               Collections.shuffle(pilaDeCorazones);
               Collections.shuffle(pilaDeTreboles);
           } else if (e == 'B' || e == 'b') {
               
                int x = (int) (Math.random()* 5.0);
                
                if (x == 1){
                    carta_e = pilaDeTreboles.firstElement();
                    System.out.println("La carta que esta arriba es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeTreboles.pop();
                } else if (x == 2){
                    carta_e = pilaDeCorazones.firstElement();
                    System.out.println("La carta que esta arriba es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeCorazones.pop();
                } else if (x == 3){
                    carta_e = pilaDeCorazones.firstElement();
                    System.out.println("La carta que esta arriba es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeDiamantes.pop();
                } else {
                    carta_e = pilaDeEspadas.firstElement();
                    System.out.println("La carta que esta arriba es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeEspadas.pop();
                }
                
                cantidad --;
            } else if (e == 'C' || e == 'c') {
                System.out.println("A conituacion solo haga click para esocger una carta al azar, mostrarsels y retirarla");
                
                int y = (int) (Math.random()* 5.0);
                
                if (y == 1){
                    int z = (int)(14* Math.random());
                    carta_e = pilaDeTreboles.elementAt(z);
                    System.out.println("La carta esocgida es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeTreboles.pop();
                } else if (y == 2){
                    int z = (int)(14* Math.random());
                    carta_e = pilaDeTreboles.elementAt(z);
                    System.out.println("La carta escogida es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeCorazones.pop();
                } else if (y == 3){
                    int z = (int)(14* Math.random());
                    carta_e = pilaDeTreboles.elementAt(z);
                    System.out.println("La carta escogida es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeDiamantes.pop();
                } else {
                    int z = (int)(14* Math.random());
                    carta_e = pilaDeTreboles.elementAt(z);
                    System.out.println("La carta escogida es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeEspadas.pop();
                }
                cantidad --;
            } else {
                
               for (int f = 0; f < 5; f++) {
                int xx = (int) (Math.random() * 5.0);
                if (xx == 1){
                    int xy = (int)(14.0* Math.random());
                    carta_e = pilaDeTreboles.elementAt(xy);
                    System.out.println("La carta esocgida para salir en el lugar " +f+" es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeTreboles.pop();
                } else if (xx == 2){
                    int xy = (int)(14.0* Math.random());
                    carta_e = pilaDeTreboles.elementAt(xy);
                    System.out.println("La carta escogida para salir en el lugar "+f+" es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeCorazones.pop();
                } else if (xx == 3){
                    int xy = (int)(14.0* Math.random());
                    carta_e = pilaDeTreboles.elementAt(xy);
                    System.out.println("La carta escogida para salir en el lugar "+f+" es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeDiamantes.pop();
                } else {
                    int xy = (int)(14.0* Math.random());
                    carta_e = pilaDeTreboles.elementAt(xy);
                    System.out.println("La carta escogida para salir en el lugar "+f+" es: ");
                    System.out.println(carta_e.getValor()+", "+carta_e.getIcono()+", "+carta_e.getColor());
                    pilaDeEspadas.pop();
                }   
                cantidad --;
               }  
            }
        }
    }


 
    public static Card[] CartasDeTrebol() {
        Card [] T = new Card [13];
        String ai = "Trebol";
        String ac = "Negro";
        for (int i = 0; i < 13; i++) {
                    String av;
                    if (i == 1) {
                        av = "A";
                    } else if (i == 10){
                        av = "J";
                    } else if (i == 11){
                        av = "Q";
                    } else if (i == 12){
                        av = "K";
                    } else {
                        av = String.valueOf(i+1);
                    }
                    
                    T[i] = new Card(av, ai, ac);
        }
        return T;
    }

    public static Card[] CartasDeCorazon() {
        Card [] C = new Card [13];
        String ai = "Corazones";
        String ac = "Rojo";
        for (int i = 0; i < 13; i++) {
                    String av;
                    if (i == 1) {
                        av = "A";
                    } else if (i == 10){
                        av = "J";
                    } else if (i == 11){
                        av = "Q";
                    } else if (i == 12){
                        av = "K";
                    } else {
                        av = String.valueOf(i+1);
                    }
                    
                    C[i] = new Card(av, ai, ac);
        }
        return C;
    }

    public static Card[] CartasDeDiamante() {
        Card [] D = new Card [13];
        String ai = "Corazones";
        String ac = "Rojo";
        for (int i = 0; i < 13; i++) {
                    String av;
                    if (i == 1) {
                        av = "A";
                    } else if (i == 10){
                        av = "J";
                    } else if (i == 11){
                        av = "Q";
                    } else if (i == 12){
                        av = "K";
                    } else {
                        av = String.valueOf(i+1);
                    }
                    
                    D[i] = new Card(av, ai, ac);
        }
        return D;
    }

    public static Card[] CartasDeEspada() {
        Card [] E = new Card [13];
        String ai = "Corazones";
        String ac = "Rojo";
        for (int i = 0; i < 13; i++) {
                    String av;
                    if (i == 1) {
                        av = "A";
                    } else if (i == 10){
                        av = "J";
                    } else if (i == 11){
                        av = "Q";
                    } else if (i == 12){
                        av = "K";
                    } else {
                        av = String.valueOf(i+1);
                    }
                    
                    E[i] = new Card(av, ai, ac);
        }
        return E;
    }
    
}