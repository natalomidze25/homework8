import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(3);
        Set<Integer> commonSet = common(set1,set2);
        for(Integer x : commonSet ){
            System.out.println(x);
        }


        //davaleba 2
        Map<Integer,List<String>> cars = new HashMap<>();
        cars.put(1996,List.of("toyota","mercedes"));
        cars.put(1997,List.of("toyota","mercedes","dodge"));
        cars.put(1998,List.of("toyota","mercedes","dodge","fiat"));
        System.out.println(carMax(cars));
    }
    public static Set<Integer> common(Set<Integer>set1, Set<Integer>set2){
        Set<Integer> result = new HashSet<Integer>();

        set1.forEach(x->{
            if(set2.contains(x)){
                result.add(x);
            }
        });

        return  result;
    }

    public static Integer carMax(Map<Integer,List<String>> map){
        Integer maxCount = 0;
        Integer maxCountYear = 0;
        for (Integer year : map.keySet()){
            if(map.get(year).size()>maxCount){
                maxCount = map.get(year).size();
                maxCountYear = year;
            }
        }
        return  maxCountYear;
    }
}

//დაწერე მეთოდი, რომელსაც გადაეცემა
//ორი ინტეჯერის სეტი არგუმენტად და
//დააბრუნე ამ ორ სეტში არსებული საერთო
//ელემენტები ისევ სეტად