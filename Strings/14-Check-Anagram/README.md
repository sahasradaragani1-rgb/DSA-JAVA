# Check Anagram

## Pattern

Frequency Counting

---

## Problem

Two strings are anagrams if they contain:

- same characters
- same frequency
- different order allowed

---

## Example

Input:

```
listen
silent
```

Output:

```
Anagram
```

Frequency:

```
l → 1
i → 1
s → 1
t → 1
e → 1
n → 1
```

Same in both.

---

## Brute Force

Sort both strings.

Example:

```
listen
silent
```

After sorting:

```
eilnst
eilnst
```

Compare.

Time:

```
O(n log n)
```

Space:

```
O(n)
```

---

## Optimal Idea

Use frequency array.

For first string:

increase count.

For second string:

decrease count.

If all become zero:

Anagram.

---

## Algorithm

1. Check lengths.

2. Create frequency array.

3. Traverse first string:

```
freq[ch]++
```

4. Traverse second string:

```
freq[ch]--
```

5. Check all values are zero.

---

## Dry Run

Input:

```
rat
car
```

Count first:

```
r=1
a=1
t=1
```

Remove second:

```
c=-1
a=0
r=0
```

Not all zero.

Output:

```
Not Anagram
```

---

## Time Complexity

Two traversals:

```
O(n)
```

---

## Space Complexity

Alphabet array:

```
O(1)
```

---
