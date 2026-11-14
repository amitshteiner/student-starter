 Design explanation prompts 
הבדיקה שהאוייב הובס מתנהלת כך: 
אם הוא הובס פונקציית הקרב מחזירה true לאחר מכן הפונקצייה הראשית בודקת אם הוחזר true ואם כן היא מציעה פרס.
את בדיקת מקסימום ה- hp פונקציית heal דואגת לכי היא מחזירה את המינימום של hp + i ו-100 מה שמבטיח שה- hp לא יחצה את 100 לעולם.
בדיקת פרס שני נמנעת כי יש קריאה אחת בלבד לפונקציית reward שנותנת לבחור אחד וברגע שאחד תקני הוגש היא מסיימת את עבודתה.
כשהמשתמש מכניס ערך לא תקין כפרס הפונקציה קוראת לעצמה שוב ברקורסיה (מה שגורם לו להצטרך לבחור שוב) ועד שהוא לא בוחר ערך תקין הוא תקוע ברקורסיה.
בקוד power משנה רק את הattack הבסיסי ולא את special כי השינוי שהעברנו משנה שדה של p שעליו אנחנו עושים attack אבל special לא משתמש בשדה ותמיד קורא ל-15 בtake_damage.
AI reflection

הצעה שקיבלתי: ה-ai ייעץ לי לממש את בחירת הreward בעזרת enum (לפני זה מימשתי זאת אחרת) קיבלתי את ההצעה ומימשתי כך.
הצעה שלא קיבלתי: ה ai חשב שיהיה עדיף שאחד החוזים יהיה post ולא invariant אבל בגלל שמדובר על משהו כללי ולא רק שמוחזר הפכתי את זה ל- invariant ודחיתי את ההצעה. 
הצעה שבדקתי: הקוד שלי פותר בעייה של קלט לא תקין עם רקורסייה ה-ai אמר שהלוגיקה לא תעבוד מעל פעם אחת לאחר שבדקתי שהיא עובדת לא לקחתי אותה.
  
 
3 · Required acceptance tests 
T1:
your hp: 90 ,enemy hp:0 ,res points: 5 ,defence: false
You win! 1/2
choose your reward!: recovery or power
choose your reward: recovery or powerrecovery
You chose recovery!
Encounter 2
your hp: 100 ,enemy hp:45 ,res points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 100 ,enemy hp:35 ,res points: 5 ,defence: false

T2:
your hp: 100 ,enemy hp:0 ,res points: 5 ,defence: false
You win! 1/2
choose your reward!: recovery or power
choose your reward: recovery or powerrecovery
You chose recovery!
Encounter 2
your hp: 100 ,enemy hp:45 ,res points: 5 ,defence: false

T3:

your hp: 80 ,enemy hp:10 ,rec points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 80 ,enemy hp:0 ,res points: 5 ,defence: false
You win! 1/2
choose your reward!: recovery or power
choose your reward: recovery or powerpower
You chose power!
Encounter 2
your hp: 80 ,enemy hp:45 ,res points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 80 ,enemy hp:33 ,res points: 5 ,defence: false
Counter attack
your hp: 70 ,enemy hp:33 ,rec points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
3
Special
your hp: 70 ,enemy hp:18 ,res points: 2 ,defence: false

T4:

You win! 1/2
choose your reward!: recovery or power
123
invalid choice try again
choose your reward!: recovery or power
power
You chose power!
Encounter 2

T5:

הערה: לפי הלוגיקה שאני יצרתי אין דרך לבקש פרס בכלל הוא מגיע אליך בסוף הקרב.
T6:
הערה דומה: ברגע שבחרת אחד אי אפשר שוב הפונקצייה מסיימת לכן אין דרך בכלל.
T7:

your hp: 0 ,enemy hp:30 ,rec points: 5 ,defence: false
You lose! 1/2
וכאן נגמרת התוכנית.
T8:

your hp: 80 ,enemy hp:0 ,res points: 2 ,defence: false
You win! 1/2
choose your reward!: recovery or power
power
You chose power!
Encounter 2
your hp: 80 ,enemy hp:45 ,res points: 2 ,defence: false

T9:

your hp: 50 ,enemy hp:9 ,rec points: 2 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 50 ,enemy hp:0 ,res points: 2 ,defence: false
you have won 2!, victory
והקוד נגמר כאן



power:

your hp: 80 ,enemy hp:0 ,res points: 5 ,defence: false
You win! 1/2
choose your reward!: recovery or power
power
You chose power!
Encounter 2
your hp: 80 ,enemy hp:45 ,res points: 5 ,defence: false
Choose your action: 
1. Attack
2. Defend
3. Special
4. Recover
1
Attack
your hp: 80 ,enemy hp:33 ,res points: 5 ,defence: false

Recovery:

your hp: 80 ,enemy hp:0 ,res points: 5 ,defence: false
You win! 1/2
choose your reward!: recovery or power
recovery
You chose recovery!
Encounter 2
your hp: 100 ,enemy hp:45 ,res points: 5 ,defence: false







