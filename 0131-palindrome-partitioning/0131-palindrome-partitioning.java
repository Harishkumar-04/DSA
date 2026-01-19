class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtrack(0, s, path, result);
        return result;
    }

    private void backtrack(int start, String s, List<String> path, List<List<String>> result) {

        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));
                backtrack(end + 1, s, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

/*  s = "aab"

## 1️⃣ First successful path: `"a" → "a" → "b"`

```
partition
└── backtrack(start=0)
    └── for end = 0
        └── isPalindrome(0,0) → true
        └── path.add("a")
        └── backtrack(start=1)
            └── for end = 1
                └── isPalindrome(1,1) → true
                └── path.add("a")
                └── backtrack(start=2)
                    └── for end = 2
                        └── isPalindrome(2,2) → true
                        └── path.add("b")
                        └── backtrack(start=3)
                            └── start == length → true
                            └── add ["a","a","b"] to result
                            └── return to backtrack(start=2)
                        └── path.remove("b")
                    └── end++ → 3 → loop ends
                    └── implicit return to backtrack(start=1)
                └── path.remove("a")
            └── end++ → 2
            └── isPalindrome(1,2) → false
            └── end++ → 3 → loop ends
            └── implicit return to backtrack(start=0)
        └── path.remove("a")
```

### Loop resumption inside the **same stack frame**

```
backtrack(start=0)
└── end = 0
    └── recursion happens
    └── recursion finishes
└── end++ → end = 1   ✅ NEXT ITERATION (same backtrack call)
└── next loop iteration
```

---

## 2️⃣ Second successful path: `"aa" → "b"`

```
partition
└── backtrack(start=0)
    └── for end = 1
        └── isPalindrome(0,1) → true
        └── path.add("aa")
        └── backtrack(start=2)
            └── for end = 2
                └── isPalindrome(2,2) → true
                └── path.add("b")
                └── backtrack(start=3)
                    └── start == length → true
                    └── add ["aa","b"] to result
                    └── return to backtrack(start=2)
                └── path.remove("b")
            └── end++ → 3 → loop ends
            └── implicit return to backtrack(start=0)
        └── path.remove("aa")
```

### Loop resumption again in `backtrack(start=0)`

```
backtrack(start=0)
└── end = 1
    └── recursion happens
    └── recursion finishes
└── end++ → end = 2   ✅ NEXT ITERATION
└── next loop iteration
```

---

## 3️⃣ Final loop iteration and termination

```
partition
└── backtrack(start=0)
    └── for end = 2
        └── isPalindrome(0,2) → false
        └── end++ → 3 → loop ends
        └── implicit return to partition
```

---

## 4️⃣ Final return from `partition`

```
partition
└── backtrack(0) finished (implicit return)
└── return result;   // explicit return
```

*/
