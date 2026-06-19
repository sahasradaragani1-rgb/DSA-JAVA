# Reverse Words in String II

## Pattern

String + Two Pointer + In-place

---

## Problem

Given a character array containing words separated by spaces.

Reverse the order of words.

Do it in-place.

---

## Example

Input:

```
the sky is blue
```

Output:

```
blue is sky the
```

---

## Difference Between Versions

### Reverse String

```
hello world
↓
dlrow olleh
```

Reverse characters.

---

### Reverse Words III

```
hello world
↓
olleh dlrow
```

Reverse characters inside words.

---

### Reverse Words I

```
hello world
↓
world hello
```

Uses extra space.

---

### Reverse Words II

```
hello world
↓
world hello
```

But:

```
in-place
```

---

## Optimal Idea

Use two reversals.

### Step 1

Reverse entire string:

```
the sky is blue
```

becomes:

```
eulb si yks eht
```

---

### Step 2

Reverse every word:

```
blue is sky the
```

---

## Algorithm

1. Reverse whole character array.

2. Traverse array.

3. When space found:

Reverse current word.

---

## Dry Run

Input:

```
the sky
```

Reverse whole:

```
yks eht
```

Reverse each word:

```
sky the
```

Answer:

```
sky the
```

---

## Time Complexity

Every character reversed twice:

```
O(n)
```

---

## Space Complexity

No extra array:

```
O(1)
```

---
