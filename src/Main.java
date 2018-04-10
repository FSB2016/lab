import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;
import java.util.Set;
class s1{
    public
            Set<String> set = new HashSet<String>();
    s1(){
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        Iterator<String> i = set.iterator();
        System.out.print("\nВыводим список :");
        while (i.hasNext()){
            String s = i.next();
            System.out.print(s + ", ");
        }
    }
}
class s2{
    public
    HashMap<String,String> map = new HashMap<String, String>();
    s2(){
        map.put("ягода","арбуз");
        map.put("трава","банан");
        map.put("ягода","вишня");
        map.put("фрукт","груша");
        map.put("овощ","дыня");
        map.put("куст", "ежевика");
        map.put("корень","жень-шень");
        map.put("ягода","земляника");
        map.put("цветок","ирис");
        map.put("клубень","картофель");
        System.out.print("\nВыводится второй листинг :");
        Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();
        while(i.hasNext()){
            String k, v;
            k = i.next().getKey();
            v = i.next().getValue();
            System.out.print("\nКлюч : " + k + ", Значение : " + v);
        }
    }
}
class Cat{
    public
    String name;
    static String enter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите имя кота ");
        String s = scanner.nextLine();
        return s;
    }
    Cat(){name = enter();}
}
class s3{
    public
            HashMap<String, Cat> map = new HashMap<String, Cat>();
    s3(){
        for(int i=0; i<10; i++){
            System.out.print("\nВведите имя кота под номером " + (i+1) + ' ');
            Cat cat = new Cat();
            map.put(cat.name, cat);
        }
        System.out.print("\nВыводим список имён котов : ");
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            String name = iterator.next().getKey();
            System.out.print(name + ", ");
        }
    }
}
class s4{
    public
    HashMap<String,String> map = new HashMap<String,String>();
    static String enter(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    s4(){
        for (int i=1; i<6; i++){
            System.out.print("\nВведите две строки ");
            map.put(enter(),enter());
        }
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        System.out.print("\nВыводим список ключей : ");
        while(iterator.hasNext()){
            String s = iterator.next().getKey();
            System.out.print(s + ", ");
        }
    }
}
class s5{
    public
    HashMap<String,String> map = new HashMap<String,String>();
    static String enter(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    s5(){
        for (int i=1; i<6; i++){
            System.out.print("\nВведите две строки ");
            map.put(enter(),enter());
        }
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        System.out.print("\nВыводим список значений : ");
        while(iterator.hasNext()){
            String s = iterator.next().getValue();
            System.out.print(s + ", ");
        }
    }
}
class s6{
    public
    HashMap<String, Object> map = new HashMap<String, Object>();
    static String enter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите строку");
        String s = scanner.nextLine();
        return s;
    }
    s6(){
        for(int i=0; i<10; i++){
            map.put(enter(), new Cat());
        }
        System.out.print("\nВыводим список строк и обьектов :");
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            String k = iterator.next().getKey();
            Object v = iterator.next().getValue();
            System.out.print(k + " - " + v);
        }
    }
}
class Main{
    public static void main(String argc[]) {
        s6 s6 = new s6();
        s1 s = new s1();
        s2 s2 = new s2();
        s3 s3 = new s3();
        s4 s4 = new s4();
        s5 s5 = new s5();

    }
}