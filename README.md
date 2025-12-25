shopping-cart/
├── pom.xml
├── .idea/
└── src/
├── main/
│ └── java/
│ ├── Main.java
│ ├── model/
│ │ ├── Food.java
│ │ ├── Discountable.java
│ │ ├── Apple.java
│ │ ├── Meat.java
│ │ └── constants/
│ │ ├── Colour.java
│ │ └── Discount.java
│ └── service/
│ └── ShoppingCart.java
└── test/
└── java/
File → New → Project

Выберите Maven

GroupId: com.shopping

ArtifactId: shopping-cart

Finish

Затем создаk пакеты и файлы вручную

СОДЕРЖИМОЕ ФАЙЛОВ
 1. src/main/java/model/Food.java
 2. src/main/java/model/Discountable.java
 3. src/main/java/model/Meat.java
 4. src/main/java/model/Apple.java
 5. src/main/java/model/constants/Discount.java
 6. src/main/java/model/constants/Colour.java
 7. src/main/java/service/ShoppingCart.java
 8. src/main/java/Main.java
 9. pom.xml (корневая папка)

Откройте папку shopping-cart в IntelliJ:
File → Open → выберите папку shopping-cart
IntelliJ автоматически распознает Maven проект
Дождитесь индексирования проекта
Откройте Main.java и нажмите Shift + F10 для запуска

ОЖИДАЕМЫЙ РЕЗУЛЬТАТ:
Общая сумма товаров без скидки: 1480.0
Общая сумма товаров со скидкой: 1180.0
Сумма всех вегетарианских продуктов без скидки: 980.0
