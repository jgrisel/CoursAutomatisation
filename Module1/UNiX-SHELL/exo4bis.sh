#!/bin/bash
i=1
patnombre="^([0-9]|[1-4][0-9]|50]$"
patnom="^[A-Z][a-z]{0,9}$"
patnote="^([0-1]|[1-9][0-9]|100)$"
over="over"
read -p "Saisissez le nombre d'élèves dans la classe ou tapez 'over' : " nombre
		if [ $nombre = $over ]
			then echo "It's over" 1>&2 && exit 42 
		fi
while [ $i -le $nombre ]
	do read -p "Sasissez le nom de l'élève : " nom
		while [[ ! $nom =~ $patnom ]]
			do echo "Le nom ne doit pas depasser 10 caractères et doit commencer par une majuscule"
			read nom
		done
	read -p "Sasissez le prénom de l'élève : " prenom
		while [[ ! $prenom =~ $patnom ]]
			do echo "Le prénom ne doit pas depasser 10 caractères et doit commencer par une majuscule"
			read prenom
		done
	read -p "Saisissez la note de l'élève entre 0 et 100 : " note
		while [[ ! $note =~ $patnote ]]
			do echo "La note doit être comprise entre 0 et 100 : "
			read note
		done
		((i++));
	if [[ $note -gt 0 && $note -le 48 ]]
			then echo "$nom $prenom - note eliminatoire" && echo "$nom $prenom - note eliminatoire" >> Notes.txt
		elif [[ $note -gt 49 && $note -le 60 ]]
			then echo "$nom $prenom - peut mieux faire" && echo "$nom $prenom - peut mieux faire" >> Notes.txt
		elif [[ $note -ge 61 && $note -le 75 ]]
			then echo "$nom $prenom - assez bien" && echo "$nom $prenom - assez bien" >> Notes.txt
		elif [[ $note -ge 76 && $note -le 99 ]]
			then echo "$nom $prenom - bien" && echo "$nom $prenom - bien" >> Notes.txt
		elif [[ $note -eq 100 ]]
			then echo "$nom $prenom - tricheur/euse" && echo "$nom $prenom - tricheur/euse" >> Notes.txt
	fi
	
done && echo "It's over"


	
	
#read -p "Sasissez la note de l'élève :" note