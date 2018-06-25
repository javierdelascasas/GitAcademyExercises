import java.lang.reflect.Array;
import java.util.*;

public class V3_ex16 {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            nums.add(i);
//        }
//
//        int maxV = IntegerHelper.maxValue(nums);
//        System.out.println("Max value: " + maxV);
//        List<Integer> evenN = IntegerHelper.evenNumbers(nums);
//        for(Integer nr:evenN){
//            System.out.print(nr.intValue() + " ");
//        }


//        List<Integer> listA = Arrays.asList(1,2,3,4,4,5,6);
//        List<Integer> listB = Arrays.asList(4,5,6,7,8,9);
//
//        List<Integer> union = Helper.listUnion(listA,listB);
//        for(Integer nr:union){
//            System.out.print(nr+" ");
//        }
//
//        List<Integer> intersect = Helper.listIntersect(listA,listB);
//        for(Integer nr:intersect){
//            System.out.print(nr+" ");
//        }
//
//        List<Integer> except = Helper.listExcept(listA,listB);
//        for(Integer nr:except){
//            System.out.print(nr+" ");
//        }

        ArrayList<ArrayList<String>> names = new ArrayList<ArrayList<String>>();

        ArrayList<String> namesStartingWithA = new ArrayList<String>();
        namesStartingWithA.add("Anders");
        namesStartingWithA.add("Andreas");
        namesStartingWithA.add("Anna");

        ArrayList<String> namesStartingWithB = new ArrayList<String>();
        namesStartingWithB.add("Berit");
        namesStartingWithB.add("Bertil");
        namesStartingWithB.add("Bo");

        ArrayList<String> namesStartingWithC = new ArrayList<String>();
        namesStartingWithC.add("Cecilia");
        namesStartingWithC.add("Carter");
        namesStartingWithC.add("Carl");

        names.add(namesStartingWithA);
        names.add(namesStartingWithB);
        names.add(namesStartingWithC);

        printAllNames(names);

    }

    public static void printAllNames(ArrayList<ArrayList<String>> names){
        for(ArrayList<String> list:names){
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}

//class Helper{
//
//    public static List<Integer> listUnion(List<Integer> listA,List<Integer> listB){
//
//        List<Integer> union = new ArrayList<>();
//
//        union.addAll(listA);
//        union.addAll(listB);
//
//        union = removeDuplicate(union);
//
//        return union;
//    }
//
//    public static List<Integer> removeDuplicate(List<Integer> list){
//        List<Integer> removeD = new ArrayList<>();
//        boolean duplicate;
//
//        for(Integer nr:list){
//            duplicate = false;
//            for(Integer nrR:removeD){
//                if(nr == nrR){
//                    duplicate = true;
//                    break;
//                }
//            }
//            if(!duplicate){
//                removeD.add(nr);
//            }
//        }
//        return removeD;
//    }
//
//    public static List<Integer> listIntersect(List<Integer> listA,List<Integer> listB){
//        List<Integer> intersect = new ArrayList<>();
//        for(Integer nrA:listA){
//            for(Integer nrB:listB){
//                if(nrA == nrB){
//                    intersect.add(nrA);
//                }
//            }
//        }
//        intersect = removeDuplicate(intersect);
//
//        return intersect;
//    }
//
//    public static List<Integer> listExcept(List<Integer> listA,List<Integer> listB){
//        List<Integer> except = new ArrayList<>();
//        boolean duplicate = false;
//        for(Integer nrA:listA){
//            duplicate = false;
//            for(Integer nrB:listB){
//                if(nrA == nrB){
//                    duplicate = true;
//                    break;
//                }
//            }
//            if(!duplicate){
//                except.add(nrA);
//            }
//        }
//        return except;
//    }
//}


//class IntegerHelper{
//
//    public static Integer maxValue(List<Integer> nums){
//        int maxV = nums.get(0).intValue();
//        for(Integer nr:nums){
//            if(nr.intValue()>maxV){
//                maxV = nr.intValue();
//            }
//        }
//        return maxV;
//    }
//
//    public static List<Integer> evenNumbers(List<Integer> nums){
//        List<Integer> evenN = new ArrayList<>();
//        for(Integer nr:nums){
//            if(nr.intValue()%2 == 0){
//                evenN.add(nr);
//            }
//        }
//        return evenN;
//    }
//}