#! /home/krupakar-reddy/anaconda3/bin/python3

List = [i for i in range(1,int(input("Enter a Number: ")) + 1)]
for i in range(1,len(List)):
    List[i] *= List[i-1]
print("Factorial of Number is:", List[-1])