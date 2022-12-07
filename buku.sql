-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Des 2022 pada 23.44
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `buku`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `kode_buku` varchar(10) NOT NULL,
  `judul_buku` varchar(50) NOT NULL,
  `id_penulis` varchar(10) NOT NULL,
  `publis_buku` varchar(4) NOT NULL,
  `genre_buku` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`kode_buku`, `judul_buku`, `id_penulis`, `publis_buku`, `genre_buku`) VALUES
('001-1', 'A: Aku, Benci dan Cinta', '001', '2015', 'Romantis'),
('001-10', 'I Wuf You', '001', '2017', 'Romantis'),
('001-11', 'Sadena dan Sandra', '001', '2019', 'Romantis'),
('001-2', 'Matt & Mou', '001', '2016', 'Romantis'),
('001-3', 'With Julian', '001', '2016', 'Remaja'),
('001-4', 'Me and My Broken Heart', '001', '2018', 'Romantis'),
('001-5', 'Story of Seth', '001', '2019', 'Romantis'),
('001-6', 'R: Raja, Ratu & Rahasia', '001', '2016', 'Romantis'),
('001-7', 'R: Raja, Ratu & Rindu', '001', '2020', 'Romantis'),
('001-8', 'Daisy', '001', '2019', 'Romantis'),
('001-9', 'Brothermaker: Mimpi, Luka dan Cerita Kemenangan Ki', '001', '2016', 'Remaja'),
('002-1', 'Dilan: Dia adalah Dilanku tahun 1990', '002', '2014', 'Remaja'),
('002-2', 'Dilan Bagian Kedua: Dia adalah Dilanku Tahun 1991', '002', '2015', 'Remaja'),
('002-3', 'Milea: Suara dari Dilan', '002', '2016', 'Remaja');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penulis`
--

CREATE TABLE `penulis` (
  `id_penulis` varchar(10) NOT NULL,
  `nama_penulis` varchar(50) NOT NULL,
  `asal_penulis` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penulis`
--

INSERT INTO `penulis` (`id_penulis`, `nama_penulis`, `asal_penulis`) VALUES
('001', 'Wulanfadi', 'Jakarta'),
('002', 'Pidi Baiq', 'Bandung'),
('003', 'Tere Liye', 'Jakarta'),
('004', 'Tere Liye', 'Jakarta');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kode_buku`),
  ADD KEY `id_penulis` (`id_penulis`);

--
-- Indeks untuk tabel `penulis`
--
ALTER TABLE `penulis`
  ADD PRIMARY KEY (`id_penulis`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `buku_ibfk_1` FOREIGN KEY (`id_penulis`) REFERENCES `penulis` (`id_penulis`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
