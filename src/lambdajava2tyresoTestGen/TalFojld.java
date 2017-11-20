
package lambdajava2tyresoTestGen;

import java.util.*;

public class TalFojld implements Gen<Integer,List<Integer>>{

    @Override
    public List<Integer> func(Integer t) {//zema Integer kako parametar vraka Lista
       List<Integer> list = new ArrayList<>();//zacuvanata nova lista za vrakanje
       for(int i=3; i<=t; i=i+3)
                list.add(i);
       return list;
//2. Tar emot ett tal och returnerar en talföljd, se exempel på utskriften.       
    }
}
