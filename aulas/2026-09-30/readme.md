# Implementar classe robô

Bateria = 100

Grid de posições com altura e largura igual a 6.

Consumo por quadrante é 1 / 2L

```mermaid
classDiagram
    class Robot {
        - String name
        - double weight
        - double x
        - double y
        - double speed
        - boolean status
        + Robot(String name, double weight, double x, double y)
        + Robot(String name, double weight)
        + calculateConsumption(double displacement, double speed) double
        + calculateConsumption(double displacement) double
        + getName() String
        + setName(String name) void
        + getWeight() double
        + setWeight(double weight) void
        + getX() double
        + setX(double x) void
        + getY() double
        + setY(double y) void
        + isStatus() boolean
        + setStatus(boolean status) void
        + getSpeed() double
        + setSpeed(double speed) void
    }
    
    class Battery{
        - double capacity;
        - double currentCharge;
        - double voltage;
    }
    
    class Position{
        double x;
        double y;
    }
    
    Robot o--> Battery
    Robot o--> Position
```