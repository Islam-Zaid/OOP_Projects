package com.mycompany.nameid;

import java.util.Random;


public class NameID {
    //فنكشن لإيجاد اقل مسافة ما بين السترينج العشوائية والااسم الرقم الجامعي
    public static int levenshteinDistance(String word1, String word2)
    {  //تعريف متغيرات تساوي طول السترينجس
       int q = word1.length();
        int a = word2.length();
        if (q == 0) return a;
        if (a == 0) return q;
        //تعريف متغيرات تساعدنا بترجمة طريقة ليفاندش ديستنس
        int rightup = 0;
        int rightdown=0;
        int leftup;
        int leftdown=0;
      /*تنص طريقة ليفاندش ديستنس على ايجاد اقصر مسافة بين السترينجين اي اقل عمليات تبديل وحذف وإضافة 
        الى أحدهما فهناك طريقة لمعرفتها بواسطة جدول بسيط الفكرة ينص على تتبع المربعات الرباعية بحكمة
        فيجب عمل مقارنة مع كل حرف من السترينج الأول مع جميع حروف السترينج الثاني فإذا كان الحرفان متشابهان
        نضع القيمة المخزنة بالمربع الرباعي بالخانة العلوية اليسرى مكان المنطقة المجهولة  الا وهي المنطقة السفلية اليمنى
        واذا اختلفتا القيمتان نبحث عن اقل قيمة بالمربع الرباعي ونزيد عليه رقم واحد وبهذا الترتيب والدقة نحصل على 
        اخر خانة بالجدول على قيمة اقل مسافة بين السترينجين
        */
        for (int i = 1; i <= q; i++) 
        {
            leftup = i - 1;
            
            for (int j = 1; j <= a; j++) 
            {
               /*اذا كان الكاراكتر من السترينج الاول مطابق للكاركتر للسترينج   
             الثاني نضع القيمة المجهولة نفس القيمة العلوية اليسرى منالمربع   */  
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) 
                {
                    rightdown = leftup;
                    
                } 
                /*اذا اختلفتا قيمتي الكاراكتر فيجب البحث عن اقل قيمة بين المربع واضافة رقم واحدج الى القيمة الصغرى 
                ووضعها بالخانة المانسبة
                */
                
                else
                {
                    rightdown = Math.min(rightup, Math.min(leftup, leftdown))+1;
                }
                leftdown=rightdown;
                 if(j==i)
                 {
                     rightup=rightdown;
                 }
                leftup = rightup;
            }
            
        }
        
       return rightdown;
        
    }
   
    
  
    public static String generateRandomString(int length)  
    {
        StringBuilder x = new StringBuilder(length); 
        Random random = new Random();

        for (int i = 0; i < length; i++) 
        {
           
            char randomChar;
            if (random.nextBoolean()) 
            { 
                randomChar = (char) (random.nextInt(26) + 'a');
            }
           
            else 
            {
                randomChar = (char) (random.nextInt(10) + '0');
            }
            x.append(randomChar);
        }

        return x.toString();
    }
    
    public static void main(String[] args) 
    {
     
        String nameid ="i2s0l2a3m1z0a2i0d0";//تعريف ستريج للاسم الرقم الجامعي
        //تعريف عشر سترينجات واسناد لهم قيمة عشوائية من خلال استدعاء فنكشن 
        String FirstString =  generateRandomString(18);
        String SecondString =  generateRandomString(18);
        String ThirdString =  generateRandomString(18);
        String FourthString =  generateRandomString(18);
        String FifthString =  generateRandomString(18);
        String SixthString =  generateRandomString(18);
        String SeventhString =  generateRandomString(18);
        String EighthString =  generateRandomString(18);
        String NinthString=  generateRandomString(18);
        String TenthString=  generateRandomString(18);
        System.out.println("Studant’s name : Islam Esam Adnan Zaid.");//طباعة الاسم
      System.out.println("Studant’s ID : 202310200 ");// طباعة الرقم الجامعي
        System.out.println("The 10 string are :-\n");//طباعة رسالة 
        //طباعة العشر سترينجات
        System.out.println("1) "+FirstString);
        System.out.println("2) "+SecondString);
        System.out.println("3) "+ThirdString);
        System.out.println("4) "+FourthString);
        System.out.println("5) "+FifthString );
        System.out.println("6) "+SixthString );
        System.out.println("7) "+SeventhString);
        System.out.println("8) "+EighthString);
        System.out.println("9) "+NinthString);
        System.out.println("10)"+TenthString+"\n");
        System.out.println("The NameID is "+"'"+nameid+"'");//طباعة الاسم الرقم الجامعي
        System.out.println("The top three closest string to nameid according to levenshteinDistance : \n");//طباعة رسالة
        //تعريف متغيرات لاسناد قيمة المسافة لكل سترينج
        int num2=  levenshteinDistance(nameid,FirstString); 
        int num3=  levenshteinDistance(nameid,SecondString);
        int num4=  levenshteinDistance(nameid,ThirdString);
        int num5=  levenshteinDistance(nameid,FourthString);
        int num6=  levenshteinDistance(nameid,FifthString);
        int num7=  levenshteinDistance(nameid,SixthString );
        int num8=  levenshteinDistance(nameid,SeventhString);
        int num9=  levenshteinDistance(nameid,EighthString);
        int num10= levenshteinDistance(nameid,NinthString); 
        int num11= levenshteinDistance(nameid,TenthString);
        int same=-1,threestring=0;
      while(same<=18)//جملة وايل هدفها السماح بتشغيلها عدد مرات اقل مسافة بين السترينج الاقصر من حيث المسافة والرقم الاسم 
          {
              
                   
               same++;
              //مجموعة من الاف الشرطية اذا كانت المسافة تساوي عدد معين من تكرار جملة الوايل تنفذ ما بداخلها
              //ما بداخل الاف يتم طباعة السترينج الاقصر ومع ذلك يطبع فقط اقل ثلاث مسافات 
              if(num2==same)
              {
                  System.out.println(FirstString+" DISTANCE IS "+num2);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num3==same)
              {
                  System.out.println(SecondString+"  DISTANCE IS "+num3);
                 threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num4==same)
              {
                  System.out.println(ThirdString+"  DISTANCE IS "+num4);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num5==same)
              {
                  System.out.println(FourthString+"  DISTANCE IS "+num5);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num6==same)
              {
                  System.out.println(FifthString+"  DISTANCE IS "+num6);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num7==same)
              {
                  System.out.println(SixthString+"  DISTANCE IS "+num7);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num8==same)
              {
                  System.out.println(SeventhString+"  DISTANCE IS "+num8);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num9==same)
              {
                  System.out.println(EighthString+"  DISTANCE IS "+num9);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
              if(num10==same)
              {
                  System.out.println(NinthString+"  DISTANCE IS "+num10);
                  threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
               if(num11==same)
              {
                  System.out.println(TenthString+"  DISTANCE IS "+num11);
                 threestring++;
                  if(threestring==3)
                  {
                      break;
                  }
              }
               }
            
        
       }
    
    } 
   
       
      
       
        
    
