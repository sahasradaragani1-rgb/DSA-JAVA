# Valid Palindrome

## Pattern

Two Pointer / String

---

## Problem

Check whether a string is a palindrome.

Ignore:

- spaces
- punctuation
- special characters

Case insensitive.

---

## Example

Input:

```
A man, a plan, a canal: Panama
```

Output:

```
true
```

---

## Brute Force

Create cleaned string.

Example:

```
amanaplanacanalpanama
```

Reverse it.

Compare.

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

Use two pointers.

One at:

```
start
```

One at:

```
end
```

Compare characters while moving inward.

---

## Algorithm

1. Set:

```
left = 0
right = n-1
```

2. Skip invalid characters.

3. Compare:

```
lowercase(left)
==
lowercase(right)
```

4. Move:

```
left++
right--
```

---

## Dry Run

Input:

```
race a car
```

Clean comparison:

```
r == r
a == a
c != a
```

Stop.

Output:

```
false
```

---

## Time Complexity

Each character visited once:

```
O(n)
```

---

## Space Complexity

No extra string:

```
O(1)
```

---
