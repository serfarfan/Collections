package com.cahs.collections;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Sets: No se permiten elementos duplicados
        //A HashSet stores its elements in a hash table.
        //A TreeSet stores its elements in a sorted tree structure
        Set<String> set = new HashSet<>();
//        System.out.println("Review " + set.add("Sparrow")); // true
//        System.out.println("Review " + set.add("sparrow")); // false
        //Limpiando el Set
        set.clear(); // []
        System.out.println("Review " + set.isEmpty()); // true
        System.out.println("Review " + set.size()); // 0

        //****Queues****


        ////****Maps****

    }
}