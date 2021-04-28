<%-- 
    Document   : filmListe
    Created on : 28 avr. 2021, 21:03:59
    Author     : ldumay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
<!-- Head -->
<%@ include file="includes/head.jsp" %>
<!-- ./Head -->
    
    <!-- Body -->
    <body>
        <div class="container">
            
            <!-- Header -->
            <%@ include file="includes/header.jsp" %>
            <!-- ./Header -->
            
            <div class="row">
                <div class="col-12">
                    <ul>
                        <li>Liste des films : <a href="/2020-java-modelisation-web/FilmListe">[liste des film]</a>
                            <!--
                            <ol>
                                <li>Saisir un nouveau film : <a href="/2020-java-modelisation-web/FilmSaisi">[saisir nouveau film]</a></li>
                                <li>Mettre à jour un film : <a href="/2020-java-modelisation-web/FilmMiseAJour">[mise à jour d'un film]</a></li>
                                <li>Résultat de la saisie d'un nouveau film : <a href="/2020-java-modelisation-web/FilmSaisiResultat">[résultat nouveau film]</a></li>
                            </lo>
                            -->
                        </li>
                    </ul>
                    <hr>
                    <p>© Copyright 2020 - Créer par <a target="_blank" href="https://ldumay.fr/">Loïc Dumay</a></p>
                </div>
            </div>
        </div>
    </body>
    <!-- ./Body -->

<!-- Foot -->
<%@ include file="includes/foot.jsp" %>
<!-- ./Foot -->