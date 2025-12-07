# Task Tracker Project Roadmap

Full-stack CRUD app built with Spring Boot and React. Follow the day-by-day plan and tick off milestones as you complete them.

## Goal and Timeline
- Goal: learn full-stack basics by shipping a Task Tracker (backend + frontend).
- Estimated time: 3–6 days (adjust as needed).

## Day 1 — Setup & Backend Skeleton
- [ ] Install tools: Java 21, IntelliJ IDEA, Node.js + npm, Postman/Thunder Client, Git.  
  - Validation: `java -version` shows 21; IntelliJ opens; Node installed.
- [ ] Create Spring Boot project via Spring Initializr with Spring Web, Spring Data JPA, H2, Lombok.  
  - Validation: `./gradlew bootRun` starts; visiting `http://localhost:8080` shows Whitelabel page.
- [ ] Add test endpoint `/api/test` returning `Hello Task Tracker!`.  
  - Validation: GET `/api/test` responds with the string.

## Day 2 — Build Task CRUD Backend
- [ ] Create `Task` entity with `id`, `title`, `completed` fields.
- [ ] Add `TaskRepository extends JpaRepository<Task, Long>`.
- [ ] Implement `TaskService` for findAll/save/delete.
- [ ] Create `TaskController` with GET/POST/PUT/DELETE on `/api/tasks`.  
  - Validation (Postman): list, create, update, delete all work.

## Day 3 — Frontend Setup & Basic UI
- [ ] Scaffold React app with Vite (`npm create vite@latest task-tracker-ui --template react`).
- [ ] Build `src/api.js` helpers for CRUD against `http://localhost:8080/api/tasks`.
- [ ] Create UI components (`TaskList`, `TaskItem`, `AddTaskForm`) and wire into `App.jsx`.  
  - Validation: add tasks, toggle completed, delete tasks in UI.

## Day 4 — CORS, DB Console, Validation
- [ ] Enable CORS in Spring Boot allowing `http://localhost:5173`.
- [ ] Expose H2 console (`spring.h2.console.enabled=true`, in-memory URL).  
  - Validation: open `http://localhost:8080/h2-console` and view `TASK` table.
- [ ] Add request validation (e.g., `@NotBlank title`) and a global exception handler.

## Day 5 — Polish, Refactor, README, GitHub
- [ ] Refactor backend package structure (controller/service/repository/model/dto/exception/config).
- [ ] Introduce DTOs to separate API models from entities.
- [ ] Split repo into `task-tracker-backend/` and `task-tracker-frontend/`.
- [ ] Write final README with tech stack, run steps, screenshots (this file can be expanded later).
- [ ] Push to GitHub.

## Day 6 — Optional Extensions
- [ ] Add search and completed filter.
- [ ] Add due date field and sort by date.
- [ ] Add pagination (backend + frontend).

## Resources
- Java: https://adoptium.net  
- Spring Boot docs: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/  
- Spring Initializr: https://start.spring.io  
- JPA basics: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.entity-persistence  
- REST tutorial (DTOs): https://spring.io/guides/tutorials/rest/

## How to Validate Progress Quickly
- Back end: `./gradlew test` and `./gradlew bootRun`; hit REST endpoints via Postman.
- Front end: `npm run dev` in `task-tracker-ui`; check CRUD flows in the browser.
- Database: inspect H2 console during development.

## Notes
- Replace `localhost` URLs if you change ports.
- Add screenshots of the UI once the frontend is running.
