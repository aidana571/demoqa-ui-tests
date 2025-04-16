#DemoQA UI Tests

Автоматические UI-тесты на Java с использованием Selenium WebDriver и TestNG

##Реализованные тесты:
- Add New User Test(временно отключён — находится в доработке (формы на сайте были изменены).
- Alert Test
- Buttons Test
- WebTablesTest
- WindowTest
- AlertTest

##Стек технологий:
- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- XPath / CSS Selectors
- Apache Maven
- IntelliJ IDEA

##Описание проекта:
UI-автотесты для учебных сценариев на базе demoqa.com и других демо-страниц.  
Реализованы кейсы по валидации форм, алертам, кнопкам и взаимодействию с элементами интерфейса.  
Используется архитектура Page Object. Тесты запускаются через TestNG.

#Как запустить:
1. Клонировать репозиторий
2. Открыть проект в IntelliJ IDEA
3. Убедиться, что зависимости Maven подтянулись
4. Запуск через TestNG XML-файл или по @Test-аннотациям
