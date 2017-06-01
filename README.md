# exercicio-XIII-Map


Considerações:

Algumas diferenças perceptíveis entre Java e Go analisando do código do exercício, foi que em Go não existe a questão de modificadores de acesso como em java, também quanto as interfaces em Go não precisa explicitar em uma classe que ela implementa uma interface, como em java, bastando apenas implementar todos os métodos de uma interface e automaticament aquela classe já a implementa, quanto assinatura dos métodos Go também difere um pouco de java como também no que diz respeito ao construtor, em Go o tipo do objeto que está se construindo é passado como parâmetro no new o que não se faz em Java. No código em Java do exercicio, para ter acesso aos atributos do pai via composição tive que criar os métodos de acesso (getters e setters) e inicializar o objeto pai da classe no construtor do filho, já em Go basta apenas declarar um pai como atributo da classe e o filho já ganha os atributos do pai, sem a necessidade de se criar getters e setters, como se fosse uma herança.
