# First Unique Character in a String

## Pattern

Frequency Counting

---

## Problem

Given a string `s`, find the index of the first non-repeating character.

If no such character exists, return:

```
-1
```

---

## Example 1

Input:

```
s = "leetcode"
```

Output:

```
0
```

Explanation:

```
'l' appears only once.
```

---

## Example 2

Input:

```
s = "loveleetcode"
```

Output:

```
2
```

Explanation:

```
'l' -> repeated
'o' -> repeated
'v' -> unique
```

---

## Example 3

Input:

```
s = "aabb"
```

Output:

```
-1
```

---

## Intuition

To know whether a character is unique, we first need its frequency.

So:

1. Count frequencies.
2. Traverse again.
3. First character with frequency 1 is the answer.

---

## Algorithm

1. Create frequency array:

```java
int[] freq = new int[26];
```

2. Count frequencies.

3. Traverse string again.

4. If:

```java
freq[s.charAt(i) - 'a'] == 1
```

return index.

5. If no unique character exists:

```java
return -1;
```

---

## Dry Run

Input:

```
"loveleetcode"
```

Frequencies:

```
l -> 2
o -> 2
v -> 1
e -> 4
...
```

Traverse:

```
l -> repeated
o -> repeated
v -> unique
```

Answer:

```
Index = 2
```

---

## Time Complexity

First traversal:

```
O(n)
```

Second traversal:

```
O(n)
```

Overall:

```
O(n)
```

---

## Space Complexity

Frequency array size:

```
26
```

Therefore:

```
O(1)
```

---

## Key Observation

The first unique character cannot be identified in a single pass because we must know frequencies beforehand.

---
