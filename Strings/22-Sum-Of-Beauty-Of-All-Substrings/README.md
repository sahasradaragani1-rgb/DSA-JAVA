# Sum of Beauty of All Substrings

## Pattern

String + Frequency Array

---

## Problem

For every substring:

Beauty is:

```text
Maximum Character Frequency
-
Minimum Character Frequency
```

(consider only characters that occur)

Return the sum of beauty values of all substrings.

---

## Example

Input:

```text
aabcb
```

Output:

```text
5
```

---

## Beauty Definition

Substring:

```text
aab
```

Frequency:

```text
a = 2
b = 1
```

Beauty:

```text
2 - 1 = 1
```

---

## Brute Force

Generate all substrings.

For each substring:

- Calculate frequency
- Find max frequency
- Find min frequency

Time:

```text
O(n³)
```

or worse.

---

## Optimal Idea

Fix starting index:

```text
i
```

Extend substring one character at a time.

Maintain:

```text
frequency array
```

instead of recomputing frequencies.

---

## Algorithm

For every start:

```text
i = 0 → n-1
```

Create:

```text
freq[26]
```

Extend:

```text
j = i → n-1
```

Update frequency.

Find:

```text
maxFreq
minFreq
```

Add:

```text
maxFreq - minFreq
```

to answer.

---

## Dry Run

Input:

```text
aab
```

Substrings:

```text
a
aa
aab
a
ab
b
```

Beauties:

```text
0
0
1
0
0
0
```

Sum:

```text
1
```

---

## Time Complexity

Outer loop:

```text
O(n)
```

Inner loop:

```text
O(n)
```

Frequency scan:

```text
O(26)
```

Total:

```text
O(n² × 26)
```

Since 26 is constant:

```text
O(n²)
```

---

## Space Complexity

Frequency array:

```text
O(26)
```

Therefore:

```text
O(1)
```

---
