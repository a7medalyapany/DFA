# Final DFA

Final DFA is a Java library that implements a Deterministic Finite Automaton (DFA). It provides a DFA class that allows you to define the set of accepting states, transitions, and run input strings to determine whether they are accepted by the DFA.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Installation

To use the Final DFA library in your Java project, you need to download the source code and add it to your project's dependencies.

1. Clone the repository:

   ```shell
   git clone https://github.com/a7medalyapany/DFA.git

2. Add the final_dfa package to your project.

3. Configure your project's build system to include the Final DFA library.

## Usage
To use the Final DFA library in your Java code, follow these steps:
1. Import the necessary classes:
import final_dfa.DFA;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

2. Define the accepting states and transitions for your DFA:
Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(2, 4));
Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
transitions.put(0, new HashMap<>(Map.of('0', 4, '1', 1)));
transitions.put(1, new HashMap<>(Map.of('0', 2, '1', 1)));
transitions.put(2, new HashMap<>(Map.of('0', 2, '1', 3)));
transitions.put(3, new HashMap<>(Map.of('0', 3, '1', 3)));
transitions.put(4, new HashMap<>(Map.of('0', 4, '1', 1)));


transitions.put(current_state, new HashMap<>(Map.of('alphabet1', next state of alphabet1, 'alphabet2', next state of alphabet2)));

3. Create an instance of the DFA class:
DFA dfa = new DFA(acceptingStates, transitions, 0);

The constructor takes the accepting states, transitions, and the starting state as parameters.

4. Run input strings against the DFA:
boolean result1 = dfa.run("00001111110"); // true
boolean result2 = dfa.run("10101"); // false

The run method returns true if the input string is accepted by the DFA, and false otherwise.

## Examples
Here are some examples demonstrating the usage of the Final DFA library:
// Example 1
Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(0, 2));
Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
transitions.put(0, new HashMap<>(Map.of('0', 1, '1', 3)));
transitions.put(1, new HashMap<>(Map.of('0', 0, '1', 2)));
transitions.put(2, new HashMap<>(Map.of('0', 3, '1', 1)));
transitions.put(3, new HashMap<>(Map.of('0', 2, '1', 0)));

DFA dfa = new DFA(acceptingStates, transitions, 0);
boolean result1 = dfa.run("10101110"); // true
boolean result2 = dfa.run("10101"); // false

// Example 2
Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(0, 1, 2));
Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
transitions.put(0, new HashMap<>(Map.of('a', 1, 'b', 2)));
transitions.put(1, new HashMap<>(Map.of('a', 1, 'b', 3)));
transitions.put(2, new HashMap<>(Map.of('a', 3, 'b', 2)));
transitions.put(3, new HashMap<>(Map.of('a', 3, 'b', 3)));

DFA dfa = new DFA(acceptingStates, transitions, 0);
boolean result1 = dfa.run("bbbaab"); // false
boolean result2 = dfa.run("aaaa"); // true

// Example 1
Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(0, 2));
Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
transitions.put(0, new HashMap<>(Map.of('0', 1, '1', 3)));
transitions.put(1, new HashMap<>(Map.of('0', 0, '1', 2)));
transitions.put(2, new HashMap<>(Map.of('0', 3, '1', 1)));
transitions.put(3, new HashMap<>(Map.of('0', 2, '1', 0)));

DFA dfa = new DFA(acceptingStates, transitions, 0);
boolean result1 = dfa.run("10101110"); // true
boolean result2 = dfa.run("10101"); // false

// Example 2
Set<Integer> acceptingStates = new HashSet<>(Arrays.asList(0, 1, 2));
Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();
transitions.put(0, new HashMap<>(Map.of('a', 1, 'b', 2)));
transitions.put(1, new HashMap<>(Map.of('a', 1, 'b', 3)));
transitions.put(2, new HashMap<>(Map.of('a', 3, 'b', 2)));
transitions.put(3, new HashMap<>(Map.of('a', 3, 'b', 3)));

DFA dfa = new DFA(acceptingStates, transitions, 0);
boolean result1 = dfa.run("bbbaab"); // false
boolean result2 = dfa.run("aaaa"); // true

## Contributing
Contributions to the Final DFA project are welcome! If you want to contribute, please follow these steps:

1. Fork the repository and create a new branch for your feature or bug fix.

2. Implement your changes and ensure that they are well-tested.

3. Commit your changes and push them to your forked repository.

4. Create a pull request, describing your changes in detail and providing any necessary documentation.

Please ensure that your contributions adhere to the code style and guidelines of the project.

## License
This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for more details.
