# String to Integer (atoi)

## Pattern

String Simulation

---

## Problem

Convert a string into a 32-bit signed integer.

Rules:

1. Ignore leading spaces.
2. Optional sign (`+` or `-`).
3. Read digits only.
4. Stop at first non-digit.
5. Handle overflow.

---

## Example 1

Input:

```
"42"
```

Output:

```
42
```

---

## Example 2

Input:

```
"   -42"
```

Output:

```
-42
```

---

## Example 3

Input:

```
"4193 with words"
```

Output:

```
4193
```

---

## Example 4

Input:

```
"words and 987"
```

Output:

```
0
```

---

## Example 5

Input:

```
"-91283472332"
```

Output:

```
-2147483648
```

Clamped to:

```
Integer.MIN_VALUE
```

---

## Algorithm

### Step 1

Skip leading spaces.

Example:

```
"    42"
```

Move pointer to:

```
4
```

---

### Step 2

Check sign.

```
+
-
```

Store:

```
sign = 1
or
sign = -1
```

---

### Step 3

Build number.

For digit:

```
num = num*10 + digit
```

---

### Step 4

Stop when non-digit appears.

Example:

```
123abc
```

Read:

```
123
```

---

### Step 5

Handle overflow.

Clamp result:

```
Integer.MAX_VALUE
```

or

```
Integer.MIN_VALUE
```

---

## Dry Run

Input:

```
"  -123abc"
```

Skip spaces:

```
-123abc
```

Sign:

```
-1
```

Digits:

```
1
12
123
```

Stop at:

```
a
```

Answer:

```
-123
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only variables:

```
O(1)
```

---
