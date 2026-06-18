# Valid Anagram

## Pattern

Frequency Counting

---

## Problem

Given two strings `s` and `t`, return:

```
true
```

if `t` is an anagram of `s`, otherwise:

```
false
```

An anagram contains exactly the same characters with the same frequencies.

---

## Example 1

Input:

```
s = "anagram"
t = "nagaram"
```

Output:

```
true
```

---

## Example 2

Input:

```
s = "rat"
t = "car"
```

Output:

```
false
```

---

## Intuition

Two strings are anagrams if:

```
Frequency of every character is the same.
```

Count characters from one string and remove counts using the second string.

If all frequencies become zero, the strings are anagrams.

---

## Algorithm

1. If lengths differ:
   ```
   false
   ```

2. Create frequency array:
   ```
   int[] freq = new int[26];
   ```

3. Traverse both strings together:
   - Increment for `s`
   - Decrement for `t`

4. Check frequency array.

5. If every value is zero:
   ```
   true
   ```

---

## Dry Run

Input:

```
s = "listen"
t = "silent"
```

Frequency changes:

```
l +1
i +1
s +1
t +1
e +1
n +1
```

Then:

```
s -1
i -1
l -1
e -1
n -1
t -1
```

All counts become:

```
0
```

Result:

```
true
```

---

## Time Complexity

Traverse strings once:

```
O(n)
```

Check frequency array:

```
O(26)
```

Overall:

```
O(n)
```

---

## Space Complexity

Frequency array size is fixed:

```
O(26)
```

which is:

```
O(1)
```

---

## Key Observation

Two strings are anagrams iff their character frequencies are identical.

---
