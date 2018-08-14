package main.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class GlobalTest {

    @Test
    public void main() {

        String [] arr1B = {"1348627_5","1238_4765","BFS"};
        String [] arr1D = {"1348627_5","1238_4765","DFS"};

        String [] arr2B = {"281_43765","1238_4765","BFS"};
        String [] arr2D = {"281_43765","1238_4765","DFS"};

        String [] arr3B = {"281463_75","1238_4765","BFS"};
        String [] arr3D = {"281463_75","1238_4765","DFS"};

        Object [] arrSet = {arr1B,arr2B,arr3B, arr1D, arr2D, arr3D};

        for (Object arr: arrSet
             ) {
             Global.main((String [])arr);
            System.out.println("==============================\n");
        }

    }
}