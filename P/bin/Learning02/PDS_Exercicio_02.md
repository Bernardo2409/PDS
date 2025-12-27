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
Registe todas as operações num ficheiro `orders.txt` na pasta `Learning02`.

---

## Output Esperado:
```
Part A: Creating meals
NormalMeal meal1 created for client Carlos
VegetarianMeal meal2 created for client Sofia
GourmetMeal meal3 created for client Miguel

Part B: Delivering meals
Meal meal1 delivered via HomeDelivery
Meal meal2 delivered via TakeAway
Meal meal3 delivered via DineIn

Part C: Using old kitchen system
Meal meal1 prepared using adapter
[OLD KITCHEN] Preparing dish: Francesinha

Part D: Notifications
Meal meal1 delivered via HomeDelivery
Module Kitchen received notification from meal1
Module Waiter received notification from meal1

File written with meal operations
Content of file "orders.txt":
Order meal1 (NormalMeal) has 2 deliveries
Order meal2 (VegetarianMeal) has 1 deliveries
Order meal3 (GourmetMeal) has 1 deliveries
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
