# Game service 
This is the micro service that handles all calls directly associated with the Game entity. It contains the standard GET, PUT, POST and delete methods. It also contains different sorts of methods, e.g find a game by its id, find a game containing a certain string and etc.

## Context
The Esports wiki allows you to find every bit of information about the games, teams, tournaments and players that are involved in Esports. You can look at them in detail, add, delete or even edit them. This way you can keep your own database about your favorite esports game / team.

## Installation
* Clone our project (git clone https://github.com/AliKiyak/gameservice.git)

## Usage
Run the project and make sure that the ZuulGateway, Eureka Server, Edge service and the other microservices are all running.

## Client
This is a school project made for the course Java Advanced Topipcs

## Authors and acknowledgment
* Ali Kiyak (AliKiyak)
* Bosz Srisan (BoszS)
* René Vanhoof (VanhoofR)
* Chris Tophe (Christophe195)

## Associations
The game-service has associations with the **Team and Tournament** microservices. So make sure that these are running aswell.
