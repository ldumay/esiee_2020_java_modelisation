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
-- Structure de la table `films_acteurs`
--

CREATE TABLE `films_acteurs` (
  `id` int(11) NOT NULL,
  `films_id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Structure de la table `acteurs`
--

CREATE TABLE `acteurs` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Structure de la table `acteurs_personnages`
--

CREATE TABLE `acteurs_personnages` (
  `id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL,
  `personnages_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Structure de la table `personnages`
--

CREATE TABLE `personnages` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `films`
--
ALTER TABLE `films`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
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
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `personnages`
--
ALTER TABLE `personnages`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `films`
--
ALTER TABLE `films`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;


--
-- AUTO_INCREMENT pour la table `acteurs`
--
ALTER TABLE `acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

--
-- AUTO_INCREMENT pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

--
-- AUTO_INCREMENT pour la table `personnages`
--
ALTER TABLE `personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;


--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  ADD FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  ADD FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`);

--
-- Contraintes pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  ADD FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`),
  ADD FOREIGN KEY (`personnages_id`) REFERENCES `personnages` (`id`);