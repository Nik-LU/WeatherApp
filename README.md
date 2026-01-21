# Погодное приложение

Android-приложение для отображения информации о погоде с использованием современных архитектурных подходов и инструментов разработки.

<div align="center">
  <img src="https://github.com/user-attachments/assets/e6e73460-e4c6-4ee4-a7df-ccf0ddb626e8" width="250" />
  <img src="https://github.com/user-attachments/assets/ca14afb6-0b21-4531-a072-5932fde8941b" width="250" />
</div>

---

## Запуск
1. Склонировать репозиторий
2. Открыть проект в Android Studio
3. Добавить ваш **API ключ** в файл `gradle.properties`
4. Запустить конфигурацию `app`

---

## Стек
- **Язык:** Kotlin
- **UI:** Jetpack Compose
- **Архитектура:** Clean (data / domain / presentation), MVI (Model-View-Intent)
- **Screens:** Single Activity + Navigation Compose
- **База данных:** Room
- **Асинхронность:** Kotlin Coroutines, Flow
- **DI:** Dagger
- **API:** Retrofit
- **Навигация:** Decompose
- **Загрузка изображений:** Glide
- **Другие библиотеки:** Material3, Icons

---

## Назначение проекта
Проект демонстрирует полный цикл разработки современного Android-приложения с использованием:
- **MVI** для управления состоянием.
- **Jetpack Compose** для построения декларативного UI.
- **Room** для локального хранения данных.
- **Retrofit** для работы с API (получение данных о погоде).
- **Decompose** для компоненто-ориентированной навигации.
- **Dagger** для внедрения зависимостей.
  
