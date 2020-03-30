Для запуска приложения необходимо:
- создать в PostgreSQL БД с именем TelegramBot, изменить в файле application.properties, username и password на требуемый 
- запустить class Application (при старте приложения одновременно идет подключение к телеграм-боту. 
При старте приложения в базу данных автоматически добавляются тестовые записи. При повторном запуске приложения требуется закомментировать
строчку spring.datasource.schema=classpath:postgres/lazy.sql в файле application.properties
В телеграме для теста можно ввести города: Moscow, Kiev, Paris.

BOT_NAME = ResCityInfoBot;
BOT_TOKEN = 1131663128:AAGS_aQCEBQJQcaLVW5GnTZJsxkZ1H13VlA

http://localhost:8080/                - главная страница приложения
