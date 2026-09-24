# Использование JUnit — модульное тестирование

## 📋 Описание задачи

Добавить модульные тесты (не менее трёх) к ранее выполненному домашнему заданию 
с использованием библиотеки **JUnit 5**. Отработать автоматическую проверку 
работоспособности кода вместо ручного запуска.

## 🎯 Цель

Научиться:
- Подключать JUnit 5 к Maven/Gradle-проекту;
- Писать тесты по структуре **given / when / then**;
- Использовать assertions (`assertEquals`, `assertTrue`, `assertThrows` и др.);
- Проверять корректность кода автоматически;
- Рефакторить код, будучи уверенным в его работоспособности.

## 🛠️ Используемые технологии

- Java 17+
- JUnit 5 (Jupiter)
- Maven или Gradle
- IntelliJ IDEA (для запуска тестов)

## 📦 Подключение зависимости

### Maven (`pom.xml`)

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.1.0</version>
    <scope>test</scope>
</dependency>
