


<h1>Лабораторна робота №1</h1>
<h3>Тема: Класи та об'єкти</h3>
<h3>Завдання:</h3>
<p>Створити клас GameAccount.<br>
  Клас має обов’язково мати поля:
  <ul>
    <li>UserName – Імя користувача</li>
    <li>CurrentRating – Рейтинг користувача</li>
    <li>GamesCount – Кількість зіграних партій</li>
  </ul>
Клас має мати функції:
  <ul>
    <li>WinGame з полями – функція яка визивається у випадку перемоги
      <ul>
        <li>opponentName – і’мя опонента</li>
        <li>Rating – рейтинг на який була гра</li>
      </ul>
  </li>
        <li>LoseGame з полями – функція яка визивається у випадку поразки
      <ul>
        <li>opponentName – і’мя опонента</li>
        <li>Rating – рейтинг на який була гра</li>
      </ul>
  </li>
    <li>GetStats – функція яка показує історію ігор(Проти кого, перемога чи поразка, на який рейтинг грали, індекс гри)</li>
  </ul>
Додаткові умови:
  <ul>
    <li>Рейтинг не може стати менше 1. </li>
    <li>Рейтинг на який грають не може бути від'ємним(в цьому випадку треба викинути помилку).</li>
    <li>Для гри треба створити окремий клас в йому буде зберігатися потрібна інформація. </li>
    <li>В мейні треба створити 2 об’єкти класу гравця, зробити імітацію декількох ігр та вивести статистику кожного гравця.</li>
  </ul>
</p>
<h3>Опис роботи:</h3>
<h4><a href="#1">GameAccount</a><------><a href="#2">PlayerHistory</a><------><a href="#3">Game</a><------><a href="#4">GameHistory</a><------><a href="#5">GameOutcome</a><------><a href="#6">Program</a><------><a href="#7">Screenshots</a></h4>
<p>
У цій програмі реалізовані такі класи:
    <ul>
    <li>GameAccount</li>
    <li>PlayerHistory</li>
    <li>Game</li>
    <li>GameHistory</li>
    <li>Program</li>
  </ul>
Також реалізовано enum:
    <ul>
    <li>GameResult</li>
  </ul>
</p>

<h3 id="1">----------GameAccount----------</h3>

<p>
  Цей клас реалізовано, для створення нового акаунту у грі.<br>
  У цьому класі доступні такі поля:
</p>

```java
        public string UserName { get; }
        
        public int CurrentRating { get; private set; } = 1;
        
        private List<PlayerHistory> Results { get; }
```

<ul>
  <li>UserName - ім'я гравця</li>
  <li>CurrentRating - поточний рейтинг</li>
  <li>Results - список історії ігор гравця</li>

</ul>

<p><br>У конструктор передається ім'я гравця</p>

```java
public GameAccount(string userName)
```
<p>
  <br>У цьому класі реалізовано такі методи:
</p>

```java
        public void InformationForPlayer()
        
        public void GetStats()
        
        public void WinGame(string namegame,string id, int rating, GameAccount player)

        public void LoseGame(string namegame,string id, int rating, GameAccount player)

        public void TieGame(string namegame,string id, int rating, GameAccount player)

```

<ul>
  <li>InformationForPlayer() - метод який виводить інформацію про гравця</li>
  <li>GetStats() - метод який виводить історію ігор</li>
  <li>WinGame() - метод який викликається у разі перемоги ігор</li>
  <li>LoseGame() - метод який викликається у разі поразки</li>
  <li>TieGame() - метод який викликається у разі нічиї</li>
</ul><br>


<h3 id="2">----------PlayerHistory----------</h3>
  <p>
  Цей клас реалізовано, для зберігання історії гри для гравця.<br>
  У цьому класі доступні такі поля:
</p>
  
  ```java
        public static int Number = 1;

        public string NameGame { get; }

        public string Id { get; }

        public int Rating { get; }

        public GameOutcome Outcome { get; }

        public GameAccount Oponent { get; }

        public int BeforeRating { get; }

        public int AfterRating { get; }
        
  ```
  
  <ul>
  <li>Number - змінна для нумерування гри по порядку</li>
  <li>NameGame - назва гри</li>
  <li>Id - ідентифікатор гри </li>
  <li>Rating - рейтинг гри</li>
  <li>Outcome - результат гри</li>
  <li>Oponent - опонент</li>
  <li>BeforeRating - рейтинг до гри</li>
  <li>AfterRating - рейтинг після гри</li>

</ul><br>

<h3 id="3">----------Game----------</h3>

<p>
  Цей клас реалізовано, для створення нової гри.<br>
  У цьому класі доступні такі поля:
</p>

```java
        private string NameGame { get; }
        private List<GameHistory> Results { get; }
        private Dictionary<GameAccount, int> Players { get; }
```

<ul>
  <li>NameGame - назва гри</li>
  <li>Results - список історії ігор </li>
  <li>Players - словник із гравцями та їхними поточними рейтингами</li>
</ul>


<p><br>У конструктор передається ім'я гравця</p>

```java
public Game(string nameGame)
```

<p>
  <br>У цьому класі реалізовано такі методи:
</p>

```java
        
        public void Information() 
        
        public void Top3() 
        
        public void PlayingGame(GameAccount player1, GameAccount player2, int rating) 

        private void AddPlayersToTop(GameAccount player)

```

<ul>
  <li>Information() - метод який виводить інформацію про гру та історію ігор</li>
  <li>Top3() - метод який виводить топ 3 гравця у цій грі</li>
  <li>PlayingGame() - метод який запускає гру та рандомно визначає переможця</li>
  <li>AddPlayersToTop() - метод який додає нового гравця до словника, а у випадку якщо гравець вже є у цьому словнику оновлює його дані</li>
  
</ul><br>

<h3 id="4">----------GameHistory----------</h3>

<p>
  Цей клас реалізовано, для зберігання історії гри.<br>
  У цьому класі доступні такі поля:
</p>
  
  ```java
        public string Id { get; }

        public GameAccount Player1 { get; }

        public GameAccount Player2 { get; }

        public int Rating { get; }

        public GameOutcome Outcome { get; }
        
  ```
  
  <ul>
  <li>Id - ідентифікатор гри </li>
  <li>Player1 - перший гравець</li>
  <li>Player2 - другий гравець</li>
  <li>Rating - рейтинг гри</li>
  <li>Outcome - результат гри</li>
</ul><br>


<h3 id="5">----------GameOutcome----------</h3>

<p>
  Цей enum містить у собі усі випадки результату гри.<br>
  Він реалізований таким чином
</p>

```java
    public enum GameOutcome
    {
        WIN,
        LOSE,
        TIE
    }
```

<ul>
  <li>WIN - відповідає за перемогу</li>
  <li>LOSE - відповідає за поразку</li>
  <li>TIE - відповідає за нічию</li>
</ul><br>

<h3 id="6">----------Program----------</h3>

  Це головний клас, у якому викликається метод main.<br>
  На початку виводиться ASCII photo
  
```java

            Console.WriteLine("\t\t\t\t        _______         ___         .___  ___.     _______ \n"+
                              "\t\t\t\t       /  _____|       /   \        |   \/   |    |   ____|\n"+
                              "\t\t\t\t      |  |  __        /  ^  \       |  \  /  |    |  |__   \n"+
                              "\t\t\t\t      |  | |_ |      /  /_\  \      |  |\/|  |    |   __|  \n"+
                              "\t\t\t\t      |  |__| |     /  _____  \     |  |  |  |    |  |____ \n"+
                              "\t\t\t\t       \______|    /__/     \__\    |__|  |__|    |_______|\n");
```

Наступним кроком створюється 4 гравця та 1 гра

```java
            GameAccount player1 = new GameAccount("Vlad");
            GameAccount player2 = new GameAccount("Denys");
            GameAccount player3 = new GameAccount("Roma");
            GameAccount player4 = new GameAccount("Maks");
            Game game1 = new Game("Game 1");
```

Тоді за допомогою циклів, кожен гравець грає з іншим гравцем по 3 рази, та за допомогою рандому обирається рейтинг гри

```java
            for (int i = 0; i < 3; i++)
            {
                game1.PlayingGame(player1, player2, rnd.Next(2, 6));
                game1.PlayingGame(player3, player4, rnd.Next(2, 6));
            }
            
            for (int i = 0; i < 3; i++)
            {
                game1.PlayingGame(player1, player3, rnd.Next(2, 6));
                game1.PlayingGame(player2, player4, rnd.Next(2, 6));
            }

            for (int i = 0; i < 3; i++)
            {
                game1.PlayingGame(player4, player1, rnd.Next(2, 6));
                game1.PlayingGame(player3, player2, rnd.Next(2, 6));
            }
```

Після закінчення генерації ігор виводиться інформація та історія ігор для кожного **гравця**, та інформація та топ3 для **гри**

```java
            player1.InformationForPlayer();
            player1.GetStats();

            player2.InformationForPlayer();
            player2.GetStats();

            player3.InformationForPlayer();
            player3.GetStats();

            player4.InformationForPlayer();
            player4.GetStats();

            game1.Information();
            game1.Top3();
```


<h3 id="7">---------Screenshots---------</h3>

<img src="https://github.com/karkuh/KPI_works/blob/master/3_sem/object_oriented_programming/Works/Lab1/screenshots/1.jpg">
<img src="https://github.com/karkuh/KPI_works/blob/master/3_sem/object_oriented_programming/Works/Lab1/screenshots/2.jpg">
<img src="https://github.com/karkuh/KPI_works/blob/master/3_sem/object_oriented_programming/Works/Lab1/screenshots/3.jpg">
<img src="https://github.com/karkuh/KPI_works/blob/master/3_sem/object_oriented_programming/Works/Lab1/screenshots/4.jpg">
<img src="https://github.com/karkuh/KPI_works/blob/master/3_sem/object_oriented_programming/Works/Lab1/screenshots/5.jpg">
<img src="https://github.com/karkuh/KPI_works/blob/master/3_sem/object_oriented_programming/Works/Lab1/screenshots/6.jpg">
