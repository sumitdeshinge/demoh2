# Spring Boot Member Management System (H2 Database)

## 📌 Overview
This is a **Spring Boot 3 + Java 21** project that provides a simple **Member Management System** with RESTful APIs.  
It allows users to:
- Add new members
- Retrieve members by ID
- List all members  
- Frontend is built with **React** for UI interactions.

## 🏗️ Tech Stack
- **Backend:** Spring Boot 3, Java 21, Spring Data JPA
- **Database:** H2 (In-Memory)
- **Frontend:** React
- **Build Tool:** Maven

---

## 🚀 **Getting Started**

### **1️⃣ Prerequisites**
- **Java 21** (Ensure it's installed: `java -version`)
- **Maven 3+** (`mvn -version`)
- **Node.js 18+** (For React UI: `node -v`)
- **Git** (For cloning the repo)

---

### **2️⃣ Clone the Repository**
```sh
git clone https://github.com/sumitdeshinge/demoh2
```

### **3️⃣ Backend Setup**
```sh
**1. Build & Run Spring Boot App**
mvn clean install
mvn spring-boot:run
```

### **2. API Endpoints**
```sh
List Members: GET http://localhost:8080/members
Get Member by ID: GET http://localhost:8080/members/{id}
Add Member: POST http://localhost:8080/members (JSON Body)
```

### **3. H2 Database Console**
```sh
Open http://localhost:8082/h2-console
Use JDBC URL: jdbc:h2:mem:testdb
Username: sa (No password)
```


### **4️⃣ Frontend Setup**

### **1. Navigate to frontend folder:**
```sh
cd frontend
```

### **2. Install dependencies:**
```sh
npm install
```

### **3. Run React App:**
```sh
npm start
```

### **4. Open Browser:**
```sh
http://localhost:3000/ to interact with the system.
```


