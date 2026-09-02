# 2 Classe para presentar um horário

Crie uma classe chamada Horario para representar um horário (hora, minuto e segundo). A classe deverá
ter os seguintes métodos:

- Método construtor padrão que inicialize todos atributos com zero;
- Métodos construtores sobrecarregados que permitam inicializar os atributos com valores fornecidos como argumentos para: i) hora; ii) hora e minuto; e iii) hora, minuto e segundo. Caso algum dos
valores não seja válido, o método construtor deve inicializar todos os atributos com zero;
- Métodos modificadores (set) para alterar os valores de cada um dos atributos. Caso o valor fornecido não seja válido, o método deve manter o valor atual do atributo e retornar false. Caso contrário, o
método deve alterar o valor do atributo e retornar true;
- Método toString() para retornar o horário no formato HH:MM:SS (por exemplo, 23:59:59);
- Método para imprimir por extenso o horário. Por exemplo, “vinte e três horas, cinquenta e nove minutos e cinquenta e nove segundosˮ;
- Método que retorne o horário em segundos (um valor do tipo long). Por exemplo, se horário for 01:00:00, então deve retornar 3600;
- Método que receba como parâmetro um objeto da classe Horario e retorne a diferença em segundos
entre os dois horários.