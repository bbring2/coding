### 1번 문제
알파벳 소문자로 이루어진 배열 arr 을 <조건>을 만족하는 배열을 리턴하는 함수를 작성해 주세요.


<조건>
길이가 짧은 것부터 출력합니다.

길이가 같으면 사전 순으로 출력합니다.

단, 중복된 단어는 하나만 남기고 제거하여 출력합니다.

---

### 2번 문제
‘(’, ‘)’, ‘{’, ‘}’, ‘[’, ‘]’ 로만 이루어진 문자열 s가 주어집니다. 문자열  s가 유효한지 확인하는 함수를 작성해 주세요.

<유효한 문자열>
여는 괄호는 항상 같은 종류의 닫는 괄호와 짝을 이루어야 합니다.
여는 괄호는 항상 올바른 순서로 닫혀야 합니다.
모든 닫는 괄호는 상응하는 여는 괄호를 포함해야 합니다.

---

### 3번 문제
정상에 도달하기 위해서는 n개의 단계가 있고, 매번 한 계단 또는 두 계단을 오를 수 있습니다.

정상에 오를 수 있는 경우의 수를 리턴하는 함수를 작성해 주세요.

---

### 4번 문제
각 자리의 숫자를 더한값을 원래 숫자에서 뺀 결과가 하단에 나열한 과일코드가 나올때까지 계산하는 코드를 작성해 주세요.

Constraint : 10 <= n <= 10000

```
1-kiwi
2-pear
3-kiwi
4-banana
5-melon
6-banana
7-melon
8-pineapple
9-apple
10-pineapple
11-cucumber
12-pineapple
13-cucumber
14-orange
15-grape
16-orange
17-grape
18-apple
19-grape
20-cherry
21-pear
22-cherry
23-pear
24-kiwi
25-banana
26-kiwi
27-apple
28-melon
29-banana
30-melon
31-pineapple
32-melon
33-pineapple
34-cucumber
35-orange
36-apple
37-orange
38-grape
39-orange
40-grape
41-cherry
42-pear
43-cherry
44-pear
45-apple
46-pear
47-kiwi
48-banana
49-kiwi
50-banana
51-melon
52-pineapple
53-melon
54-apple
55-cucumber
56-pineapple
57-cucumber
58-orange
59-cucumber
60-orange
61-grape
62-cherry
63-apple
64-cherry
65-pear
66-cherry
67-pear
68-kiwi
69-pear
70-kiwi
71-banana
72-apple
73-banana
74-melon
75-pineapple
76-melon
77-pineapple
78-cucumber
79-pineapple
80-cucumber
81-apple
82-grape
83-orange
84-grape
85-cherry
86-grape
87-cherry
88-pear
89-cherry
90-apple
91-kiwi
92-banana
93-kiwi
94-banana
95-melon
96-banana
97-melon
98-pineapple
99-apple
100-pineapple
```

---

### 5번 문제
배열 arr 에서 홀수 또는 짝수중에 하나만 존재하는 값의 인덱스를 리턴하는 함수를 작성해 주세요.

Constraint : 배열의 길이는 2 보다 크며, 항상 짝수 또는 홀수가 하나만 존재합니다.
```
arr = [2, 4, 7, 8, 10]
output: 2

arr = [1, 2, 1, 1]
output: 1
```