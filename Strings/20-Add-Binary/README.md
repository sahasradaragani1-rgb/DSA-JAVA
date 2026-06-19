# Add Binary

## Pattern

String + Two Pointers

---

## Problem

Given two binary strings:

``` id="qaz1"
a
b
```

Return their sum as a binary string.

---

## Example

Input:

```
a = "11"
b = "1"
```

Output:

```
100
```

---

## Example 2

Input:

```
a = "1010"
b = "1011"
```

Output:

```
10101
```

---

## Idea

Same as normal addition.

Start from the last digit.

Add:

```
digit1 + digit2 + carry
```

Store:

```
sum % 2
```

Update:

```
carry = sum / 2
```

---

## Algorithm

1. Start from end of both strings.

2. Add digits and carry.

3. Append:

```
sum % 2
```

4. Update carry.

5. Reverse final answer.

---

## Dry Run

Input:

```
11
 1
```

Step 1:

```
1 + 1 = 2

digit = 0
carry = 1
```

Step 2:

```
1 + carry(1) = 2

digit = 0
carry = 1
```

Step 3:

```
carry = 1
```

Answer:

```
100
```

---

## Time Complexity

Let:

```
n = max(length(a), length(b))
```

Traversal:

```
O(n)
```

---

## Space Complexity

Answer string:

```
O(n)
```

---
