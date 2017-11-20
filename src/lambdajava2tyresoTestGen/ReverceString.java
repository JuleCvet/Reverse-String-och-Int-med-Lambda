
package lambdajava2tyresoTestGen;

public class ReverceString implements Gen<String,StringBuilder>{

    @Override
    public StringBuilder func(String s) {
       StringBuilder sb = new StringBuilder(s);
       return sb.reverse();       
//1.Tar emot teckensträngar och returnerar teckensträngar i omvänd ordning.
//Metoden charAt(index) kan vara till hjälp för lösningen.
    }  
}
//
    //public T func(K t);
//Gen gen;
//    gen reverse = (str) ->  { //imeto na interfejs, ime na lambda = vraka(STR)-> {}
//      String result = ""; //returnianata String- novata
// 
//      for(int i = str.length()-1; i >= 0; i--) 
//        result += str.charAt(i); //zemi gi i pretvori gi vo char
// 
//      return result; //vrati ja novata string
//    }; 
// 
