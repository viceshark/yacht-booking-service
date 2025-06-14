## Предназначение

**Yacht Booking Service** — это учебное приложение, имитирующее сервис аренды яхт. Создано для демонстрации навыков веб-разработки, работы с базой данных, тестирования и контейнеризации.

---

## 📦 Стек

- Java + Spring Boot
- Liquibase
- PostgreSQL
- Maven
- Docker + Docker Compose
- REST API + Thymeleaf (UI)
- Test Automation: JUnit 5, Rest Assured, Selenide

## 🐳 Docker hints
### Запуск сервисов из compose файла:
```docker compose up -d```

### Посмотреть список запущенных контейнеров:
```docker ps```

### Подключиться к БД через консоль:
```docker exec -it yacht_booking_postgres psql -U LOGIN -d DB_NAME```

### Как построить докер образ локально:
- ```mvn package``` # Собрать jar
- ```docker build -t yacht-booking-service:latest .``` # Построить образ


## 🌊 Liquibase hints
### Почистить хэши, использовать когда возникает ошибка с несовпадением контрольных сумм:
```mvn liquibase:clearCheckSums```

### Откатить n-последних changeset:
```mvn liquibase:rollback -Dliquibase.rollbackCount=5```

### Полностью сбросить схему:
```mvn liquibase:dropAll```
