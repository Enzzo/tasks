package ru.vasilev.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int n = 0;
		int matches = 0;
		for (int i = nums.length - 1, j = 0; i >= 0 && i >= j; --i) {
			int r = nums[i];
			if (r == val) {
				matches++;
				continue;
			} else {
				for (; j < i; ++j) {
					int l = nums[j];
					if (l != val) {
						continue;
					} else {
						matches++;
						nums[i] = l;
						nums[j] = r;
						break;
					}
				}
			}
		}
		return nums.length - matches;
	}

	public int removeElement2(int[] nums, int val) {
		int ptr = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] != val) {
				nums[ptr] = val;
				ptr++;
			}
		}
		return ptr;
	}

	public int heightChecker(int[] heights) {
		int[] sorted = Arrays.stream(heights).sorted().toArray();
		int mismatch = 0;
		for (int i = 0; i < heights.length; ++i) {
			if (heights[i] != sorted[i])
				mismatch++;
		}
		return mismatch;
	}

	public int thirdMax(int[] nums) {
		int m1 = nums[0], m2 = nums[0], m3 = nums[0];

		for (int i = 0; i < nums.length; ++i) {
			int n = nums[i];
			if (m1 == n || m2 == n || m3 == n)
				continue;

			if (m1 < n) {
				if (0 < i) {
					if (1 < i) {
						m3 = m2;
					}
					m2 = m1;
				}
				m1 = n;
				continue;
			}

			if (m2 < n || m2 == m1) {
				if (1 < i) {
					m3 = m2;
				}
				m2 = n;
				continue;
			}
			if (m3 < n || m3 == m2 || m3 == m1) {
				m3 = n;
			}
		}
		return (m1 > m2 && m2 > m3) ? m3 : m1;
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		int[] sub = new int[nums.length];

		for (int i = 0; i < nums.length; ++i) {
			sub[nums[i] - 1]++;
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < sub.length; ++i) {
			if (sub[i] == 0) {
				result.add(i+1);
			}
		}

		return result;
	}

	public int[] sortedSquares(int[] nums) {
		int[] res = new int[nums.length];
		
		int i = 0;
		int fi = 0;
		int bi = 0;
		
		while(i < nums.length) {
			if(fi < nums.length && nums[fi] < 0) {
				bi = ++fi;
				continue;
			}
			
			int v = 0;
			if(0 < bi && fi < nums.length) {
				int a = Math.abs(nums[bi-1]);
				if(a< nums[fi]) {
					v = a;
					--bi;
				}
				else {
					v = nums[fi];
					++fi;
				}
			}
			else if(0 < bi) {
				v = Math.abs(nums[bi-1]);
				--bi;
			}
			else {
				v = nums[fi];
				++fi;
			}
			
			res[i++] = v * v;
		}
		
		return res;
	}
}