package com.mi.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vijayrathi on 04/02/18.
 */
public class StreamTest
{
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

//        Stream<Integer>  integerStream = integerList.stream();
//
//        Function<Integer, Integer> integerFunction = new Function<Integer, Integer>()
//        {
//            @Override
//            public Integer apply(Integer o)
//            {
//                return o * 2;
//            }
//        };
//
//
//        Stream<Integer> integerStream1 = integerStream.map(integerFunction);
//
//        BinaryOperator<Integer> integerBinaryOperator = new BinaryOperator<Integer>()
//        {
//            @Override
//            public Integer apply(Integer i, Integer j)
//            {
//                return i + j;
//            }
//        };
//
//        Integer integer = integerStream1.reduce(0, integerBinaryOperator);
//
//        System.out.println(integer);


        System.out.println(integerList.stream().map(i -> 2 * i).reduce(0, Integer::sum));
    }
}
