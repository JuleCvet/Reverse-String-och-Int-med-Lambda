
package lambdajava2tyresoTestGen;

import java.util.*;

public class TestGen2 {

    public static void main(String[] args) {
        ReverceString s = new ReverceString();
        TalFojld ss = new TalFojld();
        System.out.println(ss.func(51));
       System.out.println(s.func("Jule Goce"));
    }

    
//    @Override
//    public Object func(Object obj) {
//        if (obj instanceof String) {
//            String str =(String)obj;
//            StringBuilder sb = new StringBuilder();
//            for (int i = str.length() - 1; i >= 0; i--) {
//                sb.append(str.charAt(i));
//                
//            }
//            return sb.toString();
//        }else if(obj instanceof Integer){
//            Integer intg = (Integer)obj;
//            List<Integer> list = new ArrayList<>();
//            for(int i=3; i<intg ;i+=3)
//                list.add(i);
//            return list;
//        }
//        return null;
//    }

}
