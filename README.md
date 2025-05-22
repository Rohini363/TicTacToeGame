# 🎮 Tic Tac Toe Web Application

A clean and interactive **Java Servlet-based web application** for playing **Tic Tac Toe**. Designed with a responsive user interface using HTML, CSS, and Java Servlets (Jakarta EE), this app provides a fun two-player game experience in the browser.

---

## 🚀 Features

- Classic **Tic Tac Toe** game for two players.
- **Session-based** game state tracking using Java Servlets.
- Clean and responsive **CSS-styled 3x3 game board**.
- Displays real-time turn status, win, or draw outcome.
- **Restart game** option for quick replays.
- Built entirely with **Java Servlets**, **HTML**, and **CSS**.

---

## 🛠️ Requirements

- **Java JDK** 17 or higher  
- **Apache Tomcat** 10.x or 10.1.x (compatible with Jakarta EE 10)  
- **Eclipse IDE** (or any Java IDE with Dynamic Web Project support)  
- **Jakarta Servlet API** version 6.0.0  
- **Web browser** (for testing and playing)

---

## 📁 Project Structure

TicTacToeWeb/

├── `.classpath`  
├── `.project`  
├── `.settings/`  
│ └── `org.eclipse.jdt.core.prefs`  
├── `build/`  
├── `src/`  
│ └── `com/`  
│     └── `example/`  
│         └── `TicTacToeServlet.java`  
├── `WebContent/`  
│ ├── `index.html`  
│ ├── `css/`  
│ │   └── `style.css`  
│ └── `WEB-INF/`  
│     ├── `web.xml`  
│     └── `lib/` 
└── `README.md`  

---

## 🌐 How It Works

1. Users interact with the **index.html** page containing the 3x3 button grid.
2. JavaScript handles moves locally, updating the UI and checking for wins or draws.
3. The `TicTacToeServlet.java` handles session-based state (can be extended to backend moves).
4. Clicking **Restart** clears the session and reloads the board.

---

## 🎨 UI Snapshot (Design Overview)

- Smooth gradient background.
- Modern, clean game board with rounded buttons.
- Highlighted status text to indicate current turn or game result.
- Restart button styled with hover effects.
- Fully responsive layout suitable for desktop and mobile screens.

---

## ▶️ Running the Project

1. Open the project in **Eclipse** (as a Dynamic Web Project).
2. Ensure **Apache Tomcat 10.1+** is configured.
3. Right-click the project > `Run As` > `Run on Server`.
4. Open your browser and go to:  
   `http://localhost:8080/TicTacToeWeb/tictactoe`

---

## 🧪 Example Usage

| Player Action          | Board State Affected           | Status Message              |
|------------------------|-------------------------------|-----------------------------|
| Player X clicks center | Middle cell marked "X"        | "Player O's turn"           |
| Player O makes a line  | Three in a row for Player "O" | "Player O wins!"            |
| All cells filled       | No winning combination        | "It's a draw!"              |
| Click "Restart"        | Clears all cells              | "Player X's turn"           |

---

## 🙋‍♀️ Author

Developed by **Rohini363**  
GitHub: [github.com/Rohini363/TicTacToeGame](https://github.com/Rohini363/TicTacToeGame)
