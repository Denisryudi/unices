

soma = 0
for i in range(0, 3):
    for j in range(0, 3):
        somar = (i, j) + (i, j+1) + (i, j+2) + (i+1, j+1) +(i+2, j) +(i+2, j+1)+(i+2, j+2)
        soma += sum(somar)
print(soma)