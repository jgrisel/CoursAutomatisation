#!/bin/bash

nmax="nop"
while [[ ! $nmax =~ ^[0-9][0-9]$|^100$|^[0-9]$ ]] ; do
    echo "Combien d'eleve dans votre classe ? " && read nmax
    if [[ $nmax == "it's over" ]]
    then
        echo "Sortie demandée" && exit 42
    fi
done    
echo "Nouvelle Saisie" > fichierDeSaisie.txt
n=1
while [[ $n -le  $nmax ]] ; do
    echo "Saisie de l'eleve $n"
    nom="0"
    while [[ ! $nom =~ ^[A-Z][a-zA-Z]{0,9}$ ]] ; do
        echo "Veuillez saisir le nom de l'eleve" && read nom
        if [[ $nom = "it's over" ]]
        then
            echo "Sortie demandée" && exit 42
        fi
    done

    prenom="0"
    while [[ ! $prenom =~ ^[A-Z][a-z]{0,9}$ ]] ; do
        echo "Veuillez saisir le prenom de l'eleve" && read prenom
        if [[ $prenom = "it's over" ]]
        then
            echo "Sortie demandée" && exit 42
        fi
    done

    note=101
    while [[ ! $note =~ ^[0-9][0-9]$|^100$|^[0-9]$ ]] ; do
        echo "Veuillez saisir sa note" && read note
        if [[ $note = "it's over" ]]
        then
            echo "Sortie demandée" && exit 42
        fi
    done
        
    appreciation="Tricheur"
    if [ $note -le 48 ]
    then
        appreciation="Eliminatoire"
        elif [ $note -le 60 ]
        then
            appreciation="Peu mieux faire"
        elif [ $note -le 75 ]
        then
            appreciation="Assez bien"
        elif [ $note -le 99 ]
        then appreciation="Bien"
    fi

    echo "Nom : $nom    Prenom : $prenom    Note : $note    appréciation : $appreciation" >> fichierDeSaisie.txt
    ((n++))
done
echo "Saisie terminée !"