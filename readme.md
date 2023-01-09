# Balanced Words Counter Excercise

Balanced words definition: The word is balanced if every letter that occurs in it occurs in the same number of time. E.g. the words: “mama”, “ear”, “aabbcbcccbaa” are balanced but the words “dad”, “elephant”, “abcba” are not. Additionally, the balanced word is not empty. Create a “BalancedWordsCounter” class with one public method called “count” (you can create other private methods) which has to count how many balanced subwords exist in the input word. method should receive String (parameter name = “input”) method should return Integer the input should contain the letters only, throw an exception if the text contains other characters. if the input is null then method should throw an exception Create a “BalancedWordsCounterTest” and create a test methods for below cases: input = “aabbabcccba” result = 28 input = “” result = 0 input = “abababa1” result = RuntimeException input = null result = RuntimeException *