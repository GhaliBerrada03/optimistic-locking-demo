# 📌 Optimistic Locking Demo (JPA + Hibernate)
## 📖 Description

Ce projet démontre le fonctionnement du verrouillage optimiste (Optimistic Locking) avec JPA / Hibernate.

Il simule un conflit de mise à jour concurrente sur une entité Reservation, avec :

✅ Simulation sans mécanisme de retry

✅ Gestion d'OptimisticLockException

✅ Implémentation d’un mécanisme de retry automatique

✅ Exécution multi-thread avec CountDownLatch

## 🏗️ Architecture du Projet

src/main/java/com.example
│
├── model
│   ├── Reservation.java
│   ├── Salle.java
│   └── Utilisateur.java
│
├── service
│   ├── ReservationService.java
│   └── ReservationServiceImpl.java
│
├── App.java
├── ConcurrentReservationSimulator.java
└── OptimisticLockingRetryHandler.java

## 🚀 Exécution

<img width="722" height="575" alt="Screenshot 2026-03-01 222847" src="https://github.com/user-attachments/assets/1ec8a410-5692-4786-93ef-b8e31201d526" />
<img width="722" height="613" alt="Screenshot 2026-03-01 222909" src="https://github.com/user-attachments/assets/f5697806-4a32-4d8d-a503-616944d1e62f" />
<img width="910" height="797" alt="Screenshot 2026-03-01 223007" src="https://github.com/user-attachments/assets/b5f98af7-cd4c-4041-8ad2-319ffd4eac22" />
<img width="1595" height="778" alt="Screenshot 2026-03-01 223030" src="https://github.com/user-attachments/assets/9dd338d7-6e75-4d0f-a55d-013b1a133fa8" />
<img width="820" height="767" alt="Screenshot 2026-03-01 223117" src="https://github.com/user-attachments/assets/07e99659-b8b7-40a2-a989-97f9f6c7dae1" />
<img width="738" height="653" alt="Screenshot 2026-03-01 223129" src="https://github.com/user-attachments/assets/1d98a498-9a19-43e0-aafe-bf6a4e09c8b1" />
<img width="520" height="431" alt="Screenshot 2026-03-01 223137" src="https://github.com/user-attachments/assets/91c8fdff-61c6-422f-bbec-9d874adb7b7c" />


