# Exercício 02 - Sistema de Restaurante

## Objetivo
Implementar um sistema de gestão de pedidos de um restaurante utilizando padrões de design.

---

## Part A: Criação de Refeições (Factory Pattern)
Implemente um mecanismo para criar diferentes tipos de refeições:
- **RefeicaoNormal** - Refeição standard
- **RefeicaoVegetariana** - Sem carne
- **RefeicaoGourmet** - Premium

Cada refeição deve ter:
- `id` (String)
- `nomeCliente` (String)

Use `MealFactory.createMeal(type, id, cliente)` para criar refeições.

---

## Part B: Métodos de Entrega (Strategy Pattern)
Implemente diferentes estratégias de entrega:
- **DeliveryAtHome** - Entrega em casa
- **TakeAway** - Levantamento no restaurante
- **DineIn** - Comer no restaurante

Cada refeição pode ser entregue com `meal.deliver(deliveryMethod)`.

---

## Part C: Sistema de Cozinha Antigo (Adapter Pattern)
Existe um sistema antigo de cozinha que apenas fornece o método:
```java
oldCook.prepareDish(String dishName)
```

Implemente um adapter para utilizar este sistema antigo como método de preparação moderno.

---

## Part D: Notificações (Observer Pattern)
Implemente um sistema de notificações com:
- **KitchenModule** - Recebe notificação quando pedido é feito
- **WaiterModule** - Recebe notificação para servir

Use `RestaurantCenter` (Singleton) para gerir as notificações.

---

## Part E: Registo de Pedidos
Registe todas as operações num ficheiro `meals.txt` na pasta `Learning02`.

---

## Output Esperado:
```
Part A: Creating meals
NormalMeal created
VegetarianMeal created
GourmetMeal created

Part B: Delivering meals
Delivering meal at home
Delivering meal to take away
Delivering meal at dine in

Part C: Using old kitchen system
[OLD KITCHEN] Preparing dish: meal1
File written with order operations

Part D: Notifications
Delivering meal at home
[KITCHEN] Received notification: Meal delivered at home: meal1
[WAITER] Received notification: Meal delivered at home: meal1
File written with order operations
Content of file "meals.txt":
Meal [type=vegetarian, name=meal2, chef=Sofia]
Meal [type=normal, name=meal1, chef=Carlos]
Meal [type=gourmet, name=meal3, chef=Miguel]
```

---

## Padrões a Implementar:
| Padrão | Componentes |
|--------|-------------|
| **Factory** | `MealFactory`, `Meal`, `RefeicaoNormal/Vegetariana/Gourmet` |
| **Strategy** | `DeliveryMethod`, `DeliveryAtHome/TakeAway/DineIn` |
| **Adapter** | `OldKitchen`, `KitchenAdapter` |
| **Observer** | `RestaurantModule`, `KitchenModule`, `WaiterModule`, `RestaurantCenter` |
| **Singleton** | `RestaurantCenter`, `MealRegistry` |
