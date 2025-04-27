
# Counter App - MVI Architecture

A simple and clean **Counter App** built with **Kotlin**, **XML layouts**, and the **MVI (Model-View-Intent)** architecture pattern.

This project is designed for **beginners** who want to understand:
- How to structure an Android app using **MVI**
- How to follow **Clean Code** principles
- How to organize code with a **scalable folder hierarchy**

---

## 🚀 Features
- Increment a counter on button click
- Follows MVI architecture (Model - View - Intent)
- Uses Kotlin **StateFlow** for reactive UI updates
- Clean and maintainable project structure
- Beginner-friendly code with comments

---

## 📂 Project Structure
com.example.counterapp │ ├── ui │ └── main │ ├── MainActivity.kt │ ├── MainViewModel.kt │ ├── MainIntent.kt │ └── MainState.kt │ └── res └── layout └── activity_main.xml

---

## 🛠 Tech Stack

- [Kotlin](https://kotlinlang.org/)
- [Android XML Layouts](https://developer.android.com/guide/topics/ui/declaring-layout)
- [Android ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
- [Kotlin Coroutines & StateFlow](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow)

---

## 📦 Requirements

- Android Studio Hedgehog | Giraffe or newer
- Minimum SDK: 21
- Dependencies:
  ```gradle
  implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0"
  implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0"
