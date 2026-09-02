# 3 - Classe para representar um retângulo

Crie uma classe chamada Retangulo para representar um retângulo. A classe deverá ter os seguintes métodos:
- Método construtor que receba como parâmetros, a largura, a altura do retângulo e a codificação de caracteres para desenhar o retângulo (uma String com ASCII ou UTF8. Caso a largura ou a altura fornecida seja menor ou igual a zero, o método construtor deve inicializar os atributos com valores padrão (largura = 4, altura = 3. Caso a codificação de caracteres fornecida seja diferente de ASCII ou UTF8, o método construtor deve inicializar o atributo com o valor padrão (codificação = ASCII;
- Método construtor padrão que inicialize todos atributos com valores padrão (largura = 4, altura = 3, codificação = ASCII;
- Métodos modificadores (set) para alterar os valores de cada um dos atributos. Caso o valor fornecido não seja válido, o método deve manter o valor atual do atributo e retornar false. Caso contrário, o método deve alterar o valor do atributo e retornar true;
- Métodos acessores (get) para retornar os valores de cada um dos atributos;
- Método que retorne a área do retângulo. A área de um retângulo é dada por: 𝐴 = largura × altura;
- Método que retorne o perímetro do retângulo. O perímetro de um retângulo é dado por: 𝑃 = 2 × (largura + altura);
- Método toString() para retornar uma representação do retângulo no formato de uma string. Por exemplo, para um retângulo de largura 4 e altura 3 e com codificação em ASCII a representação seria:

```plaintext
+--+
| |
+--+
```

– Para um retângulo de largura 4 e altura 3 e com codificação em UTF8 a representação seria (String em Java)1:

```java
String r = "\u250c\u2500\u2500\u2510\n\u2502 \u2502\n\u2514\u2500\u2500\u2518";
System.out.println(r);
```
