# is = pergunta se ambas estão apontando ao mesmo objeto

# a = "banana"

# b = "banana"

# c = "maça"
# ab = a is b
# print(ab)

# = true


# minha_lista = [
#     1, 2, 3,
#     4, 5, 6,
#     ]


# Para operações matemáticas, divida as linhas antes dos operadores matemáticos, não depois (em algumas linguagens, 
# a convenção é invertida, mas há boas razões para o estilo pythônico):
# lucro = (vendas
#          + dividendos
#          - juros_divida
#          - salarios)


# lista1 = ["carro", "ônibus", "barco", "bicicleta"]
# lista2 = ["carro", "ônibus", "barco", "bicicleta"]
# lista3 = ["carro", "barco"]

# lista4 = lista3 is lista2

# print(lista4)

# = false



# lista1 = ["carro", "ônibus", "barco", "bicicleta"]
# lista2 = ["carro", "ônibus", "barco", "bicicleta"]
# lista3 = ["carro", "barco"]

# lista4 = lista1 is lista3

# print(lista4)

# False

lista1 = ["carro", "ônibus", "barco", "bicicleta"]
lista2 = ["carro", "ônibus", "barco", "bicicleta"]
lista3 = ["carro", "barco"]

lista4 = lista2 is lista3

print(lista4)


# No exemplo apresentado, a comparação lista1 is lista2 retorna False porque as variáveis lista1 e lista2 apontam para objetos diferentes na memória, 
# apesar de terem o mesmo conteúdo. Ao usar o operador is, estamos comparando se as duas variáveis se referem ao mesmo objeto na memória. Para
# comparar se duas listas possuem o mesmo conteúdo, devemos utilizar o operador de igualdade (==), como por exemplo

