# Reverse Integer

## Pattern

Math / Digit Manipulation

---

## Problem

Reverse the digits of an integer.

Example:

Input:

```
123
```

Output:

```
321
```

---

## Example 2

Input:

```
-123
```

Output:

```
-321
```

---

## Brute Force

Convert number to string.

Reverse string.

Convert back to integer.

Space:

```
O(n)
```

---

## Optimal Idea

Use mathematical operations.

Last digit:

```
n % 10
```

Remove last digit:

```
n / 10
```

---

## Algorithm

Take:

```
rev = 0
```

Repeat:

1. Get last digit:

```
digit = n % 10
```

2. Add digit:

```
rev = rev*10 + digit
```

3. Remove digit:

```
n = n/10
```

---

## Dry Run

Input:

```
1234
```

Start:

```
rev = 0
```

Take 4:

```
rev = 4
```

Take 3:

```
rev = 43
```

Take 2:

```
rev = 432
```

Take 1:

```
rev = 4321
```

---

## Overflow Handling

Before:

```
rev * 10
```

check:

```
rev > MAX_VALUE/10
```

Otherwise integer overflow happens.

---

## Time Complexity

Number of digits:

```
log10(n)
```

So:

```
O(log n)
```

---

## Space Complexity

Only variables:

```
O(1)
```

---
