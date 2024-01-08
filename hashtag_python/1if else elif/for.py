produtos = ['coca', 'pizza', 'cheese', 'sprite', 'guarana']
producao = ['15000', '20000', '30000', '40000', '20000']

tamanho = len(produtos)
for i in range(tamanho):
    print('Temos {} na quantidade de {} '.format(produtos[i], producao[i]))