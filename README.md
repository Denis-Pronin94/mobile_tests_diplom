# Проект по автоматизации тестирования android-приложения  "Wikipedia"
<img title="Wiki img" src="images/logo/Wikipedia.jpg">

#### <a target="_blank" href="https://github.com/wikimedia/apps-android-wikipedia/releases">Ссылка на репозиторий приложения</a>

## :floppy_disk: Содержание:

- [Технологии и инструменты](#computer-технологии-и-инструменты)
- [Реализованные проверки](#notebook_with_decorative_cover-реализованные-проверки)
- [Сборка в Jenkins](#jenkins-Jenkins-job)
- [Запуск из терминала](#arrow_forward-запуск-из-терминала)
- [Отчет BrowserStack](#отчет-browserstack)
- [Allure отчет](#report-Allure-отчет)
- [Интеграция с Allure TestOps](#Allure-TestOPS)
- [Отчет в Telegram](#telegram-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Appium" src="images/logo/Appium.svg">
<img width="6%" title="Browserstack" src="images/logo/Browserstack.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="AllureTestOps" src="images/logo/AllureTestOps.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :notebook_with_decorative_cover: Реализованные проверки
- Проверка онбординга
- Проверка ввода текста 'Appium' в поисковую строку
- Проверка сохранения истории запросов 
- Проверка текста на стартовом экране
- Проверка существования кнопки 'Donate'

<a name="jenkins-Jenkins-job"></a>
##   Сборка в Jenkins
## <img width="3%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/mobile_tests_diplom/)
*Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать с параметрами*</strong></code> и указать значения параметров.*

<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="900">
</p>

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test -DdeviceHost=local
```
Запуск в Jenkins:
```
gradle clean test -DdeviceHost=browserstack
```

## 👽 Отчет BrowserStack
<img title="BrowserStack dashboard" src="images/screens/Browserstack.png">

<a name="report-Allure-отчет"></a>
### <img width="2%" title="Jenkins" src="images/logo/Allure_Report.svg"> Отчёт [Allure Reports](https://jenkins.autotests.cloud/job/mobile_tests_diplom/2/allure/)
<p align="center">
  <img src="images/screens/AllureReport.png" alt="job" width="900">
</p>

<p align="center">
  <img src="images/screens/AllureReport2.png" alt="job" width="900">
</p>

<a name="Allure-TestOPS"></a>
### <img width="2%" title="Allure TestOPS" src="images/logo/AllureTestOps.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/14342)
<p align="center">
  <img src="images/screens/AllureTestOps.png" alt="job" width="800">
</p>

<p align="center">
  <img src="images/screens/AllureTestOps2.png" alt="job" width="800">
</p>

<a name="telegram-Уведомление-в-Telegram-при-помощи-бота"></a>
### <img width="2%" title="Jenkins" src="images/logo/Telegram.svg"> Отчет в Telegram

<p align="center">
  <img src="images/screens/telegram.png" alt="job" width="600">
</p>

<a name="earth_africa-Примеры-видео-о-прохождении-тестов"></a>
## :film_projector: Видео пример прохождения тестов

> К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/screens/tprs.gif" >
</p>
