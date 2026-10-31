# Java & OOP Adventure — Student Starter

**Start with your own design.** The files here deliberately do not contain a game engine, combatant hierarchy, future rules, or an instructor solution.

Prerequisites: JDK 25, Maven, Git, terminal/IDE.

```bash
java -version
mvn test
mvn exec:java -Dexec.mainClass=edu.starter.Main
```

If the Maven exec plugin is unavailable, compile the starter directly:

```bash
mkdir -p build
javac -d build src/main/java/edu/starter/*.java
java -cp build edu.starter.Main
אפשר להריץ דרך בחירת Main.java בide ולהריץ דרך הטרמינל או דרך כפתור ההרצה.
```עיצוב הקוד
בשלב זה של המשחק ההחלטה הכי גדולה שקיבלתי לדעתי זה לחלק את כל הקוד ל-3 מחלקות ושכל אחת אחראית על משהו אחר.
מחלקה מספר אחת (ה-Main) זה התנהלות המשחק המשחק מתחיל להריץ מהmain שלה, הפונקצייה היחידה שיש שם כרגע מלבד main זה פונקציית fight שעוברת בלולאה על כל הבחירות וההתקפות מחזירה true אם ניצחת ו false אם הפסדת.

2 המחלקות האחרות הן enemy ו player, שמכילות את כל היכולות והשדות של כל אחד.
כרגע כל מה שיש ל enemy יש גם ל player (אבל שהמשחק ישתדרג זה כנראה יישתנה).

ההחלטה לחלק להרבה מחלקות נבעה מיכולת יותר קלה למצוא ולגשת לכל פונקצייה (אפשר למצוא לפי מחלקה) היכולת להגדיר שדות זההים לכמה איברים, והעובדה שאני יכול להגדיר פונקצייות לכל אחד מהם יותר בחופשיות.

1. Functional requirements 
R04. נבדוק 5 מקרים ונחזיר את הטרמינל לראות מה קרה:
א נבחר attack כל הזמן:
your hp: 100 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 100 ,enemy hp:90 ,rec points: 5
Couanter attack
your hp: 90 ,enemy hp:90 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 90 ,enemy hp:80 ,rec points: 5
Couanter attack
your hp: 80 ,enemy hp:80 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 80 ,enemy hp:70 ,rec points: 5
Couanter attack
your hp: 70 ,enemy hp:70 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 70 ,enemy hp:60 ,rec points: 5
Couanter attack
your hp: 60 ,enemy hp:60 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 60 ,enemy hp:50 ,rec points: 5
Couanter attack
your hp: 50 ,enemy hp:50 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 50 ,enemy hp:40 ,rec points: 5
Couanter attack
your hp: 40 ,enemy hp:40 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 40 ,enemy hp:30 ,rec points: 5
Couanter attack
your hp: 30 ,enemy hp:30 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 30 ,enemy hp:20 ,rec points: 5
Couanter attack
your hp: 20 ,enemy hp:20 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 20 ,enemy hp:10 ,rec points: 5
Couanter attack
your hp: 10 ,enemy hp:10 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 10 ,enemy hp:0 ,rec points: 5
You win!
ב נבחר כל הזמן defence
your hp: 100 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 100 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 95 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 95 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 90 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 90 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 85 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 85 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 80 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 80 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 75 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 75 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 70 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 70 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 65 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 65 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 60 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 60 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 55 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 55 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 50 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 50 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 45 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 45 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 40 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 40 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 35 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 35 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 30 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 30 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 25 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 25 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 20 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 20 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 15 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 15 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 10 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 10 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 5 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 5 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 0 ,enemy hp:100 ,rec points: 5
You lose!
ג נבחר רק recover
your hp: 100 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 100 ,enemy hp:100 ,rec points: 8
Couanter attack
your hp: 90 ,enemy hp:100 ,rec points: 8
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 90 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 80 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 80 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 70 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 70 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 60 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 60 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 50 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 50 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 40 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 40 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 30 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 30 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 20 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 20 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 10 ,enemy hp:100 ,rec points: 10
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 10 ,enemy hp:100 ,rec points: 10
Couanter attack
your hp: 0 ,enemy hp:100 ,rec points: 10
You lose!

ד נבחר רק special ומהרגע שניתקע נבחר רק attack
your hp: 100 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
Special
your hp: 100 ,enemy hp:85 ,rec points: 2
Couanter attack
your hp: 90 ,enemy hp:85 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
not enough rec point choose something else
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 90 ,enemy hp:75 ,rec points: 2
Couanter attack
your hp: 80 ,enemy hp:75 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 80 ,enemy hp:65 ,rec points: 2
Couanter attack
your hp: 70 ,enemy hp:65 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 70 ,enemy hp:55 ,rec points: 2
Couanter attack
your hp: 60 ,enemy hp:55 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 60 ,enemy hp:45 ,rec points: 2
Couanter attack
your hp: 50 ,enemy hp:45 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 50 ,enemy hp:35 ,rec points: 2
Couanter attack
your hp: 40 ,enemy hp:35 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 40 ,enemy hp:25 ,rec points: 2
Couanter attack
your hp: 30 ,enemy hp:25 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 30 ,enemy hp:15 ,rec points: 2
Couanter attack
your hp: 20 ,enemy hp:15 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 20 ,enemy hp:5 ,rec points: 2
Couanter attack
your hp: 10 ,enemy hp:5 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 10 ,enemy hp:0 ,rec points: 2
You win!
ה נבחר special פעם אחת ולאחר הפעם האחת הזאת נבחר רק attack
your hp: 100 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
Special
your hp: 100 ,enemy hp:85 ,rec points: 2
Couanter attack
your hp: 90 ,enemy hp:85 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 90 ,enemy hp:75 ,rec points: 2
Couanter attack
your hp: 80 ,enemy hp:75 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 80 ,enemy hp:65 ,rec points: 2
Couanter attack
your hp: 70 ,enemy hp:65 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 70 ,enemy hp:55 ,rec points: 2
Couanter attack
your hp: 60 ,enemy hp:55 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 60 ,enemy hp:45 ,rec points: 2
Couanter attack
your hp: 50 ,enemy hp:45 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 50 ,enemy hp:35 ,rec points: 2
Couanter attack
your hp: 40 ,enemy hp:35 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 40 ,enemy hp:25 ,rec points: 2
Couanter attack
your hp: 30 ,enemy hp:25 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 30 ,enemy hp:15 ,rec points: 2
Couanter attack
your hp: 20 ,enemy hp:15 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 20 ,enemy hp:5 ,rec points: 2
Couanter attack
your hp: 10 ,enemy hp:5 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 10 ,enemy hp:0 ,rec points: 2
You win!




R05. ההבדלים העיקריים בין python ל java: בניגוד ל python שמשתמש ב interpreter מפרש שורה שורה.
לעומת זאת java קודם כל מקמפלת את הקוד בתוכנה אחידה לקובץ בייטים, ואז מתשמשת בתוכנה בשם jvm להריץ את זה ששונה בכל מערכת הפעלה ומריצה את הקוד.
בטיפוסים python אפשר להגדיר בלי מגבלה ולשנות משתנה בחופשיות, לעומת זאת ב java חייבים להגדיר מראש את סוג המשתנה ואי אפשר לשנות אותו לסוג אחר.
בנקודת התחלה python קורא את הקוד לפי הסדר ומריץ לעומתו java מתחילה מנקודה של פונקציית ה main של המחלקה שהגדרנו public בקוד.
2. Test and acceptance criteria 
בסעיף זה נקח את ההרצות מההרצה של סעיף שעבר ונקח רק את החלק הרלוונטי מהקוד.
W01-ATK-01: 
your hp: 30 ,enemy hp:30 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 30 ,enemy hp:20 ,rec points: 5

W01-DEF-01: 
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 10 ,enemy hp:100 ,rec points: 5
Couanter attack
your hp: 5 ,enemy hp:100 ,rec points: 5

W01-SPC-01: 
your hp: 100 ,enemy hp:100 ,rec points: 5
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
Special
your hp: 100 ,enemy hp:85 ,rec points: 2

W01-RES-01: 
your hp: 80 ,enemy hp:100 ,rec points: 9
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 80 ,enemy hp:100 ,rec points: 10


W01-INV-01: 

your hp: 90 ,enemy hp:85 ,rec points: 2
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
not enough rec point choose something else
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover

3. Engineering quality and AI task 
הצעה 1: בהגדרת הcases של ה switch הai זיהה שלא היה break; באחד התנאים מה שגרם לזליגה וכל פעם attack הופעל גם defend הופעל לאחר בדיקה ואימות הוחלט לקבל את ההוספה.
הצעה 2: במשחק הגדרתי כל פעם שהקלט ל choose לא תקין פונקצייה רקורסיבית קוראת לו שוב וכך זה ימשיך עד קלט תקין, הai רצה לשנות זאת כי אחרי אלפי הרצות עם קלט לא תקין זה יכול להיות פחות יעיל, החלטתי לדחות את זה כי הפתרון שהוצא לזה היה הרבה יותר מסובך ויותר שורות וגם ה downside היחיד היה במקרה קצה שאף אדם לא יכול להגיע אליו.


Choose one theme: Fantasy Dungeon, Space Skirmish, Robot Arena or Creature Tournament.
Read the workshop PDF for the current week and maintain one evolving Git repository all semester.

Utilities: `ConsoleChoice.read()` for safe numeric input, `Checks.that()` and `Checks.within()` for early tests. There are no hidden future requirements in this kit.
