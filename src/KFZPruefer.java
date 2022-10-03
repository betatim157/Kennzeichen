import java.util.ArrayList;

public class KFZPruefer {
    private static int zustand = 0;
    private static boolean correct;
    private static ArrayList<Character> alphabet= new ArrayList<Character>();
    public KFZPruefer(){
     alphabet.add('a');
     alphabet.add('b');

    }
    public static void zustandWechseln(char pZeichen){


        switch(zustand){
          case 0: {
              switch(pZeichen) {
                  case durchzaehlen(pZeichen) : {zustand = 1;} break;
                  case 'B': {zustand = 0;} break;
              }
          }break;

      }
    }

    public static boolean wortUntersuchen(String pEingabe){
             correct =false;
            for(int i = 0; i<pEingabe.length(); i++){    //Jeden Buchstaben einzeln Testen
                zustandWechseln(pEingabe.charAt(i));
            }
            if(zustand ==10){              //Wenn alle Zustände druchgegagnen sind muss das Kennzeichen korrekt sein
                correct = true;
            }
        return correct;   //Ergebnis der Prüfung wird zurück gegeben
    }

    public static char durchzaehlen(char p){
        if(alphabet.contains(p)){
           return p;
        }else{
            return '!';
        }

    }

}
