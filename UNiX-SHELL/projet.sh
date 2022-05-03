#!/bin/bash

#supprimer répertoire Tomcat pour pouvoir ré-éxécuter le test
rm -rf $HOME/Tomcat
rm -rf $HOME/Tomcat.txt
date | tee -a log.txt
date | tee -a erreurs.txt
#creer un répertoire Tomcat s'il n'existe pas, télécharger et décompresser le fichier tar de Tomcat
if [ ! -d $HOME/Tomcat ]
then echo "le répertoire n'existe pas et va être créer" | tee -a log.txt
mkdir Tomcat
	if [ ! -e $HOME/Tomcat/apache-tomcat-8.5.78.tar.gz ]
	then echo "le fichier tar.gz n'existe pas et va être télécharger et décompresser"  | tee -a log.txt 
	wget -P $HOME/Tomcat https://dlcdn.apache.org/tomcat/tomcat-8/v8.5.78/bin/apache-tomcat-8.5.78.tar.gz --no-check-certificate
	tar -zxvf $HOME/Tomcat/apache-tomcat-8.5.78.tar.gz -C $HOME/Tomcat
	else echo "le fichier tar.gz n'a pas besoin d'être téléchargé" | tee -a erreurs.txt
	fi
else echo "le répertoire existe déja" | tee -a erreurs.txt
fi

#télécharger le fichier jenkins.war s'il n'existe pas et le placer dans le répertoire webapps
if [ ! -e $HOME/Tomcat/apache-tomcat-8.5.78/webapps/jenkins.war ]
then echo "le fichier jenkins.war n'existe pas et va être déposé" | tee -a log.txt
wget -P $HOME/Tomcat/apache-tomcat-8.5.78/webapps https://get.jenkins.io/war-stable/2.332.2/jenkins.war --no-check-certificate
else echo "le fichier jenkins.war existe déjà" | tee -a erreurs.txt
fi

#Lancer le Tomcat
sh $HOME/Tomcat/apache-tomcat-8.5.78/bin/startup.sh && echo "Le Tomcat a démarré avec succès" | tee -a log.txt

#vérifier la bonne éxécution du Tomcat
sleep 10s
ps aux | grep Tomcat | tee -a Tomcat.txt
file_path="/home/projet/Tomcat.txt"
a=`wc --lines < $file_path`
echo "la valeur de a est de   " $a
if [[ $a -gt 1 ]]
then echo "Tomcat est bien en éxécution" | tee -a log.txt
else echo "Tomcat n'a pas démarré" | tee -a erreurs.txt
fi


  
