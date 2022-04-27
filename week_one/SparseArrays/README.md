# Sparse Arrays

There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

## Example

_strings_ = ['ab', 'ab', 'abc']

_queries_ = ['ab', 'abc', 'bc']

There are **2** instances of _'ab'_, **1** of _'abc'_ and **0** of _'bc'_. For each query, add an element to the return array.

results = [2,1,0]

## Function Description

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

- string strings[n] - an array of strings to search
- string queries[q] - an array of query strings

#### Returns

- int[q]: an array of results for each query


#### Input Format

The first line contains and integer _**n**_, the size of _**strings[]**_.

Each of the next _**n**_ lines contains a string _**strings[i]**_.

The next line contains _**q**_, the size of _**strings[]**_.

Each of the next _**q**_ lines contains a string _**strings[i]**_.

#### Constraints

1 <= n <= 1000

1 <= q <= 1000

1 <= |strings[i]|, |strings[i]| <= 20.


#### Sample Input 1

```
4
aba
baba
aba
xzxb
3
aba
xzxb
ab
```


#### Sample Output 1

```
2
1
0
```

#### Sample Input 2

```
3
def
de
fgh
3
de
lmn
fgh
```

#### Sample Output 2

```
1
0
1
```
#### Sample Input 3

```
13
abcde
sdaklfj
asdjf
na
basdn
sdaklfj
asdjf
na
asdjf
na
basdn
sdaklfj
asdjf
5
abcde
sdaklfj
asdjf
na
basdn
```


#### Sample Output 3

```
1
3
4
3
2
```



