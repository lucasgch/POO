# 4 - Classe para representar uma Data

Crie uma classe chamada Data para representar uma data (dia, mês e ano). A classe deverá ter os seguintes métodos:
- Método construtor padrão que inicialize com a data 01/01/1970;
- Métodos construtores sobrecarregados que permitam inicializar os atributos com valores fornecidos como argumentos para: i) dia; ii) dia e mês; e iii) dia, mês e ano. Caso algum dos valores não seja válido, o método construtor deve inicializar todos os atributos com valores padrão 01/01/1970;
- A classe deve garantir que a data fornecida seja válida. Por exemplo, a data 31/02/2024 não é válida, pois em 2024 o mês de fevereiro tem no máximo 29 dias.
- Assim, a classe deverá ter ciência de quantos dias tem cada mês e se o ano é bissexto ou não.
- Um ano é bissexto se for divisível por 4, exceto os anos que são divisíveis por 100 e não são divisíveis por 400.
- Métodos modificadores (set) para alterar os valores de cada um dos atributos. Caso o valor fornecido não seja válido, o método deve manter o valor atual do atributo e retornar false. Caso contrário, o método deve alterar o valor do atributo e retornar true;
- Métodos acessores (get) para retornar os valores de cada um dos atributos;
- Método toString() para retornar a data no formato DD/MM/AAAA (por exemplo, 31/12/2024);
- Método que retorne a data por extenso. Por exemplo, “31 de dezembro de 2024ˮ;
- Método que receba como parâmetro um objeto da classe Data e retorne a diferença em dias entre as duas datas.