/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_dfa;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author ahmed
 */
public class DFA {

    public Set<Integer> acceptingStates;
    public Map<Integer, Map<Character, Integer>> transitions;
    public int currentState;

    public DFA(Set<Integer> acceptingStates, Map<Integer, Map<Character, Integer>> transitions, int startState) {
        this.acceptingStates = acceptingStates;
        this.transitions = transitions;
        this.currentState = startState;
    }

    public boolean run(String input) {
        int currentState = this.currentState; // reset current state to starting state which is Q0(0)
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!transitions.containsKey(currentState) || !transitions.get(currentState).containsKey(c)) {
                return false;
            }
            currentState = transitions.get(currentState).get(c);
        }
        return acceptingStates.contains(currentState);
    }

}
