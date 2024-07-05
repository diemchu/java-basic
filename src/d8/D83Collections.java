package d8;

import java.util.*;

public class D83Collections
{
    public static void main(String[] args)  {
        // List
        // Data의 중복을 허용하며 , 순서를 지키는 데이토 모음
        List<String> skillList = new ArrayList<>();
        skillList.add("Java");
        skillList.add("Python");
        skillList.add("Kotlin");
        skillList.add("Java");
        System.out.println(skillList);
        System.out.println(skillList.get(2));
        System.out.println(skillList.getClass());
        try {
            System.out.println(skillList.get(4));
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBounds 에러!!");
        }
        skillList.add(1,"JS");
        System.out.println(skillList);
        System.out.println("find java = "+skillList.contains("Java"));
        System.out.println("===========================================================");

        //Set
        // 순서를 보장하지 않으며, 중복을 허용하지 않는다
        Set<String> skillSet = new HashSet<>();
        skillSet.add("Java");
        skillSet.add("Python");
        skillSet.add("Kotlin");
        skillSet.add("Java");
        System.out.println(skillSet);
        System.out.println(skillSet.contains("Java"));
        System.out.println(skillSet.contains("Node.js"));
        System.out.println(skillSet.remove("Python"));
        System.out.println(skillSet);
        System.out.println("===========================================================");

        // Set <-> List
        List<String> setToList = new ArrayList<>(skillSet);
        System.out.println(setToList.get(0));
        setToList.add("Java");
        setToList.add("Java");
        System.out.println(setToList);
        Set<String> listToSet = new HashSet<>(setToList);
        System.out.println(listToSet);

        System.out.println("===========================================================");
        List<Phone> phonesList = new ArrayList<>();
        Random random = new Random();
        System.out.println("정렬하기전 !");
        for(int i = 0; i < 10 ; i++){
            phonesList.add(new Phone(String.format("%s %d","Phone",i),random.nextInt(100,10000) ));
        }
        for(Phone p : phonesList){
            System.out.println(p);
        }
        Collections.sort(phonesList);
        System.out.println("정렬한 후 !");
        for(Phone p : phonesList){
            System.out.println(p);
        }

        //===================================================
        System.out.println("===========================================================");
        // Iterator:어떤 Collection 의 데이터를 하나씩 꺼내 오는 객체
        //List의 Iterato를 가져오는 메서드
        Iterator<Phone> listIter =  phonesList.listIterator();
        // 이 Iterator가 가르키는 데이터 모음 중, 다음에 볼 데이터가 있는지
        // -> 아직 확인할 데이터가 남았는지
        // trỏ đến vị trị đầu tiên của phonesList
        System.out.println("list[0]" + listIter.next());
        System.out.println("list[1]" + listIter.next());
        while (listIter.hasNext()){
            System.out.println(listIter.next());
        }

        // Iterable을 구현한 클래스는,
        // for - each에서 사용이 가능하다.
        System.out.println("===========================================================");
        Map<String,String> me = new HashMap<>();
        me.put("name","duc diem");
        me.put("age ","100");
        me.put("email","chuducdiem1@gmail.com");
        System.out.println(me.get("name"));
        System.out.println(me.replace("name","duc diem","hai nam"));
        System.out.println(me.get("name"));

        Map<Long,String> bus = new HashMap<>();
        bus.put(9003L, "종로에서 운중동까지");
//        bus.put(2003L, "명동에서 강남까지");
        // 이미 존재하면 떺어쓰기
//        bus.put(2003L, "명동에서 동대문까지");
        bus.putIfAbsent(2003L,"내곡동에서 시내까지");
        bus.putIfAbsent(2004L,"홍제동에서 시내까지");
        System.out.println(bus.get(2003L));
        System.out.println(bus.getOrDefault(2003L,"unknow"));
        System.out.println(bus.containsKey(2003L));
        // key 연결된 value를 반환하고 제거 (value 반환된다)
        System.out.println(bus.remove(9003L));

        Set<Long> confKeySet = bus.keySet();
        for(Long key : confKeySet){
            System.out.println(bus.get(key));
        }
        // Entry: key와 value 한쌍
        Set<Map.Entry<Long, String>> etrySet = bus.entrySet();
        for(Map.Entry<Long,String> entry : etrySet){
            System.out.println("key = "+entry.getKey());
            System.out.println("value = "+entry.getValue());
        }

    }
}
