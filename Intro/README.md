## Exercício 02: Gerador de Personagem <a id="exercicio02"></a>

### Objetivo

Criar um programa que gere e manipule personagens de jogo usando classes.

---

### Instruções

* Crie uma classe chamada `Personagem` que implemente os atributos `nome`, `vida` e `ataque`, além de dos métodos `receberDano` e `atacar`;
* O método `receberDano` recebe um parâmetro do tipo `int` que subtrai da `vida` do objeto. Se o valor da `vida` for menor ou igual a zero, o método deve imprimir uma mensagem informando que o personagem foi derrotado;
* O método `atacar` recebe um parâmetro do tipo `Personagem` chamado `alvo` e chama o método `receberDano`, passando o ataque do personagem atacante como parâmetro. Caso a vida do `alvo` seja igual a zero, o método deve imprimir uma mensagem informando que o `ataque falhou`;

---

* No método `main` da classe principal, crie crie uma lista de `Personagem` chamada de `inimigos` e adicione pelo menos três personagens diferentes;
* Crie um `Personagem` chamado `jogador` e use o método `atacar` passando como parâmetro aleatoriamente um dos personagens da lista `inimigos`. O jogador não deve atacar inimigos com vida igual a 0;
* Após o ataque do jogador, crie um loop que percorre a lista de `inimigos` e chama o método `atacar` de cada um deles passando como parâmetro o `jogador`;
* Repita os dois últimos passos até que o `jogador` ou todos os `inimigos` tenham a vida zerada e imprima o resultado final.

---

### Entradas (inputs)

````txt
Orc / Vida: 100 / Ataque: 10
Goblin / Vida: 50 / Ataque: 5
Lobo / Vida: 75 / Ataque: 15
Cavaleiro / Vida: 200 / Ataque: 20
Dragão / Vida: 500 / Ataque: 50

Steve / Vida: 100 / Ataque: 20
````


### Saídas (outputs)

````txt
Orc foi derrotado!
Goblin foi derrotado!
Steve foi derrotado!
````

---

## Exercício 03: Barcos e Portos <a id="exercicio03"></a>

### Objetivo

Criar um programa que gere e manipule barcos e portos usando classes e herança.

---

### Instruções

* Crie uma classe chamada `Barco` contendo os atributos `nome` e `tamanho`;
* Crie uma classe chamada `BasePorto` contendo os atributos `nome`, um array de `barcosAtracados` e dois métodos método chamados `atracarBarco` e `desatracarBarco`;
* O método `atracarBarco` recebe um objeto `Barco` e adiciona o barco ao array de `barcosAtracados`;
* O método `desatracarBarco` recebe um objeto `Barco` e remove o barco do array de `barcosAtracados`;

---

* Crie uma classe  chamada `PortoPequeno` que herda da classe `BasePorto`. Sobreescreva o método `atracarBarcos` para que ele permita apenas a atracagem de barcos com tamanho menor ou igual a 10;
* Crie uma classe  chamada `PortoGrande que herda da classe `BasePorto`. Sobreescreva o método `atracarBarcos` para que ele permita apenas a atracagem de barcos com tamanho maior ou igual a 10;

---

* No método `main`:
  * Crie uma lista contendo 5 barcos com diferentes tamanhos e dois portos (um pequeno e um grande);
  * Percorra a lista de barcos e use o método `atracarBarco` para atracar cada barco em um dos portos;
  * Os barcos devem tentar ser atracados primeiramente no porto pequeno e, se não puderem, devem ser atracados no porto grande.

---

### Entradas (inputs)

````txt
Barco 1: Tamanho 2
Barco 2: Tamanho 5
Barco 3: Tamanho 7
Barco 4: Tamanho 12
Barco 5: Tamanho 20
````


### Saídas (outputs)

````txt
Barco 1 atracado no porto pequeno
Barco 2 atracado no porto pequeno
Barco 3 atracado no porto pequeno
Barco 4 atracado no porto grande
Barco 5 atracado no porto grande
````
