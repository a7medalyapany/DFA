/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_dfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ahmed
 */
public class Final_dfa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(0, 2));
//        Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
//        transitions.put(0, new HashMap<>(Map.of('0', 1, '1', 3)));
//        transitions.put(1, new HashMap<>(Map.of('0', 0, '1', 2)));
//        transitions.put(2, new HashMap<>(Map.of('0', 3, '1', 1)));
//        transitions.put(3, new HashMap<>(Map.of('0', 2, '1', 0)));
//
//        DFA dfa = new DFA(acceptingStates, transitions, 0);
//        System.out.println(dfa.run("10101110")); // true
//        System.out.println(dfa.run("10101")); // false

//        Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(0,1,2));
//        Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
//        transitions.put(0, new HashMap<>(Map.of('a', 1, 'b', 2)));
//        transitions.put(1, new HashMap<>(Map.of('a', 1, 'b', 3)));
//        transitions.put(2, new HashMap<>(Map.of('a', 3, 'b', 2)));
//        transitions.put(3, new HashMap<>(Map.of('a', 3, 'b', 3)));
//        
//        DFA dfa = new DFA(acceptingStates, transitions, 0);
//        System.out.println(dfa.run("bbbaab")); // false
//        System.out.println(dfa.run("aaaa")); // true

        Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(2, 4));
        Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
        transitions.put(0, new HashMap<>(Map.of('0', 4, '1', 1)));
        transitions.put(1, new HashMap<>(Map.of('0', 2, '1', 1)));
        transitions.put(2, new HashMap<>(Map.of('0', 2, '1', 3)));
        transitions.put(3, new HashMap<>(Map.of('0', 3, '1', 3)));
        transitions.put(4, new HashMap<>(Map.of('0', 4, '1', 1)));

        DFA dfa = new DFA(acceptingStates, transitions, 0);
        System.out.println(dfa.run("00001111110")); // true
        System.out.println(dfa.run("10101")); // false
    }

}
