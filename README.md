# Cricket Score Tracker 🏏

An Android application for tracking cricket match scores between two teams. Keep track of runs, wickets, and match statistics with an intuitive and user-friendly interface.

## Features

- **Score Tracking**: Track runs for both teams (1, 2, 3, 4, 6, extra runs)
- **Wicket Management**: Count wickets fallen for each team (max 10 per team)
- **Match Reset**: Reset scores and wickets to start a new match
- **Real-time Updates**: Instant score updates with button taps
- **Clean UI**: Simple and intuitive interface for easy scoring

## Screenshots

<div align="center">
  <img src="screenshots/home_screen.png" alt="Cricket Score Tracker Home" width="250"/>
  <img src="screenshots/match_progress.png" alt="Match in Progress" width="250"/>
</div>

### App Features
| Home Screen | Scoring Interface | Match Reset |
|-------------|-------------------|-------------|
| Clean interface with team names | Easy run buttons (1,2,3,4,6) | Quick reset functionality |
| Wicket counters for both teams | Real-time score updates | Professional cricket layout |

## Demo

![Cricket Tracker Demo](screenshots/demo.webm)

*GIF showing the app in action - adding runs, wickets, and resetting match*

## Technical Details

- **Platform**: Android
- **Language**: Java
- **Min SDK**: API 24 (Android 7.0)
- **Target SDK**: API 36
- **Build System**: Gradle
- **Architecture**: AndroidX

## Getting Started

### Prerequisites
- Android Studio
- Android SDK API 24+
- Java 8+

### Installation
1. Clone the repository
   ```bash
   git clone https://github.com/sandesha21/cricket-score-tracker.git
   ```
2. Open the project in Android Studio
3. Build and run the app on your device or emulator

## Usage

1. **Adding Runs**: Tap the run buttons (1, 2, 3, 4, 6, extras) under each team to add runs
2. **Adding Wickets**: Tap the wicket button to increment wickets (max 10)
3. **Reset Match**: Use the reset button to start a new match

## Project Structure

```
├── app/
│   ├── src/main/
│   │   ├── java/com/example/android/trackcricketscore/
│   │   │   └── MainActivity.java
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   ├── values/
│   │   │   └── drawable/
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── screenshots/
│   ├── home_screen.png
│   ├── team_a_scoring.png
│   ├── match_progress.png
│   └── demo.gif
├── gradle/
├── build.gradle
├── README.md
└── .gitignore
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author  
**Sandesh S. Badwaik**  

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sbadwaik/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/sandesha21)

## Acknowledgments

- Built as part of Google Android Nanodegree program
- Inspired by the need for simple cricket scoring solutionss