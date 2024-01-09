vendas = [100, 123, 204, 123, 204, 123, 204, 123]

meta = 100

for venda in vendas:
    if venda <= meta:
        print('Não ganha bonus')
        break
    print(venda)