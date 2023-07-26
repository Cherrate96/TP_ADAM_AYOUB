# TP_ADAM_AYOUB
 
**Scalabilité horizontale :** 

***Solution Théorique :***
Nous avons divisés l'application monolithique en microservices indépendants(5 morceaux). 
Chaque microservice gère une fonctionnalité spécifique. 

***Solution Pratique :***
Dans notre cas nous avons utiliseu Kubernetes pour orchestrer les microservices et scaler automatiquement en fonction de la demande. Kubernetes permettra de répartir automatiquement la charge sur plusieurs instances de chaque microservice en fonction de la charge du système.

**Incohérence des soldes :**

***Solution théorique :***
Nous avons implémenté un modèle de consistence approprié pour les transactions bancaires. En utilisant le pattenr "CQRS pattern" on a séparés la base initiale en plusieurs base de donées.

***Solution pratique :*** 
L'utilisation de Kafka permet une communication fiable et distribuée entre les différents microservices, et garantit que les transactions sont traitées de manière cohérente. De plus, la mise en œuvre d'un modèle Event Sourcing avec Kafka permet de capturer toutes les transactions et événements importants, ce qui facilite la correction d'éventuelles incohérences ou erreurs.

**Analyse des données par les caissiers ralentissant le traitement des transactions :**

***Solution théorique :***
En peut mettre en œuvre un système de traitement asynchrone pour la gestion des transactions. Les caissiers soumettent les transactions, mais ne doivent pas attendre la fin du traitement.

***Solution pratique :*** 
Utilisez Spring Cloud Task pour définir et exécuter des tâches asynchrones. Les caissiers soumettent les transactions à une file d'attente, et un ensemble de travailleurs les traitent en arrière-plan.

**Goulot d’étranglement et lenteurs aux heures de pic :**

***Solution théorique :*** 
Répartissez la charge entre les microservices en utilisant un service de passerelle (API Gateway) qui utilise des algorithmes d'équilibrage de charge.

***Solution pratique :*** 
Utilisez Spring Cloud Gateway comme API Gateway pour répartir la charge entre les microservices. Nous avons également configurer les règles d'équilibrage de charge pour optimiser la distribution de la charge.

**Disponibilité de 99,999% :**

***Solution théorique :*** 
Nous avons conçu l'architecture de microservices avec la redondance et la tolérance aux pannes à l'esprit.

***Solution pratique :*** 
L'utilisation des Kubernetes pour gérer les microservices avec une haute disponibilité.

**Server Eureka**

![image](https://github.com/Cherrate96/TP_ADAM_AYOUB/assets/48411889/14bbc750-5fec-4145-98a7-e92f5b518444)

