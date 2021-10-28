**Installation**

Question 2)
 Cest librairies permettent de code en mode TDD.

**Fake it**

Question 5) les duplication sont au niveau des méthodes lorsque l'on doit adapter nos tests, il faut passer par une etape intermerdiaire pour garantir le bon focntionnement des anciens tests même avec la nouvelle versions.

**Triangulation**

Non il n'est pas possible de faire un test avec une seule des deux methodes car AddTranslation aura besoin d'appeler getTranslation pour verifier le contenu du dictionnaire et get translation ne serait pas pertinant si le dictionnaire etait vide (en effet il est reinitialisé entre chaque test, il faut donc appeler addTranslation()).


**Traduction multiple**

Pour la traduction multiple, je propose de modifier la classe Dictionnaire et de la definir avec un attrivut Map<String, List<String>> au lieu de Map<String, String> ce qui nous permetterais de gerer les differentes traductions dans la deuxieme langue.

https://github.com/illiona2000/TP_Tdd.git