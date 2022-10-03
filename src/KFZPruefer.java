import java.util.ArrayList;

public class KFZPruefer {
    private static int zustand = 0;
    private static boolean correct;
    private static ArrayList<Character> alphabet= new ArrayList<Character>();
    private static ArrayList<Character> ziffer = new ArrayList<Character>();
    public KFZPruefer(){
     alphabet.add('a');
     alphabet.add('b');
     alphabet.add('c');



    }
    public static void zustandWechseln(char pZeichen){
      boolean contains = false;

        switch(zustand){
          case 0: {
               if(alphabet.contains(pZeichen)){
                   zustand = 1;
                   break;
              }
               if(ziffer.contains(pZeichen)){
                   zustand = 0;
                   break;
               }
               break;
            }
            case 1:{
                if(alphabet.contains(pZeichen)){
                    zustand = 2;
                    break;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 0;
                    break;
                }
                break;
            }
            case 2:{
                if(alphabet.contains(pZeichen)){
                    zustand = 3;
                    break;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 6;
                    break;
                }
                break;
            }
            case 3:{
                if(alphabet.contains(pZeichen)){
                    zustand = 4;
                    break;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 6;
                    break;
                }
                break;
            }
            case 4:{
                if(alphabet.contains(pZeichen)){
                    zustand = 5;
                    break;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 6;
                    break;
                }
                break;
            }
            case 5 :{
                if(alphabet.contains(pZeichen)){
                    zustand = 0;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 6;
                }
            }
            case 6:{

            }
      }
    }

    public static boolean wortUntersuchen(String pEingabe){
             correct =false;
            for(int i = 0; i<pEingabe.length(); i++){    //Jeden Buchstaben einzeln Testen
                zustandWechseln(pEingabe.charAt(i));
            }
            if(zustand ==9){              //Wenn alle Zustände druchgegagnen sind muss das Kennzeichen korrekt sein
                correct = true;
            }
        return correct;   //Ergebnis der Prüfung wird zurück gegeben
    }

    /*public static boolean durchzaehlen(char p){
        if(alphabet.contains(p)){
           return true;
        }else{
            return false;
        }

    }*/

}
