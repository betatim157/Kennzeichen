import java.util.ArrayList;

public class KFZPruefer {
    private static int zustand = 0;
    private static boolean correct;
    private static ArrayList<Character> alphabet= new ArrayList<Character>(); //Arraylist
    private static ArrayList<Character> ziffer = new ArrayList<Character>();
    public KFZPruefer()
    {
     //Erstellen des Alphabets
     alphabet.add('A');
     alphabet.add('B');
     alphabet.add('C');
     alphabet.add('D');
     alphabet.add('E');
     alphabet.add('F');
     alphabet.add('G');
     alphabet.add('H');
     alphabet.add('I');
     alphabet.add('J');
     alphabet.add('K');
     alphabet.add('L');
     alphabet.add('M');
     alphabet.add('N');
     alphabet.add('O');
     alphabet.add('P');
     alphabet.add('Q');
     alphabet.add('R');
     alphabet.add('S');
     alphabet.add('T');
     alphabet.add('U');
     alphabet.add('V');
     alphabet.add('W');
     alphabet.add('X');
     alphabet.add('Y');
     alphabet.add('Z');
      //Erstellen der zugelassenen Ziffern
     ziffer.add('0');
     ziffer.add('1');
     ziffer.add('2');
     ziffer.add('3');
     ziffer.add('4');
     ziffer.add('5');
     ziffer.add('6');
     ziffer.add('7');
     ziffer.add('8');
     ziffer.add('9');



    }
    public static void zustandWechseln(char pZeichen)
    {
        switch(zustand){
          case 0: {
               if(alphabet.contains(pZeichen)){ //Geht die Liste durch
                   zustand = 1;
                   break;
              }
               if(ziffer.contains(pZeichen)){
                   zustand = -1;
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
                    zustand = -1;
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
                    zustand = -1;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 6;
                }
                break;
            }
            case 6:{
              if(alphabet.contains(pZeichen)){
                  zustand = -1;
                  break;
              }
                if(ziffer.contains(pZeichen)){
                    zustand = 7;
                    break;
                }
              break;
            }
            case 7:{
                if(alphabet.contains(pZeichen)){
                    zustand = -1;
                    break;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 8;
                    break;
                }
                break;
            }
            case 8:{
                if(alphabet.contains(pZeichen)){
                    zustand = -1;
                    break;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = 9;
                    break;
                }
                break;
            }
            case 9:{
                if(alphabet.contains(pZeichen)){
                    zustand = -1;
                }
                if(ziffer.contains(pZeichen)){
                    zustand = -1;
                }
            }

      }
    }

    public static boolean wortUntersuchen(String pEingabe) //Bsp AA7
    {
             correct =false;
            for(int i = 0; i<pEingabe.length(); i++){    //Jeden Buchstaben einzeln Testen
                zustandWechseln(pEingabe.charAt(i));
            }
            if(zustand == 6 || zustand == 7 || zustand== 8 || zustand == 9){      //Wenn alle Zustände druchgegagnen sind muss das Kennzeichen korrekt sein
                correct = true;
            }
            zustand = 0; //Anfangszustand
        return correct;   //Ergebnis der Prüfung wird zurück gegeben
    }


}
