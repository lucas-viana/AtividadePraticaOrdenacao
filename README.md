## Ordenação de candidatos pelo algoritmo BubbleSort em Java

Sistema de Ordenação de Candidatos
Este projeto implementa um sistema simples para leitura de dados de candidatos a partir de um arquivo CSV e ordenação dos dados utilizando algoritmos de ordenação clássicos, como Bubble Sort, Selection Sort e Insertion Sort. O sistema é flexível e permite a ordenação de qualquer classe que implemente a interface Comparable.

### Funcionalidades
Leitura de Arquivo CSV: O sistema permite a leitura de um arquivo CSV contendo informações de candidatos, incluindo ID, nome, data de nascimento e nota.
Implementação de Comparable: A classe Candidato implementa a interface Comparable, permitindo a comparação de objetos pela nota e em caso de empate o critério passa a ser a data de nascimento. O critério de comparação pode ser alterado facilmente.
Ordenação Genérica: Utilizando Generics, o sistema oferece uma implementação flexível para os algoritmos de ordenação:
* Bubble Sort

Esses algoritmos podem ser usados para ordenar qualquer lista de objetos que implementem a interface Comparable.
Flexibilidade: O sistema pode ser facilmente adaptado para lidar com outras classes além de Candidato, como Produto, Pessoa, ou qualquer classe que siga o padrão de Comparable.
