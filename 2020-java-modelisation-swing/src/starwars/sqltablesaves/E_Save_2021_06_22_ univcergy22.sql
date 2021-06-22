-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mar. 22 juin 2021 à 15:36
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
-- Structure de la table `acces`
--

CREATE TABLE `acces` (
  `id` int(11) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `statut` varchar(20) NOT NULL,
  `age` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `acces`
--

INSERT INTO `acces` (`id`, `prenom`, `login`, `password`, `statut`, `age`) VALUES
(1, 'Tom', 'tomahawk', 'indien', 'Etudiant', 22),
(2, 'Pierre', 'Pierrot', 'delalune', 'Prof', 44),
(3, 'Michel', 'lamere', 'sonchat', 'Admin', 69),
(4, 'Robin', 'Locksley', 'desbois', 'Etudiant', 23);

-- --------------------------------------------------------

--
-- Structure de la table `acteurs`
--

CREATE TABLE `acteurs` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `acteurs_personnages`
--

CREATE TABLE `acteurs_personnages` (
  `id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL,
  `personnages_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
(1, 'Avis 1', 'Description de l\'avis 1', 1),
(2, 'Avis 2', 'Description de l\'avis 2', 2),
(3, 'Avis 3', 'Description de l\'avis 3', 3),
(4, 'Avis 4', 'Description de l\'avis 4', 1),
(5, 'Avis 5', 'Description de l\'avis 5', 1),
(6, 'Avis 6', 'Description de l\'avis 6', 1),
(7, 'Avis 7', 'Description de l\'avis 7', 2),
(8, 'Avis 8', 'Description de l\'avis 8', 4),
(9, 'Avis 9', 'Description de l\'avis 9', 3),
(10, 'Avis 10', 'Description de l\'avis 10', 2),
(11, 'Avis 11', 'Description de l\'avis 11', 3),
(12, 'Avis 12', 'Description de l\'avis 12', 4),
(13, 'Avis 13', 'Description de l\'avis 13', 2),
(14, 'Avis 14', 'Description de l\'avis 14', 2),
(15, 'Avis 15', 'Description de l\'avis 15', 2),
(16, 'Avis 16', 'Description de l\'avis 16', 3),
(17, 'Avis 17', 'Description de l\'avis 17', 1),
(18, 'Avis 18', 'Description de l\'avis 18', 1),
(19, 'Avis 19', 'Description de l\'avis 19', 4),
(20, 'Avis 20', 'Description de l\'avis 20', 2),
(21, 'Avis', 'Démo', 1),
(22, 'Avis', 'Démo', 2),
(23, 'Avis', 'Démo', 3),
(24, 'Avis', 'Démo', 4),
(25, 'Avis', 'Démo', 0),
(26, 'Avis', 'Démo', 0),
(27, 'Avis', 'Démo', 4),
(28, 'Avis', 'Démo', 0),
(29, 'Avis', 'Démo', 2),
(30, 'Avis', 'Démo', 1),
(31, 'Avis', 'Démo', 4),
(32, 'Avis', 'Démo', 3),
(33, 'Avis', 'Démo', 0),
(34, 'Avis', 'Démo', 2),
(35, 'Avis', 'Démo', 0),
(36, 'Avis', 'Démo', 4),
(37, 'Avis', 'Démo', 3),
(38, 'Avis', 'Démo', 2),
(39, 'Avis', 'Démo', 0),
(40, 'Avis', 'Démo', 1),
(41, 'Avis', 'Démo', 4),
(42, 'Avis', 'Démo', 2),
(43, 'Avis', 'Démo', 4),
(44, 'Avis', 'Démo', 3),
(45, 'Avis', 'Démo', 0),
(46, 'Avis', 'Démo', 5),
(47, 'Avis', 'Démo', 0),
(48, 'Avis', 'Démo', 3),
(49, 'Avis', 'Démo', 5),
(50, 'Avis', 'Démo', 0);

-- --------------------------------------------------------

--
-- Structure de la table `films`
--

CREATE TABLE `films` (
  `id` int(11) NOT NULL,
  `titre` varchar(20) NOT NULL,
  `anneeDeSortie` varchar(20) NOT NULL,
  `numeroEpisode` int(20) NOT NULL,
  `cout` double NOT NULL,
  `recette` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `films`
--

INSERT INTO `films` (`id`, `titre`, `anneeDeSortie`, `numeroEpisode`, `cout`, `recette`) VALUES
(1, 'Star Wars IV', '1977', 4, 12589.12, 12359.12),
(2, 'Star Wars V', '1980', 5, 12589.12, 122359.12),
(3, 'Star Wars VI', '1983', 6, 124589.12, 122359.12),
(4, 'Star Wars I', '1999', 1, 123589.12, 12259.12),
(5, 'Star Wars II', '2002', 2, 14589.12, 12359.12),
(6, 'Star Wars III', '2005', 3, 123589.12, 12259.12),
(7, 'Star Wars VII', '2015', 4, 123589.12, 122359.12),
(8, 'Star Wars VIII', '2017', 5, 124589.12, 12359.12),
(9, 'Star Wars IX', '2019', 6, 124589.12, 122359.12),
(10, 'Jurassic Park I', '1993', 6, 12589.12, 12359.12),
(11, 'Jurassic Park II', '1997', 6, 12389.12, 122359.12),
(12, 'Jurassic Park II', '2001', 6, 12389.12, 12359.12),
(13, 'Jurassic World', '2015', 6, 123589.12, 122359.12),
(14, 'demo 1', '2021', 1, 123589.12, 122359.12),
(15, 'demo 2', '2021', 2, 123589.12, 122359.12),
(16, 'demo 3', '2021', 3, 123589.12, 122359.12),
(17, 'demo 4', '2021', 4, 123589.12, 122359.12),
(18, 'demo 5', '2021', 5, 123589.12, 122359.12),
(19, 'demo 6', '2021', 6, 123589.12, 122359.12),
(20, 'demo 7', '2021', 7, 123589.12, 122359.12),
(21, 'demo 8', '2021', 8, 123589.12, 122359.12),
(22, 'demo 9 ', '2021', 9, 123589.12, 122359.12),
(23, 'demo 10', '2021', 10, 123589.12, 122359.12),
(24, 'demo 11', '2021', 11, 123589.12, 122359.12),
(25, 'demo 12', '2021', 12, 123589.12, 122359.12),
(26, 'demo 13', '2021', 13, 123589.12, 122359.12),
(27, 'demo 14', '2021', 14, 123589.12, 122359.12),
(28, 'demo 15', '2021', 15, 123589.12, 122359.12),
(29, 'demo 16', '2021', 16, 123589.12, 122359.12),
(30, 'demo 17', '2021', 17, 123589.12, 122359.12);

-- --------------------------------------------------------

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

-- --------------------------------------------------------

--
-- Structure de la table `films_acteurs`
--

CREATE TABLE `films_acteurs` (
  `id` int(11) NOT NULL,
  `films_id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnages`
--

CREATE TABLE `personnages` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `statut`
--

CREATE TABLE `statut` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `statut`
--

INSERT INTO `statut` (`id`, `nom`) VALUES
(1, 'Etudiant'),
(2, 'Prof'),
(3, 'Admin'),
(4, 'Visiteur');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `acces`
--
ALTER TABLE `acces`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `acteurs`
--
ALTER TABLE `acteurs`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  ADD PRIMARY KEY (`id`),
  ADD KEY `acteurs_id` (`acteurs_id`),
  ADD KEY `personnages_id` (`personnages_id`);

--
-- Index pour la table `avis`
--
ALTER TABLE `avis`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `films`
--
ALTER TABLE `films`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `films_acces_avis`
--
ALTER TABLE `films_acces_avis`
  ADD PRIMARY KEY (`id`),
  ADD KEY `films_acces_avis_ibfk_1` (`films_id`),
  ADD KEY `films_acces_avis_ibfk_2` (`acces_id`),
  ADD KEY `films_acces_avis_ibfk_3` (`avis_id`);

--
-- Index pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `films_id` (`films_id`),
  ADD KEY `acteurs_id` (`acteurs_id`);

--
-- Index pour la table `personnages`
--
ALTER TABLE `personnages`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `statut`
--
ALTER TABLE `statut`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `acteurs`
--
ALTER TABLE `acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `avis`
--
ALTER TABLE `avis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT pour la table `films`
--
ALTER TABLE `films`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT pour la table `films_acces_avis`
--
ALTER TABLE `films_acces_avis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `personnages`
--
ALTER TABLE `personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `statut`
--
ALTER TABLE `statut`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  ADD CONSTRAINT `acteurs_personnages_ibfk_1` FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`),
  ADD CONSTRAINT `acteurs_personnages_ibfk_2` FOREIGN KEY (`personnages_id`) REFERENCES `personnages` (`id`);

--
-- Contraintes pour la table `films_acces_avis`
--
ALTER TABLE `films_acces_avis`
  ADD CONSTRAINT `films_acces_avis_ibfk_1` FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  ADD CONSTRAINT `films_acces_avis_ibfk_2` FOREIGN KEY (`acces_id`) REFERENCES `acces` (`id`),
  ADD CONSTRAINT `films_acces_avis_ibfk_3` FOREIGN KEY (`avis_id`) REFERENCES `avis` (`id`);

--
-- Contraintes pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  ADD CONSTRAINT `films_acteurs_ibfk_1` FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  ADD CONSTRAINT `films_acteurs_ibfk_2` FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
