# FreeLance Project
The app features a nested RecyclerView with horizontal scrolling inside a vertical list. It uses Retrofit and Picasso for API integration and image loading. OkHttp Interceptor ensures secure API access with authToken. A user-friendly interface allows seamless navigation through documents and images.
The Nested RecyclerView App is an Android application that showcases a nested RecyclerView with horizontal scrolling inside a vertical list. The app fetches data from an API using Retrofit and displays images using Picasso. It also implements OkHttp Interceptor to ensure secure API access with an authToken.

## Features
Nested RecyclerView: The app implements a nested RecyclerView, where each item in the vertical list contains a horizontal RecyclerView for displaying images.
API Integration: The app uses Retrofit to fetch data from the API and displays the retrieved documents and images in the RecyclerView.
Image Loading: Picasso library is used to efficiently load and display images fetched from the API.
Secure API Access: The app utilizes OkHttp Interceptor to add an authToken to each API request, ensuring secure and authorized access to the server.
User-friendly Interface: The app provides a user-friendly interface for smooth navigation through the documents and images.

## Getting Started
To run the app on your Android device or emulator, follow these steps:

Clone the repository: git clone https://github.com/yourusername/nested-recyclerview-app.git
Open the project in Android Studio.
Build the project and resolve any dependencies.
Connect your Android device or start an emulator.
Click on the "Run" button in Android Studio to install the app on your device/emulator.

## Dependencies
The app uses the following dependencies:

Retrofit: A type-safe HTTP client for making API requests.
Picasso: A powerful image loading and caching library.
OkHttp: An efficient HTTP client with Interceptor for adding the authToken.
RecyclerView: Android's built-in view for displaying a list of items efficiently.
API Integration
The app communicates with the API at https://api.example.com to fetch documents and images. It expects a valid authToken to be added to the API requests using OkHttp Interceptor.

![Screenshot 2023-07-26 011640](https://github.com/subha-asish/InternshipInduction/assets/82257697/cfea298b-c3a4-4862-9042-10541d824224)

## Contributing
If you wish to contribute to this project, feel free to open issues and submit pull requests.



## Acknowledgments
Thanks to the creators of Retrofit, Picasso, OkHttp, and RecyclerView for their excellent libraries.
Special thanks to the team at API Example for providing the API used in this project.
