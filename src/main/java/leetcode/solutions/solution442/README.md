# [442. Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array/)

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears __once__ or __twice__, return _an array of all the integers that appears __twice__._

You must write an algorithm that runs in `O(n)` time and uses only constant extra space.

## Example 1

```md
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
```

## Example 2

```md
Input: nums = [1,1,2]
Output: [1]
```

## Example 3

```md
Input: nums = [1]
Output: []
```

## Constraints

- `n` == `nums.length`
- 1 <= `n` <= 10<sup>5</sup>
- 1 <= `nums[i]` <= `n`
- Each element in `nums` appears __once__ or __twice__.
