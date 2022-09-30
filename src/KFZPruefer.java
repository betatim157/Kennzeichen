public class KFZPruefer {
    private static int zustand = 0;
    private static boolean correct;
    public KFZPruefer(){

    }
    public static void zustandWechseln(char pZeichen){


        switch(zustand){
          case 0: {
              switch(pZeichen) {
                  case : {zustand = 1;} break;
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

}
