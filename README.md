# NHL-Tracker-App
Led a team of 3 to develop an Android NHL Tracker App using Java, XML, and Android Studio for a project in CP470 at Wilfrid Laurier University. The app features real-time scores, the latest NHL news, updated standings, and daily game predictions. It also includes a profile tab for users to add and manage their favorite teams, providing a personalized NHL experience. Accessed an NHL API using Retrofit that has standings, past/future games, news, and betting odds data.

Language: Java
UI Layouts: XML
IDE: Android Studio
Libraries/Frameworks: Android SDK, Retrofit, Gson, JSON
API Integration: https://github.com/Zmalski/NHL-API-Reference

How It Works:
Real-Time Data Fetching: Scores, news, standings, and predictions are updated in real-time using API calls.
Local Storage: Profile data (favorite teams) is stored locally using SharedPreferences and the news articles are added to a databased and accessed using SQL statements.
Custom Predictions Algorithm: Uses a betting odds api for daily NHL games and converts each teams winning odds to a percentage.
Modular Design: Separate modules for each tab ensure ease of development and scalability.
