📚 perpusDigital — Sistem Manajemen Perpustakaan Digital Berbasis Java Swing
   
Proyek Uji Kompetensi Keahlian (UKK) Rekayasa Perangkat Lunak / PPLG — Tahun Ajaran 2026/2027
Tema: Educational Digital Solution • Platform: Desktop Java Swing & MySQL

📌 1. Latar Belakang Masalah & Solusi
Pengelolaan data inventaris buku, pencatatan anggota, dan sirkulasi peminjaman di perpustakaan pada umumnya masih dilakukan secara semi-manual atau menggunakan spreadsheet terpisah yang rentan terhadap inkonsistensi data, hilangnya rekam jejak peminjaman, serta keterlambatan penghitungan denda.
perpusDigital hadir sebagai solusi aplikasi desktop terpusat yang dirancang untuk:
Digitalisasi Master Data: Menyediakan manajemen data buku dan anggota yang terstruktur dengan antarmuka tabel interaktif (JTable).
Sirkulasi Transaksi Real-Time: Otomatisasi proses peminjaman, tanggal jatuh tempo, dan kalkulasi denda keterlambatan.
Role-Based Access Control (RBAC): Pemisahan hak akses yang tegas antara Admin, Pustakawan, dan Petugas Layanan menggunakan modul kelas SessionManager.

🛠️ 2. Tech Stack & Architecture
Frontend / GUI: Java Swing (NetBeans Form Designer, AWT Layouts).
Backend / Business Logic: Java SE (JDK 17+), DAO Pattern (Data Access Object).
Database: MySQL / MariaDB (InnoDB Engine, 3rd Normal Form - 3NF).
Security: Parameterized Prepared Statements (Anti SQL Injection), Global Uncaught Exception Handler (Fail-Safe), Session Guard.

🚀 3. Panduan Instalasi Lokal (Quick Local Setup)
Ikuti langkah berikut untuk menjalankan proyek di lingkungan lokal Anda:
Prasyarat Sistem:
Java Development Kit (JDK 17 atau lebih baru)
Apache NetBeans IDE (disarankan versi 17+)
MySQL Server / XAMPP / Laragon (Port 3306)
Git CLI
Langkah Instalasi:
# 1. Klon repositori ini
git clone https://github.com/Davin147/UKK2026_KLP-13_SMART-LIBRARY
cd perpusDigital

# 2. Buka proyek melalui Apache NetBeans IDE
# Pilih File -> Open Project -> Pilih folder perpusDigital

# 3. Konfigurasi Database
# Buat database baru di phpMyAdmin dengan nama: perpusdigital_db
# Impor berkas struktur database dari folder docs/perpusdigital_db.sql

# 4. Sesuaikan koneksi database pada kelas DatabaseConnection.java jika diperlukan
# Host: localhost | User: root | Password: (kosong)

# 5. Lakukan Clean and Build di NetBeans untuk menghasilkan berkas dist/perpusDigital.jar
Atau jalankan langsung menggunakan paket rilis portabel dengan skrip run.bat yang telah disediakan di dalam folder rilis.

🔑 4. Akun Pengujian Default (Credentials)
Gunakan kredensial berikut untuk menguji hak akses multi-role:
Peran Pengguna
Username
Password
Hak Akses Utama
Administrator
admin
admin123
Kelola sistem, manajemen staf, konfigurasi penuh
Pustakawan
pustakawan
pustakawan123
Kelola katalog buku, inventaris, dan stok
Petugas
petugas
petugas123
Pendaftaran anggota & transaksi sirkulasi pinjam/kembali


👥 5. Anggota Pengembang Tim
Davin Aldiansah (Lead Developer / Arsitek Sistem & Database) • NISN: 0081311783
Nesya Fitriani (UI/UX Developer) • NISN: 0103419657
Pembimbing UKK: Asep Baban Sobana, S.T.,Gr., M.Si.
SMK Budi Bakti Ciwidey / Lembaga Pendidikan — 2026/2027
