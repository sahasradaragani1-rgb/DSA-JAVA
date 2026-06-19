# Reverse Words in String III

## Pattern

String / Two Pointer

---

## Problem

Given a string.

Reverse the characters of each word.

Keep:

- word order same
- spaces same

---

## Example

Input:

```
Let's take LeetCode contest
```

Output:

```
s'teL ekat edoCteeL tsetnoc
```

---

## Brute Force

Split the string:

```
words = s.split(" ")
```

Reverse every word.

Join again.

Time:

```
O(n)
```

Space:

```
O(n)
```

---

## Optimal Idea

Do not create multiple strings.

Convert to character array.

Reverse each word in-place.

---

## Algorithm

1. Convert string:

```
char[]
```

2. Track starting index:

```
start
```

3. When space is found:

Reverse:

```
start → i-1
```

4. Update:

```
start = i+1
```

---

## Dry Run

Input:

```
hello world
```

Array:

```
h e l l o _ w o r l d
```

Reverse first word:

```
o l l e h _ w o r l d
```

Reverse second:

```
o l l e h _ d l r o w
```

Answer:

```
olleh dlrow
```

---

## Time Complexity

Every character processed once:

```
O(n)
```

---

## Space Complexity

Character array:

```
O(n)
```

---

## Difference

Reverse String:

```
Reverse whole string
```

Reverse Words III:

```
Reverse each word
```

---
