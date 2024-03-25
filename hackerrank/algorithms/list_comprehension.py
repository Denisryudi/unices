
# where the sum of the coordinates (i + j + k) is not equal to n.
# The range function is used to iterate from 0 to the given dimension (inclusive).
# The condition at the end of the comprehension filters out the combinations where the sum equals n.
if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
        #lista com essas cordenadas
    juncao_total = [[i, j, k] for i in range(x + 1) for j in range(y + 1) for k in range(z + 1) if i + j + k != n]

    print(juncao_total)