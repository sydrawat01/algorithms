# [2062. Count Vowel Substrings of a String](https://leetcode.com/problems/count-vowel-substrings-of-a-string/)

A __substring__ is a contiguous (non-empty) sequence of characters within a string.

A __vowel substring__ is a substring that __only__ consists of vowels (`'a'`, `'e'`, `'i'`, `'o'`, and `'u'`) and has __all five__ vowels present in it.

Given a string `word`, return _the number of __vowel substrings__ in_ `word`.

## Example 1

```md
Input: word = "aeiouu"
Output: 2
Explanation: The vowel substrings of word are as follows (underlined):
```

- "<ins>__aeiou__</ins>u"
- "<ins>__aeiouu__</ins>"

## Example 2

```md
Input: word = "unicornarihan"
Output: 0
Explanation: Not all 5 vowels are present, so there are no vowel substrings.
```

## Example 3

```md
Input: word = "cuaieuouac"
Output: 7
Explanation: The vowel substrings of word are as follows (underlined):
```

- "c<ins>__uaieuo__</ins>uac"
- "c<ins>__uaieuou__</ins>ac"
- "c<ins>__uaieuoua__</ins>c"
- "cu<ins>__aieuo__</ins>uac"
- "cu<ins>__aieuou__</ins>ac"
- "cu<ins>__aieuoua__</ins>c"
- "cua<ins>__ieuoua__</ins>c"

## Constraints

- 1 <= `word.length` <= 100
- `word` consists of lowercase English letters only.
