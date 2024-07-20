import sys

input = sys.stdin.readline

stack = []
valid = True
brackets = input().strip()

# 2차 풀이
for i in range(len(brackets)):
    if brackets[i] == '(' or brackets[i] == '[':
        stack.append(brackets[i])
    else: # ')' or ']'
        sum = 0
        while stack and isinstance(stack[-1], int):
            sum += stack.pop()
        if not stack:
            valid = False
            break
        if brackets[i] == ')' and stack[-1] == '(':
            stack.pop()
            stack.append(sum * 2 if sum else 2)
        elif brackets[i] == ']' and stack[-1] == '[':
            stack.pop()
            stack.append(sum * 3 if sum else 3)
        else:
            valid = False
            break
        
if valid:
    result = 0
    while stack:
        if isinstance(stack[-1], int): # 괄호가 아니라 숫자일 때
            result += stack.pop()
        else:
            valid = False
            break
    print(result if valid else 0)
else:
    print(0)

# 1차 풀이
# for i in range(len(brackets)):
#     if brackets[i] == '(' or brackets[i] == '[':
#         stack.append(brackets[i])
#     else: # ')' or ']'
#         if not stack:
#             valid = False
#             break
#         if brackets[i] == ')' and stack[-1] == '(':
#             stack.pop()
#             stack.append(2)
#         elif brackets[i] == ']' and stack[-1] == '[':
#             stack.pop()
#             stack.append(3)
#         else:
#             sum = 0
#             while stack and isinstance(stack[-1], int):
#                 sum += stack.pop()
#             if not stack:
#                 valid = False
#                 break
#             if brackets[i] == ')' and stack[-1] == '(':
#                     stack.pop()
#                     stack.append(sum * 2)
#             elif brackets[i] == ']' and stack[-1] == '[':
#                 stack.pop()
#                 stack.append(sum * 3)
#             else:
#                 valid = False
#                 break
        
# if valid:
#     result = 0
#     while stack:
#         if isinstance(stack[-1], int): # 괄호가 아니라 숫자일 때
#             result += stack.pop()
#         else:
#             valid = False
#             break
#     if valid:
#         print(result)
#     else:
#         print(0)
# else:
#     print(0)