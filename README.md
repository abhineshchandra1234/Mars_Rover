# Mars Rover
This project fetches a list of rovers that went to Mars. It fetches a list of their mission and another list of photos taken in that mission. It also saves rover photos along with mission details in the database.

---
## Screenshots
<p align="center">
<img src = "https://raw.githubusercontent.com/abhineshchandra1234/Mars_Rover/master/app/src/main/res/screenshots/Missions_photo_dark.png" height=300px/>
<img src = "https://raw.githubusercontent.com/abhineshchandra1234/Mars_Rover/master/app/src/main/res/screenshots/rover_list_dark.png" height=300px/>
<img src = "https://raw.githubusercontent.com/abhineshchandra1234/Mars_Rover/master/app/src/main/res/screenshots/rover_missions_dark.png" height=300px/>
<img src = "https://raw.githubusercontent.com/abhineshchandra1234/Mars_Rover/master/app/src/main/res/screenshots/saved_photos_list.png" height=300px/>
</p>

---
## Gradle
- Kotlin DSL is used as a gradle instead of Groovy
- It is compiled against Java JDK 17, Android API level 34
---
## Libraries
- MVVM
- Jetpack Compose
- Navigation Compose
- Lifecycle Compose
- Room
- Google font
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [Jetpack Compose](https://developer.android.com/jetpack/compose) - Modern way to make Ui in android kotlin.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Coil-kt](https://coil-kt.github.io/coil/) - An image loading library for Android backed by Kotlin Coroutines.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
---
## Features
- Rovers List
- Rovers Mission List
- Rovers Mission photo list
- Save Rover Photo along with mission details
- Support for light and dark mode
- Animations for saving mission details
---
## API Used
- Free NASA API used in the project
- [NASA API](https://api.nasa.gov/)
- Enter API key in MarsRoverPhotoService and MarsRoverManifestService
