# Java Backend Interview Prep — 30 Days

A focused 30-day plan to get ready for **Java Backend / Software Engineer** interviews: data structures & algorithms, Core Java, SQL, Spring Boot, system design, and two deployed backend projects.

**Start:** 13 Nov 2026 · **End:** 12 Dec 2026 · **Pace:** 8 hours a day

---

## 📊 Progress at a glance

| Area | Target | Done | Status |
|------|--------|------|--------|
| DSA problems (LeetCode) | 150 | 4 | 🟨 In progress |
| SQL problems (LeetCode SQL 50) | 50 | 4 | 🟨 In progress |
| Core Java topics | 10 | 0 | ⬜ Not started |
| Spring Boot topics | 9 | 0 | ⬜ Not started |
| System design topics | 18 | 0 | ⬜ Not started |
| Projects deployed | 2 | 0 | ⬜ Not started |
| Days completed | 30 | 0 | Day 1 of 30 |

> Status key: ⬜ Not started · 🟨 In progress · ✅ Done

---

## 🗓️ Weekly plan

| Week | Dates | DSA | Java / SQL / Spring / Projects | System design |
|------|-------|-----|--------------------------------|---------------|
| 1 | 13–19 Nov | Arrays, Hashing, Two Pointers, Sliding Window, Prefix Sum, Binary Search | Core Java (OOP, Collections, Generics, Exceptions, Streams, Threads, JVM) + SQL (SELECT → transactions) | — |
| 2 | 20–26 Nov | Linked List, Stack, Queue, Trees | Spring Boot basics (practice Task API) → Project 1 starts, JWT security | Web basics, scaling, databases, sharding |
| 3 | 27 Nov – 3 Dec | Backtracking, Heaps, Graphs, DP 1D | Project 1: tests, Docker, AWS deploy → Project 2: Redis, scheduling | Caching, queues, rate limiting, URL shortener, notification system |
| 4 | 4–12 Dec | DP 2D, timed mixed sets, mock interviews | Project 2: CI + deploy, resume, behavioural (STAR), applying | Design patterns, parking lot, chat app, news feed, mock |

**Every day:** DSA problems · second-track topic · revise 2 old problems · commit to this repo
**Every Sunday:** weekly checkpoint test + LeetCode weekly contest

---

## 📅 Daily log

| Day | Date | DSA solved | SQL | Java / Spring / Project | System design | ✅ |
|-----|------|-----------|-----|-------------------------|---------------|----|
| 1 | 13 Nov | | | OOP, equals/hashCode, HashMap internals | — | ⬜ |
| 2 | 14 Nov | | | Collections, Comparable/Comparator | — | ⬜ |
| 3 | 15 Nov | | | Git basics · **Checkpoint 0** | — | ⬜ |
| 4 | 16 Nov | | | Generics, Exceptions | — | ⬜ |
| 5 | 17 Nov | | | Java 8: lambdas, Streams, Optional | — | ⬜ |
| 6 | 18 Nov | | | Multithreading basics | — | ⬜ |
| 7 | 19 Nov | | | JVM memory, GC, immutability | — | ⬜ |
| 8 | 20 Nov | | | Spring: REST, IoC/DI, Maven | — | ⬜ |
| 9 | 21 Nov | | | Spring: layers, JPA + MySQL | — | ⬜ |
| 10 | 22 Nov | | | Validation, exception handling · **Checkpoint 1** | — | ⬜ |
| 11 | 23 Nov | | | Project 1: schema + setup | Web basics, REST design | ⬜ |
| 12 | 24 Nov | | | Project 1: CRUD, DTOs, pagination | Scaling, load balancers | ⬜ |
| 13 | 25 Nov | | | Spring Security + JWT | SQL vs NoSQL, replication | ⬜ |
| 14 | 26 Nov | | | Project 1: auth, per-user data | Sharding, CAP | ⬜ |
| 15 | 27 Nov | | | Project 1: reports, Swagger | Caching, Redis | ⬜ |
| 16 | 28 Nov | | | Project 1: JUnit + Mockito | Message queues | ⬜ |
| 17 | 29 Nov | | | Docker · **Checkpoint 2** | Rate limiting, API gateway | ⬜ |
| 18 | 30 Nov | | | Project 1: AWS deploy, README | Monolith vs microservices | ⬜ |
| 19 | 1 Dec | | | Project 2: design + entities | URL shortener | ⬜ |
| 20 | 2 Dec | | | Project 2: APIs, search, JWT | Rate limiter | ⬜ |
| 21 | 3 Dec | | | Project 2: Redis, scheduled reminders | Notification system | ⬜ |
| 22 | 4 Dec | | | Project 2: tests, Docker, CI | Design patterns | ⬜ |
| 23 | 5 Dec | | | Project 2: deploy · Resume v1 | Parking lot (LLD) | ⬜ |
| 24 | 6 Dec | | | Resume final · **Checkpoint 3** · start applying | Scale Project 1 to 10M users | ⬜ |
| 25 | 7 Dec | | | STAR stories | Chat app | ⬜ |
| 26 | 8 Dec | | | Project pitches + deep dives | News feed | ⬜ |
| 27 | 9 Dec | | | Top 50 Java + Spring questions | Library / elevator (LLD) | ⬜ |
| 28 | 10 Dec | | | Top 30 SQL interview queries · DSA mock | Revision | ⬜ |
| 29 | 11 Dec | | | Behavioural mock | System design mock | ⬜ |
| 30 | 12 Dec | | | Final revision | — | ⬜ |

---

## 🧩 DSA problems by pattern

Each solution file starts with a header: problem number, pattern, time/space complexity, key trick.

### Arrays & Hashing — `dsa/01-arrays-hashing/`
| # | Problem | Difficulty | Pattern | Solved | Revised |
|---|---------|-----------|---------|--------|---------|
| 217 | Contains Duplicate | Easy | HashSet | ⬜ | ⬜ |
| 242 | Valid Anagram | Easy | Frequency count | ⬜ | ⬜ |
| 1 | Two Sum | Easy | HashMap lookup | ⬜ | ⬜ |
| 49 | Group Anagrams | Medium | HashMap grouping | ⬜ | ⬜ |
| 347 | Top K Frequent Elements | Medium | Bucket sort | ⬜ | ⬜ |
| 238 | Product of Array Except Self | Medium | Prefix / suffix | ⬜ | ⬜ |

<!-- Add a new section like the one above for each pattern as you reach it:
Two Pointers · Sliding Window · Prefix Sum · Binary Search · Linked List · Stack · Trees ·
Backtracking · Heaps · Graphs · Dynamic Programming -->

---

## 🗄️ SQL — `sql/`
| # | Problem | Concept | Solved |
|---|---------|---------|--------|
| 1757 | Recyclable and Low Fat Products | WHERE | ⬜ |
| 584 | Find Customer Referee | NULL handling | ⬜ |
| 595 | Big Countries | OR conditions | ⬜ |
| 1148 | Article Views I | DISTINCT, ORDER BY | ⬜ |
| 1683 | Invalid Tweets | String functions | ⬜ |

---

## ☕ Core Java — `java-concepts/`
- [ ] OOP pillars, abstract class vs interface
- [ ] `equals()` and `hashCode()` contract
- [ ] HashMap internals
- [ ] Collections Framework, Comparable vs Comparator
- [ ] Generics
- [ ] Exception handling (checked vs unchecked, custom exceptions)
- [ ] Java 8: lambdas, Streams, Optional
- [ ] Multithreading basics (ExecutorService, `synchronized`, `volatile`)
- [ ] JVM memory model and garbage collection
- [ ] String pool and immutability

## 🌱 Spring Boot
- [ ] HTTP and REST principles
- [ ] IoC and dependency injection
- [ ] Controller / Service / Repository layers
- [ ] Spring Data JPA and Hibernate
- [ ] MySQL integration
- [ ] Validation and global exception handling
- [ ] Spring Security with JWT
- [ ] JUnit and Mockito testing
- [ ] Docker and AWS deployment

## 🏗️ System design — `system-design/`
- [ ] Client-server, DNS, REST API design
- [ ] Vertical vs horizontal scaling, load balancers
- [ ] SQL vs NoSQL, indexing, replication
- [ ] Sharding and CAP theorem
- [ ] Caching (Redis, eviction policies)
- [ ] Message queues (Kafka / RabbitMQ)
- [ ] Rate limiting and API gateways
- [ ] Monolith vs microservices
- [ ] Design: URL shortener
- [ ] Design: rate limiter
- [ ] Design: notification system
- [ ] Design: chat application
- [ ] Design: news feed
- [ ] LLD: design patterns (Singleton, Factory, Builder, Strategy, Observer)
- [ ] LLD: parking lot
- [ ] LLD: library management / elevator
- [ ] Scaling my own project to 10M users
- [ ] Mock system design interview

---

## 🚀 Projects

| Project | Stack | Status | Links |
|---------|-------|--------|-------|
| **Expense Tracker API** | Spring Boot, MySQL, JPA, JWT, JUnit/Mockito, Docker, AWS | ⬜ Starts 23 Nov | repo · live demo |
| **Job Application Tracker** | Spring Boot, MySQL, Redis, Scheduling, GitHub Actions, Docker | ⬜ Starts 1 Dec | repo · live demo |

---

## 📁 Repository structure

```
interview-prep/
├── README.md
├── dsa/              # one folder per pattern, one Java file per problem
├── sql/              # SQL solutions, one file per topic
├── java-concepts/    # small runnable demos of Core Java concepts
└── system-design/    # one markdown note per topic
```

## 🛠️ Tools
Java 21 · IntelliJ IDEA · MySQL 8 · Spring Boot 3 · Maven · Postman · Docker · AWS · Git
