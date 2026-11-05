Design note:
מחלקת השחקן אצלי מקבלת 3 שדות מהמשתמש hp, damage ונקודות resources ושומר עליהם, מלבדם הוא גם שומר על ערכי defence ו alive שמקבלים ערך  דיפולטי של false ו true.
מתודת הקרב מקבלת אליה 2 איברים השחקן והאוייב (שבעזרתם היא עושה פעולות) והיא אחראית להתנהלות וסדר הקרב.
ואפשר להכניס את אותו שחקן לכמה קרבות כי השדות שלו שומרים על הישתנות משהיו בכל פעולה לכן אם נכניס אותו לאובייקט קרב חדש שיכניס אותו למתודה הוא יהיה אותו דבר עם אותם סטטים.
ובחרתי לא להשאיר ערך דיפולטי בdamage של השחקן או להפוך אותו למשתנה סטטי אלא לקבלו כי אני יודע שזה כנראה יוכל להשתנות בעתיד ורציתי להיות יכול לשנות בקלות.

3 · Acceptance tests 
את כל ההרצות שביקשו להראות נקח מתוך הרצות של המשחק אך נדביק רק את החלק המבוקש.
T1 / W02-OBJ-01;
Encounter 1
your hp: 100 ,enemy hp:30 ,res points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 100 ,enemy hp:20 ,res points: 5 ,defence: false

Encounter 2
your hp: 80 ,enemy hp:45 ,res points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 80 ,enemy hp:35 ,res points: 5 ,defence: false

T2 / W02-ENC-01:

your hp: 80 ,enemy hp:0 ,res points: 2 ,defence: false
You win! 1/2
Encounter 2
your hp: 80 ,enemy hp:45 ,res points: 2 ,defence: false



T3 / W02-ENC-02:

your hp: 80 ,enemy hp:0 ,res points: 2 ,defence: false
You win! 1/2
Encounter 2
your hp: 80 ,enemy hp:45 ,res points: 2 ,defence: false

T4 / W02-ENC-03;

your hp: 90 ,enemy hp:0 ,res points: 5 ,defence: true
You win! 1/2
Encounter 2
your hp: 90 ,enemy hp:45 ,res points: 5 ,defence: false
Choose your action: 
1. Attack 
2. Defend 
3. Special 
4. Recover 
1 
Attack 
your hp: 90 ,enemy hp:35 ,res points: 5 ,defence: false 
Counter attack 
your hp: 80 ,enemy hp:35 ,rec points: 5 ,defence: false

T5 / W01-INV-01:

your hp: 90 ,enemy hp:15 ,rec points: 2 ,defence: false
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
 
T6 / W01-END;

your hp: 40 ,enemy hp:0 ,res points: 5 ,defence: false
you have won 2!, victory
כאן המשחק נגמר
T7 / TERM;

your hp: 0 ,enemy hp:30 ,rec points: 10 ,defence: false
You lose! ½
הרצה:

Encounter 1
your hp: 100 ,enemy hp:30 ,res points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 100 ,enemy hp:20 ,res points: 5 ,defence: false
Counter attack
your hp: 90 ,enemy hp:20 ,rec points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 90 ,enemy hp:20 ,res points: 5 ,defence: true
Counter attack
your hp: 85 ,enemy hp:20 ,rec points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
Special
your hp: 85 ,enemy hp:5 ,res points: 2 ,defence: false
Counter attack
your hp: 75 ,enemy hp:5 ,rec points: 2 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 75 ,enemy hp:5 ,res points: 5 ,defence: false
Counter attack
your hp: 65 ,enemy hp:5 ,rec points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 65 ,enemy hp:0 ,res points: 5 ,defence: false
You win! 1/2
Encounter 2
your hp: 65 ,enemy hp:45 ,res points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
Special
your hp: 65 ,enemy hp:30 ,res points: 2 ,defence: false
Counter attack
your hp: 55 ,enemy hp:30 ,rec points: 2 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
2
Defence
your hp: 55 ,enemy hp:30 ,res points: 2 ,defence: true
Counter attack
your hp: 50 ,enemy hp:30 ,rec points: 2 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 50 ,enemy hp:20 ,res points: 2 ,defence: false
Counter attack
your hp: 40 ,enemy hp:20 ,rec points: 2 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
4
Recover
your hp: 40 ,enemy hp:20 ,res points: 5 ,defence: false
Counter attack
your hp: 30 ,enemy hp:20 ,rec points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 30 ,enemy hp:10 ,res points: 5 ,defence: false
Counter attack
your hp: 20 ,enemy hp:10 ,rec points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 20 ,enemy hp:0 ,res points: 5 ,defence: false
you have won 2!, victory

וכאן המשחק נגמר
 5 · AI review assignment 

הAI הציע שאני אוסיף break לאחד התנאים ב switch דבר שהיה במקרים מיוחדים מקריס לכן הוספתי.
הAI הציע שאני אוריד setter מסויים לאחר שבדקתי וראיתי שהוא חיוני לגישה מבחוץ דחיתי.
ה AI הציע שאני אעיף שורת return בסוף הקוד לאחר שבדקתי את כל המצבים שמובילים לשם וראיתי שהיא לא מפריעה החלטתי להשאירה.

