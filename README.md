QUESTAO 1

a) V, b) F, c) F

QUESTAO 2

O modificador de acesso protected em membros de superclasses permite acesso por subclasses e classes no mesmo pacote, oferecendo flexibilidade, mas potencialmente quebrando o encapsulamento. Já o private restringe o acesso apenas à própria superclasse, maximizando o encapsulamento, porém limitando a flexibilidade das subclasses.

QUESTAO 3

Ao criar um objeto de uma subclasse em Java, o construtor da superclasse é chamado primeiro, seja implicitamente ou explicitamente via super(), para inicializar o estado herdado antes da execução do construtor da subclasse. Isso é obrigatório para garantir a correta inicialização da parte herdada do objeto.
