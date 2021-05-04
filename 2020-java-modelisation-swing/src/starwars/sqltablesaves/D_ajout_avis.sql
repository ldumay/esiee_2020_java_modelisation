-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mar. 27 avr. 2021 à 14:10
-- Version du serveur :  5.7.31
-- Version de PHP : 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `univcergy22`
--

-- --------------------------------------------------------

--
-- Structure de la table `avis`
--

CREATE TABLE `avis` (
  `id` int(11) NOT NULL,
  `title` varchar(20) NOT NULL,
  `description` text NOT NULL,
  `note_avis` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `avis`
--

INSERT INTO `avis` (`id`, `title`, `description`, `note_avis`) VALUES
(1, "Avis 1", "Description de l'avis 1", 1),
(2, "Avis 2", "Description de l'avis 2", 2),
(3, "Avis 3", "Description de l'avis 3", 3),
(4, "Avis 4", "Description de l'avis 4", 1),
(5, "Avis 5", "Description de l'avis 5", 1),
(6, "Avis 6", "Description de l'avis 6", 1),
(7, "Avis 7", "Description de l'avis 7", 2),
(8, "Avis 8", "Description de l'avis 8", 4),
(9, "Avis 9", "Description de l'avis 9", 3),
(10, "Avis 10", "Description de l'avis 10", 2),
(11, "Avis 11", "Description de l'avis 11", 3),
(12, "Avis 12", "Description de l'avis 12", 4),
(13, "Avis 13", "Description de l'avis 13", 2),
(14, "Avis 14", "Description de l'avis 14", 2),
(15, "Avis 15", "Description de l'avis 15", 2),
(16, "Avis 16", "Description de l'avis 16", 3),
(17, "Avis 17", "Description de l'avis 17", 1),
(18, "Avis 18", "Description de l'avis 18", 1),
(19, "Avis 19", "Description de l'avis 19", 4),
(20, "Avis 20", "Description de l'avis 20", 2),
(21, "Avis", "Démo", 1),
(22, "Avis", "Démo", 2),
(23, "Avis", "Démo", 3),
(24, "Avis", "Démo", 4),
(25, "Avis", "Démo", 0),
(26, "Avis", "Démo", 0),
(27, "Avis", "Démo", 4),
(28, "Avis", "Démo", 0),
(29, "Avis", "Démo", 2),
(30, "Avis", "Démo", 1),
(31, "Avis", "Démo", 4),
(32, "Avis", "Démo", 3),
(33, "Avis", "Démo", 0),
(34, "Avis", "Démo", 2),
(35, "Avis", "Démo", 0),
(36, "Avis", "Démo", 4),
(37, "Avis", "Démo", 3),
(38, "Avis", "Démo", 2),
(39, "Avis", "Démo", 0),
(40, "Avis", "Démo", 1),
(41, "Avis", "Démo", 4),
(42, "Avis", "Démo", 2),
(43, "Avis", "Démo", 4),
(44, "Avis", "Démo", 3),
(45, "Avis", "Démo", 0),
(46, "Avis", "Démo", 5),
(47, "Avis", "Démo", 0),
(48, "Avis", "Démo", 3),
(49, "Avis", "Démo", 5),
(50, "Avis", "Démo", 0);

--
-- Structure de la table `films_acces_avis`
--

CREATE TABLE `films_acces_avis` (
  `id` int(11) NOT NULL,
  `films_id` int(11) NOT NULL,
  `acces_id` int(11) NOT NULL,
  `avis_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `films_acces_avis`
--

INSERT INTO `films_acces_avis` (`id`, `films_id`, `acces_id`, `avis_id`) VALUES
(1, 1, 1, 1),
(2, 1, 1, 2),
(3, 1, 1, 3),
(4, 1, 1, 4),
(5, 1, 1, 5),
(6, 1, 1, 6),
(7, 1, 1, 7),
(8, 1, 1, 8),
(9, 1, 1, 9),
(10, 1, 1, 10),
(11, 1, 1, 11),
(12, 1, 1, 12),
(13, 1, 1, 13),
(14, 1, 1, 14),
(15, 1, 1, 15),
(16, 1, 1, 16),
(17, 1, 1, 17),
(18, 1, 1, 18),
(19, 1, 1, 19),
(20, 1, 1, 20),
(21, 2, 1, 21),
(22, 2, 1, 22),
(23, 2, 1, 23),
(24, 3, 1, 24),
(25, 3, 1, 25),
(26, 3, 1, 26),
(27, 3, 1, 27),
(28, 4, 1, 28),
(29, 4, 1, 29),
(30, 4, 1, 30),
(31, 4, 1, 31),
(32, 5, 1, 32),
(33, 5, 1, 33),
(34, 5, 1, 34),
(35, 6, 1, 35),
(36, 6, 1, 36),
(37, 7, 1, 37),
(38, 7, 1, 38),
(39, 8, 1, 39),
(40, 8, 1, 40),
(41, 8, 1, 41),
(42, 8, 1, 42),
(43, 9, 1, 43),
(44, 9, 1, 44),
(45, 9, 1, 45),
(46, 10, 1, 46),
(47, 10, 1, 47),
(48, 10, 1, 48),
(49, 10, 1, 49),
(50, 10, 1, 50);


--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `avis`
--
ALTER TABLE `avis`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `films_acces_avis`
--
ALTER TABLE `films_acces_avis`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `avis`
--
ALTER TABLE `avis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `films_acces_avis`
--
ALTER TABLE `films_acces_avis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Index pour la table `films_acces_avis`
--

ALTER TABLE `films_acces_avis`
  ADD CONSTRAINT `films_acces_avis_ibfk_1` FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  ADD CONSTRAINT `films_acces_avis_ibfk_2` FOREIGN KEY (`acces_id`) REFERENCES `acces` (`id`),
  ADD CONSTRAINT `films_acces_avis_ibfk_3` FOREIGN KEY (`avis_id`) REFERENCES `avis` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
