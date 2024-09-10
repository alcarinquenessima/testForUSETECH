# Проект по автоматизации тестирования для <a href="https://usetech.ru/">USETECH</a></h1>
****
## Содержание:

* <a href="#tools">Технологии и инструменты</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
****
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="7%" title="IntelliJ IDEA" src="images/logos/jetbrains-original.svg"></a>
<a href="https://www.java.com/"><img width="7%" title="Java" src="images/logos/java-original-wordmark.svg"></a>
<a href="https://gradle.org/"><img width="7%" title="Gradle" src="images/logos/gradle-original-wordmark.svg"></a>
<a href="https://junit.org/junit5/"><img width="7%" title="JUnit5" src="images/logos/junit-plain-wordmark.svg"></a>
<a href="https://selenide.org/"><img width="7%" title="Selenide" src="images/logos/Selenide.svg"></a>
<a href="https://www.jenkins.io/"><img width="7%" title="Jenkins" src="images/logos/jenkins-original.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="7%" title="Selenoid" src="images/logos/Selenoid.svg"></a>
<a href="https://allurereport.org/"><img width="7%" title="Allure Report" src="images/logos/Allure.svg"></a>
<a href="https://qameta.io/"><img width="7%" title="Allure TestOps" src="images/logos/Allure2.svg"></a>
<a href="https://github.com/"><img width="7%" title="GitHub" src="images/logos/github-original.svg"></a>
<a href="https://web.telegram.org/k/"><img width="7%" title="Telegram" src="images/logos/Telegram.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira/"><img width="7%" title="Jira" src="images/logos/jira-original-wordmark.svg"></a>
</p>

****
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logos/jenkins-original.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/testForCompanySite/)</a>

<p align="center">  
<a href="https://jenkins.autotests.cloud/job/testForCompanySite/"><img src="images/screenshots/Jenkins.png" alt="Jenkins" width="950"/></a>  
</p>

****
<a id="console"></a>
## Команды для запуска из терминала:

***Локальный запуск:***
```bash  
gradle clean all_tests
```

***Удалённый запуск через Jenkins:***
```bash  
clean
${TASK}
"-DbaseUrl=${BASE_URL}"
"-Dbrowser=${BROWSER}"
"-DbrowserSize=${BROWSER_SIZE}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-Dremote=${REMOTE}
```
***Параметры сборки***

- REMOTE_SERVER (адрес удаленного сервера Selenoid)
- BROWSER (браузер, по умолчанию chrome)
- VERSION (версия браузера, по умолчанию 126.0)
- BROWSER_SIZE (размер окна браузера, по умолчанию 2560х1440)
- TASK (набор кейсов для запуска, по умолчанию friend_page_test)
- BRANCH (ветка, на которой надо запустить тесты, по умолчанию master)
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logos/Allure.svg" width="25"/></a> <a name="Allure"></a> Пример [Allure-отчета](https://jenkins.autotests.cloud/job/testForCompanySite/allure/)</a>
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/allureReport.png" width="850">  
</p>  

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logos/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4424/dashboards">Allure TestOps</a>

### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screenshots/allureTestOps.png" width="850">  
</p>  

___
<a id="jira"></a>
## <img alt="Allure" height="25" src="images/logos/jira-original-wordmark.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-682">Jira</a>

<p align="center">  
<img title="Jira" src="images/screenshots/Jira.png" width="850">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logos/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid

<p align="center">
<img title="Selenoid Video" src="images/videos/example_selenide_video.gif" width="550" height="350"  alt="video">   
</p>
