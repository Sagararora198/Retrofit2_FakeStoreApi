# My Kotlin Android App

## Overview

This is a Kotlin-based Android application that demonstrates how to fetch data from an API using Retrofit2 and display it in a RecyclerView. The app utilizes Kotlin Coroutines and suspend functions to handle asynchronous operations efficiently. The data is fetched from the [FakeStoreAPI](https://fakestoreapi.com/).

## Features

- Fetches data from FakeStoreAPI using Retrofit2
- Utilizes Kotlin Coroutines for asynchronous operations
- Displays data in a RecyclerView
- Clean and modular code structure

## Technologies Used

- **Kotlin**: Programming language for Android development
- **Retrofit2**: HTTP client for making API requests
- **Kotlin Coroutines**: For managing background threads and asynchronous tasks
- **RecyclerView**: For displaying lists of data

## Getting Started

### Prerequisites

- Android Studio 4.0 or higher
- Gradle 4.0 or higher

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/your-repo-name.git
    ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files.

### Dependencies

Add the following dependencies to your `build.gradle` file:

```groovy
dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2'
    implementation 'androidx.recyclerview:recyclerview:1.1.0'
    implementation 'com.github.Spikeysanju:ZoomRecylerLayout:1.0'
}
```
