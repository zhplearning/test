package cn.zhp;

import java.util.*;

/**
 * ClassName: ${NAME}
 * Package: cn.zhp
 * Description:
 *
 * @Author 詹慧萍
 * @Create 2024/9/23 8:46
 * @Version 1.0
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boolean A=false;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(7);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.stream().sorted();
        //System.out.println(treeSet);
        Map<Integer,Integer> hashMap=new HashMap<>();
        Map<Integer,Integer> treeMap=new TreeMap<>();
        treeMap.put(1,2);
        treeMap.put(2,2);
        treeMap.put(8,3);
        treeMap.put(3,7);
        for(Integer a:treeMap.keySet()){
            System.out.println(treeMap.get(a));
        }

        Stack<Integer> stack=new Stack<>();
        Queue<Integer> queue=new PriorityQueue<>();

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());


    }

}